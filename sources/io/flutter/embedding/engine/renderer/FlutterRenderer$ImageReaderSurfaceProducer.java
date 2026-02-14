package io.flutter.embedding.engine.renderer;

import D.C0002c;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;
import io.flutter.view.p;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, o {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 6;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    private p callback;
    private boolean createNewReader = true;
    private final long id;
    private boolean ignoringFence = VERBOSE_LOGS;
    private final ArrayDeque<g> imageReaderQueue = new ArrayDeque<>();
    private long lastDequeueTime = 0;
    private ArrayList<e> lastDequeuedImage = new ArrayList<>();
    private long lastQueueTime = 0;
    /* access modifiers changed from: private */
    public g lastReaderDequeuedFrom = null;
    private long lastScheduleTime = 0;
    private final Object lock = new Object();
    /* access modifiers changed from: private */
    public boolean notifiedDestroy = VERBOSE_LOGS;
    private int numTrims = 0;
    private final HashMap<ImageReader, g> perImageReaders = new HashMap<>();
    /* access modifiers changed from: private */
    public boolean released;
    private int requestedHeight = 1;
    private int requestedWidth = 1;
    final /* synthetic */ j this$0;

    public FlutterRenderer$ImageReaderSurfaceProducer(j jVar, long j2) {
        this.this$0 = jVar;
        this.id = j2;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (g next : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == next) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    next.f547c = true;
                    next.f545a.close();
                    next.f546b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<e> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f542a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                g gVar = this.lastReaderDequeuedFrom;
                if (gVar != null) {
                    gVar.f547c = true;
                    gVar.f545a.close();
                    gVar.f546b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } finally {
            }
        }
    }

    private ImageReader createImageReader29() {
        return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256);
    }

    private ImageReader createImageReader33() {
        C0002c.g();
        ImageReader.Builder c2 = C0002c.c(this.requestedWidth, this.requestedHeight);
        c2.setMaxImages(6);
        c2.setImageFormat(34);
        c2.setUsage(256);
        return c2.build();
    }

    private g getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    g peekLast = this.imageReaderQueue.peekLast();
                    if (peekLast.f545a.getSurface().isValid()) {
                        return peekLast;
                    }
                }
                this.createNewReader = VERBOSE_LOGS;
                g orCreatePerImageReader = getOrCreatePerImageReader(createImageReader());
                return orCreatePerImageReader;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private g getOrCreatePerImageReader(ImageReader imageReader) {
        g gVar = this.perImageReaders.get(imageReader);
        if (gVar != null) {
            return gVar;
        }
        g createPerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, createPerImageReader);
        this.imageReaderQueue.add(createPerImageReader);
        return createPerImageReader;
    }

    /* access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (!this.released) {
            this.this$0.f568a.scheduleFrame();
        }
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        HashSet hashSet = this.this$0.f572e;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == this) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.this$0.f573f.remove(this);
    }

    private void waitOnFence(Image image) {
        try {
            image.getFence().awaitForever();
        } catch (IOException unused) {
        }
    }

    public Image acquireLatestImage() {
        e dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.f542a;
        maybeWaitOnFence(image);
        return image;
    }

    public ImageReader createImageReader() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return createImageReader33();
        }
        if (i2 >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public g createPerImageReader(ImageReader imageReader) {
        return new g(this, imageReader);
    }

    public double deltaMillis(long j2) {
        return ((double) j2) / 1000000.0d;
    }

    public e dequeueImage() {
        e eVar;
        boolean z2;
        e eVar2;
        synchronized (this.lock) {
            try {
                Iterator<g> it = this.imageReaderQueue.iterator();
                eVar = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    z2 = VERBOSE_LOGS;
                    if (!hasNext) {
                        break;
                    }
                    g next = it.next();
                    ArrayDeque arrayDeque = next.f546b;
                    if (arrayDeque.isEmpty()) {
                        eVar2 = null;
                    } else {
                        eVar2 = (e) arrayDeque.removeFirst();
                    }
                    if (eVar2 == null) {
                        eVar = eVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > MAX_DEQUEUED_IMAGES) {
                            this.lastDequeuedImage.remove(0).f542a.close();
                        }
                        this.lastDequeuedImage.add(eVar2);
                        this.lastReaderDequeuedFrom = next;
                        eVar = eVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<g> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().f546b.isEmpty()) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.this$0.f571d.post(new d(this));
        }
        return eVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (!this.released) {
                releaseInternal();
                j jVar = this.this$0;
                jVar.f571d.post(new h(this.id, jVar.f568a));
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    public int getHeight() {
        return this.requestedHeight;
    }

    public Surface getSurface() {
        return getActiveReader().f545a.getSurface();
    }

    public int getWidth() {
        return this.requestedWidth;
    }

    public boolean handlesCropAndRotation() {
        return VERBOSE_LOGS;
    }

    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i2;
        synchronized (this.lock) {
            try {
                Iterator<g> it = this.imageReaderQueue.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    i2 += it.next().f546b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public int numTrims() {
        int i2;
        synchronized (this.lock) {
            i2 = this.numTrims;
        }
        return i2;
    }

    public void onImage(ImageReader imageReader, Image image) {
        e eVar;
        synchronized (this.lock) {
            g orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f547c) {
                eVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f548d;
                System.nanoTime();
                e eVar2 = new e(flutterRenderer$ImageReaderSurfaceProducer, image);
                ArrayDeque arrayDeque = orCreatePerImageReader.f546b;
                arrayDeque.add(eVar2);
                while (arrayDeque.size() > MAX_DEQUEUED_IMAGES) {
                    ((e) arrayDeque.removeFirst()).f542a.close();
                }
                eVar = eVar2;
            }
        }
        if (eVar != null) {
            this.this$0.f568a.scheduleFrame();
        }
    }

    public void onTrimMemory(int i2) {
        if (i2 >= 40) {
            synchronized (this.lock) {
                this.numTrims++;
            }
            cleanup();
            this.createNewReader = true;
        }
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        g peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ArrayDeque arrayDeque = peekFirst.f546b;
            if (arrayDeque.isEmpty() && peekFirst.f548d.lastReaderDequeuedFrom != peekFirst) {
                this.imageReaderQueue.removeFirst();
                HashMap<ImageReader, g> hashMap = this.perImageReaders;
                ImageReader imageReader = peekFirst.f545a;
                hashMap.remove(imageReader);
                peekFirst.f547c = true;
                imageReader.close();
                arrayDeque.clear();
            } else {
                return;
            }
        }
    }

    public void release() {
        if (!this.released) {
            releaseInternal();
            j jVar = this.this$0;
            jVar.f568a.unregisterTexture(this.id);
        }
    }

    public void scheduleFrame() {
        this.this$0.f568a.scheduleFrame();
    }

    public void setCallback(p pVar) {
    }

    public void setSize(int i2, int i3) {
        int max = Math.max(1, i2);
        int max2 = Math.max(1, i3);
        if (this.requestedWidth != max || this.requestedHeight != max2) {
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }
}
