package io.flutter.embedding.engine;

import D.C0010k;
import D.C0012m;
import D.w;
import D.x;
import E.b;
import E.l;
import E.m;
import F.f;
import G.a;
import H.c;
import M.e;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.d;
import io.flutter.view.r;
import io.flutter.view.s;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static m asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private l accessibilityDelegate;
    private a deferredComponentManager;
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<k> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private N.a localizationPlugin;
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativeShellHolderId;
    private F.k platformMessageHandler;
    private j platformViewsController;
    private i platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    private static void asyncWaitForVsync(long j2) {
        m mVar = asyncWaitForVsyncDelegate;
        if (mVar != null) {
            io.flutter.view.a aVar = (io.flutter.view.a) mVar;
            aVar.getClass();
            Choreographer instance = Choreographer.getInstance();
            s sVar = (s) aVar.f688a;
            r rVar = sVar.f809c;
            if (rVar != null) {
                rVar.f803a = j2;
                sVar.f809c = null;
            } else {
                rVar = new r(sVar, j2);
            }
            instance.postFrameCallback(rVar);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j2) {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new E.k(j2));
        } catch (IOException e2) {
            Log.e(TAG, "Failed to decode image", e2);
            return null;
        }
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() != this.mainLooper) {
            throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
        }
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i2, ByteBuffer byteBuffer) {
        e eVar;
        F.k kVar = this.platformMessageHandler;
        if (kVar != null && (eVar = (e) ((F.j) kVar).f219g.remove(Integer.valueOf(i2))) != null) {
            try {
                eVar.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e2) {
                Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e2);
            } catch (Error e3) {
                Thread currentThread = Thread.currentThread();
                if (currentThread.getUncaughtExceptionHandler() != null) {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e3);
                    return;
                }
                throw e3;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$1(long j2, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named unused = ColorSpace.Named.SRGB;
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size f2 = imageInfo.getSize();
        nativeImageHeaderCallback(j2, f2.getWidth(), f2.getHeight());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j2);

    private native void nativeDeferredComponentInstallFailure(int i2, String str, boolean z2);

    private native void nativeDestroy(long j2);

    private native void nativeDispatchEmptyPlatformMessage(long j2, String str, int i2);

    private native void nativeDispatchPlatformMessage(long j2, String str, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeDispatchPointerDataPacket(long j2, ByteBuffer byteBuffer, int i2);

    private native void nativeDispatchSemanticsAction(long j2, int i2, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i2);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i2);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i2);

    private native Bitmap nativeGetBitmap(long j2);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j2, int i2, int i3);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j2, int i2);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j2, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j2, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeIsSurfaceControlEnabled(long j2);

    private native void nativeLoadDartDeferredLibrary(long j2, int i2, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j2);

    private native void nativeMarkTextureFrameAvailable(long j2, long j3);

    private native void nativeNotifyLowMemoryWarning(long j2);

    private native void nativeOnVsync(long j2, long j3, long j4);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j2, long j3, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z2);

    private native void nativeRegisterTexture(long j2, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3);

    private native void nativeScheduleFrame(long j2);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z2);

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j2, String str, String str2, String str3, List<String> list, long j3);

    private native void nativeSurfaceChanged(long j2, int i2, int i3);

    private native void nativeSurfaceCreated(long j2, Surface surface);

    private native void nativeSurfaceDestroyed(long j2);

    private native void nativeSurfaceWindowChanged(long j2, Surface surface);

    private native void nativeUnregisterTexture(long j2, long j3);

    private native void nativeUpdateDisplayMetrics(long j2);

    private native void nativeUpdateJavaAssetManager(long j2, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f2);

    private void onPreEngineRestart() {
        for (b a2 : this.engineLifecycleListeners) {
            a2.a();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        String str;
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            io.flutter.view.a aVar = (io.flutter.view.a) lVar;
            aVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.k kVar = (io.flutter.view.k) aVar.f688a;
            kVar.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.e a2 = kVar.a(byteBuffer.getInt());
                a2.f716c = byteBuffer.getInt();
                int i2 = byteBuffer.getInt();
                String str2 = null;
                if (i2 == -1) {
                    str = null;
                } else {
                    str = strArr[i2];
                }
                a2.f717d = str;
                int i3 = byteBuffer.getInt();
                if (i3 != -1) {
                    str2 = strArr[i3];
                }
                a2.f718e = str2;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        l lVar = this.accessibilityDelegate;
        if (lVar != null) {
            ((io.flutter.view.a) lVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(kVar);
    }

    public void applyTransactions() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            SurfaceControl.Transaction h2 = C0010k.h();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = iVar.f655i;
                if (i2 < arrayList.size()) {
                    h2 = h2.merge(C0010k.j(arrayList.get(i2)));
                    i2++;
                } else {
                    h2.apply();
                    arrayList.clear();
                    return;
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j2) {
        nativeCleanupMessageData(j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0132, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013c, code lost:
        if (r4.hasNext() == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013e, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0150, code lost:
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0153, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015b, code lost:
        if (r4.hasNext() == false) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015d, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016f, code lost:
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L_0x0157;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] r10) {
        /*
            r9 = this;
            N.a r0 = r9.localizationPlugin
            r1 = 0
            if (r0 != 0) goto L_0x0008
            java.lang.String[] r10 = new java.lang.String[r1]
            return r10
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = r1
        L_0x000e:
            int r3 = r10.length
            if (r2 >= r3) goto L_0x0045
            r3 = r10[r2]
            int r4 = r2 + 1
            r4 = r10[r4]
            int r5 = r2 + 2
            r5 = r10[r5]
            java.util.Locale$Builder r6 = new java.util.Locale$Builder
            r6.<init>()
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x0029
            r6.setLanguage(r3)
        L_0x0029:
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0032
            r6.setRegion(r4)
        L_0x0032:
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x003b
            r6.setScript(r5)
        L_0x003b:
            java.util.Locale r3 = r6.build()
            r0.add(r3)
            int r2 = r2 + 3
            goto L_0x000e
        L_0x0045:
            N.a r10 = r9.localizationPlugin
            r10.getClass()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0053
            r10 = 0
            goto L_0x017b
        L_0x0053:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            D.f r10 = r10.f335b
            if (r2 < r3) goto L_0x0105
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            android.os.LocaleList r10 = r10.getLocales()
            int r3 = r10.size()
            r4 = r1
        L_0x0071:
            if (r4 >= r3) goto L_0x00f5
            java.util.Locale r5 = r10.get(r4)
            java.lang.String r6 = r5.getLanguage()
            java.lang.String r7 = r5.getScript()
            boolean r7 = r7.isEmpty()
            java.lang.String r8 = "-"
            if (r7 != 0) goto L_0x009d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = r5.getScript()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x009d:
            java.lang.String r7 = r5.getCountry()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x00bd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = r5.getCountry()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x00bd:
            java.util.Locale$LanguageRange r6 = D.C0000a.l(r6)
            r2.add(r6)
            D.C0000a.n()
            java.lang.String r6 = r5.getLanguage()
            java.util.Locale$LanguageRange r6 = D.C0000a.l(r6)
            r2.add(r6)
            D.C0000a.n()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getLanguage()
            r6.append(r5)
            java.lang.String r5 = "-*"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.util.Locale$LanguageRange r5 = D.C0000a.l(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x0071
        L_0x00f5:
            java.util.Locale r10 = java.util.Locale.lookup(r2, r0)
            if (r10 == 0) goto L_0x00fd
            goto L_0x017b
        L_0x00fd:
            java.lang.Object r10 = r0.get(r1)
            java.util.Locale r10 = (java.util.Locale) r10
            goto L_0x017b
        L_0x0105:
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            android.os.LocaleList r10 = r10.getLocales()
            r2 = r1
        L_0x0112:
            int r3 = r10.size()
            if (r2 >= r3) goto L_0x0175
            java.util.Locale r3 = r10.get(r2)
            java.util.Iterator r4 = r0.iterator()
        L_0x0120:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0134
            java.lang.Object r5 = r4.next()
            java.util.Locale r5 = (java.util.Locale) r5
            boolean r6 = r3.equals(r5)
            if (r6 == 0) goto L_0x0120
        L_0x0132:
            r10 = r5
            goto L_0x017b
        L_0x0134:
            java.util.Iterator r4 = r0.iterator()
        L_0x0138:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r4.next()
            java.util.Locale r5 = (java.util.Locale) r5
            java.lang.String r6 = r3.getLanguage()
            java.lang.String r7 = r5.toLanguageTag()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0138
            goto L_0x0132
        L_0x0153:
            java.util.Iterator r4 = r0.iterator()
        L_0x0157:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0172
            java.lang.Object r5 = r4.next()
            java.util.Locale r5 = (java.util.Locale) r5
            java.lang.String r6 = r3.getLanguage()
            java.lang.String r7 = r5.getLanguage()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0157
            goto L_0x0132
        L_0x0172:
            int r2 = r2 + 1
            goto L_0x0112
        L_0x0175:
            java.lang.Object r10 = r0.get(r1)
            java.util.Locale r10 = (java.util.Locale) r10
        L_0x017b:
            if (r10 != 0) goto L_0x0180
            java.lang.String[] r10 = new java.lang.String[r1]
            return r10
        L_0x0180:
            java.lang.String r0 = r10.getLanguage()
            java.lang.String r1 = r10.getCountry()
            java.lang.String r10 = r10.getScript()
            java.lang.String[] r10 = new java.lang.String[]{r0, r1, r10}
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [D.m, java.lang.Object, io.flutter.plugin.platform.b] */
    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            ? mVar = new C0012m(jVar.f661c.getContext(), jVar.f661c.getWidth(), jVar.f661c.getHeight(), 2);
            mVar.f635g = jVar.f666h;
            int i2 = jVar.f672o;
            jVar.f672o = i2 + 1;
            jVar.m.put(i2, mVar);
            return new FlutterOverlaySurface(i2, mVar.getSurface());
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            if (iVar.f657k == null) {
                SurfaceControl.Builder g2 = C0010k.g();
                g2.setBufferSize(iVar.f649c.getWidth(), iVar.f649c.getHeight());
                g2.setFormat(1);
                g2.setName("Flutter Overlay Surface");
                g2.setOpaque(false);
                g2.setHidden(false);
                SurfaceControl k2 = g2.build();
                SurfaceControl.Transaction c2 = iVar.f649c.getRootSurfaceControl().buildReparentTransaction(k2);
                c2.setLayer(k2, 1000);
                c2.apply();
                iVar.f657k = C0010k.f(k2);
                iVar.f658l = k2;
            }
            return new FlutterOverlaySurface(0, iVar.f657k);
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public SurfaceControl.Transaction createTransaction() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            SurfaceControl.Transaction h2 = C0010k.h();
            iVar.f655i.add(h2);
            return h2;
        }
        throw new RuntimeException("");
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            Surface surface = iVar.f657k;
            if (surface != null) {
                surface.release();
                iVar.f657k = null;
                iVar.f658l = null;
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            jVar.a();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i2);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i2, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i2, i3);
            return;
        }
        String str2 = str;
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str2 + ". Response ID: " + i3);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i2, d dVar) {
        dispatchSemanticsAction(i2, dVar, (Object) null);
    }

    public void endFrame2() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            SurfaceControl.Transaction h2 = C0010k.h();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = iVar.f656j;
                if (i2 < arrayList.size()) {
                    h2 = h2.merge(C0010k.j(arrayList.get(i2)));
                    i2++;
                } else {
                    arrayList.clear();
                    iVar.f649c.invalidate();
                    iVar.f649c.getRootSurfaceControl().applyTransactionOnDraw(h2);
                    return;
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            C.b r0 = L.n.f299b
            java.lang.Object r1 = r0.f14b
            L.m r1 = (L.m) r1
            java.lang.Object r2 = r0.f13a
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            if (r1 != 0) goto L_0x0014
            java.lang.Object r1 = r2.poll()
            L.m r1 = (L.m) r1
            r0.f14b = r1
        L_0x0014:
            java.lang.Object r1 = r0.f14b
            L.m r1 = (L.m) r1
            if (r1 == 0) goto L_0x0027
            int r3 = r1.f297a
            if (r3 >= r8) goto L_0x0027
            java.lang.Object r1 = r2.poll()
            L.m r1 = (L.m) r1
            r0.f14b = r1
            goto L_0x0014
        L_0x0027:
            r2 = 0
            java.lang.String r3 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r1 != 0) goto L_0x0048
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.append(r1)
            java.lang.String r1 = ", after exhausting the queue."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L_0x0046:
            r1 = r2
            goto L_0x0072
        L_0x0048:
            int r5 = r1.f297a
            if (r5 == r8) goto L_0x0072
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            java.lang.String r3 = ", the oldest config is now: "
            r1.append(r3)
            java.lang.Object r0 = r0.f14b
            L.m r0 = (L.m) r0
            int r0 = r0.f297a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L_0x0046
        L_0x0072:
            if (r1 != 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            android.util.DisplayMetrics r2 = r1.f298b
        L_0x0077:
            if (r2 != 0) goto L_0x0098
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L_0x0098:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            float r8 = r2.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        f fVar;
        boolean z2;
        F.k kVar = this.platformMessageHandler;
        if (kVar != null) {
            F.j jVar = (F.j) kVar;
            synchronized (jVar.f217e) {
                try {
                    fVar = (f) jVar.f215c.get(str);
                    if (!jVar.f218f.get() || fVar != null) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        if (!jVar.f216d.containsKey(str)) {
                            jVar.f216d.put(str, new LinkedList());
                        }
                        ((List) jVar.f216d.get(str)).add(new F.d(j2, byteBuffer, i2));
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (!z2) {
                jVar.b(str, fVar, byteBuffer, i2, j2);
                return;
            }
            return;
        }
        nativeCleanupMessageData(j2);
    }

    public void hideOverlaySurface2() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        } else if (iVar.f658l != null) {
            SurfaceControl.Transaction h2 = C0010k.h();
            h2.setVisibility(iVar.f658l, false);
            h2.apply();
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j2, int i2) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j2, i2);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i2) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i2);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: io.flutter.embedding.engine.FlutterJNI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: io.flutter.embedding.engine.FlutterJNI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: io.flutter.embedding.engine.FlutterJNI} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invokePlatformMessageResponseCallback(int r8, java.nio.ByteBuffer r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: "
            boolean r1 = r9.isDirect()
            if (r1 == 0) goto L_0x0052
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.shellHolderLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.lock()
            boolean r1 = r7.isAttached()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002b
            java.lang.Long r0 = r7.nativeShellHolderId     // Catch:{ all -> 0x0028 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x0028 }
            r1 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            r1.nativeInvokePlatformMessageResponseCallback(r2, r4, r5, r6)     // Catch:{ all -> 0x0025 }
            goto L_0x003e
        L_0x0025:
            r0 = move-exception
        L_0x0026:
            r8 = r0
            goto L_0x0048
        L_0x0028:
            r0 = move-exception
            r1 = r7
            goto L_0x0026
        L_0x002b:
            r1 = r7
            r4 = r8
            java.lang.String r8 = "FlutterJNI"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0025 }
            r9.<init>(r0)     // Catch:{ all -> 0x0025 }
            r9.append(r4)     // Catch:{ all -> 0x0025 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0025 }
            android.util.Log.w(r8, r9)     // Catch:{ all -> 0x0025 }
        L_0x003e:
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r1.shellHolderLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()
            r8.unlock()
            return
        L_0x0048:
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = r1.shellHolderLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r9.readLock()
            r9.unlock()
            throw r8
        L_0x0052:
            r1 = r7
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Expected a direct ByteBuffer."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.invokePlatformMessageResponseCallback(int, java.nio.ByteBuffer, int):void");
    }

    public boolean isAttached() {
        if (this.nativeShellHolderId != null) {
            return true;
        }
        return false;
    }

    public boolean isCodePointEmoji(int i2) {
        return nativeFlutterTextUtilsIsEmoji(i2);
    }

    public boolean isCodePointEmojiModifier(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifier(i2);
    }

    public boolean isCodePointEmojiModifierBase(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i2);
    }

    public boolean isCodePointRegionalIndicator(int i2) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i2);
    }

    public boolean isCodePointVariantSelector(int i2) {
        return nativeFlutterTextUtilsIsVariationSelector(i2);
    }

    public void loadDartDeferredLibrary(int i2, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i2, strArr);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [B.e, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d8 A[SYNTHETIC, Splitter:B:109:0x01d8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadLibrary(android.content.Context r20) {
        /*
            r19 = this;
            r1 = r20
            boolean r0 = loadLibraryCalled
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "FlutterJNI"
            java.lang.String r2 = "FlutterJNI.loadLibrary called more than once"
            android.util.Log.w(r0, r2)
        L_0x000d:
            E.j r0 = new E.j
            r0.<init>()
            B.e r2 = new B.e
            B.b r3 = new B.b
            r4 = 1
            r3.<init>((int) r4)
            B.b r4 = new B.b
            r5 = 0
            r4.<init>((int) r5)
            r2.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r2.f7a = r5
            r2.f8b = r3
            r2.f9c = r4
            r2.f10d = r0
            if (r1 == 0) goto L_0x01e0
            java.lang.String r0 = "Beginning load of %s..."
            java.lang.String r3 = "flutter"
            java.lang.Object[] r4 = new java.lang.Object[]{r3}
            r2.e(r0, r4)
            java.lang.Object r0 = r2.f8b
            r4 = r0
            B.b r4 = (B.b) r4
            java.lang.Object r0 = r2.f7a
            r5 = r0
            java.util.HashSet r5 = (java.util.HashSet) r5
            boolean r0 = r5.contains(r3)
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "%s already loaded previously!"
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            r2.e(r0, r1)
        L_0x0056:
            r18 = 1
            goto L_0x01bc
        L_0x005a:
            r7 = 0
            r4.getClass()     // Catch:{ UnsatisfiedLinkError -> 0x006e }
            java.lang.System.loadLibrary(r3)     // Catch:{ UnsatisfiedLinkError -> 0x006e }
            r5.add(r3)     // Catch:{ UnsatisfiedLinkError -> 0x006e }
            java.lang.String r0 = "%s (%s) was loaded normally!"
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r7}     // Catch:{ UnsatisfiedLinkError -> 0x006e }
            r2.e(r0, r8)     // Catch:{ UnsatisfiedLinkError -> 0x006e }
            goto L_0x0056
        L_0x006e:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r8 = "Loading the library normally failed: %s"
            r2.e(r8, r0)
            java.lang.String r0 = "%s (%s) was not loaded normally, re-linking..."
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r7}
            r2.e(r0, r8)
            java.io.File r0 = r2.d(r1)
            boolean r8 = r0.exists()
            if (r8 == 0) goto L_0x0091
            goto L_0x01a3
        L_0x0091:
            java.lang.String r8 = "lib"
            r9 = 0
            java.io.File r8 = r1.getDir(r8, r9)
            java.io.File r10 = r2.d(r1)
            r4.getClass()
            java.lang.String r11 = java.lang.System.mapLibraryName(r3)
            B.d r12 = new B.d
            r12.<init>(r11)
            java.io.File[] r8 = r8.listFiles(r12)
            if (r8 != 0) goto L_0x00af
            goto L_0x00c9
        L_0x00af:
            int r11 = r8.length
            r12 = r9
        L_0x00b1:
            if (r12 >= r11) goto L_0x00c9
            r13 = r8[r12]
            java.lang.String r14 = r13.getAbsolutePath()
            java.lang.String r15 = r10.getAbsolutePath()
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00c6
            r13.delete()
        L_0x00c6:
            int r12 = r12 + 1
            goto L_0x00b1
        L_0x00c9:
            java.lang.String[] r8 = android.os.Build.SUPPORTED_ABIS
            int r10 = r8.length
            if (r10 <= 0) goto L_0x00cf
            goto L_0x00e7
        L_0x00cf:
            java.lang.String r8 = android.os.Build.CPU_ABI2
            if (r8 == 0) goto L_0x00e1
            int r10 = r8.length()
            if (r10 != 0) goto L_0x00da
            goto L_0x00e1
        L_0x00da:
            java.lang.String r10 = android.os.Build.CPU_ABI
            java.lang.String[] r8 = new java.lang.String[]{r10, r8}
            goto L_0x00e7
        L_0x00e1:
            java.lang.String r8 = android.os.Build.CPU_ABI
            java.lang.String[] r8 = new java.lang.String[]{r8}
        L_0x00e7:
            java.lang.String r10 = java.lang.System.mapLibraryName(r3)
            java.lang.Object r11 = r2.f9c
            B.b r11 = (B.b) r11
            r11.getClass()
            B.a r11 = B.b.e(r1, r8, r10, r2)     // Catch:{ all -> 0x01d3 }
            if (r11 == 0) goto L_0x01bf
            r1 = r9
        L_0x00f9:
            int r8 = r1 + 1
            java.lang.Object r12 = r11.f3c
            java.util.zip.ZipFile r12 = (java.util.zip.ZipFile) r12
            r13 = 5
            if (r1 >= r13) goto L_0x0197
            java.lang.String r1 = "Found %s! Extracting..."
            java.lang.Object[] r13 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x0119 }
            r2.e(r1, r13)     // Catch:{ all -> 0x0119 }
            boolean r1 = r0.exists()     // Catch:{ IOException -> 0x0193 }
            if (r1 != 0) goto L_0x011d
            boolean r1 = r0.createNewFile()     // Catch:{ IOException -> 0x0193 }
            if (r1 != 0) goto L_0x011d
            goto L_0x0193
        L_0x0119:
            r0 = move-exception
            r7 = r11
            goto L_0x01d6
        L_0x011d:
            java.lang.Object r1 = r11.f4d     // Catch:{ FileNotFoundException -> 0x017d, IOException -> 0x017b, all -> 0x0178 }
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch:{ FileNotFoundException -> 0x017d, IOException -> 0x017b, all -> 0x0178 }
            java.io.InputStream r1 = r12.getInputStream(r1)     // Catch:{ FileNotFoundException -> 0x017d, IOException -> 0x017b, all -> 0x0178 }
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0174, all -> 0x016f }
            r13.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0174, all -> 0x016f }
            r14 = 4096(0x1000, float:5.74E-42)
            byte[] r14 = new byte[r14]     // Catch:{ FileNotFoundException -> 0x018d, IOException -> 0x0186, all -> 0x0164 }
            r15 = 0
        L_0x0130:
            int r7 = r1.read(r14)     // Catch:{ FileNotFoundException -> 0x018d, IOException -> 0x0186, all -> 0x0164 }
            r6 = -1
            if (r7 != r6) goto L_0x0169
            r13.flush()     // Catch:{ FileNotFoundException -> 0x018d, IOException -> 0x0186, all -> 0x0164 }
            java.io.FileDescriptor r6 = r13.getFD()     // Catch:{ FileNotFoundException -> 0x018d, IOException -> 0x0186, all -> 0x0164 }
            r6.sync()     // Catch:{ FileNotFoundException -> 0x018d, IOException -> 0x0186, all -> 0x0164 }
            long r6 = r0.length()     // Catch:{ FileNotFoundException -> 0x018d, IOException -> 0x0186, all -> 0x0164 }
            int r6 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0150
            B.b.d(r1)     // Catch:{ all -> 0x0119 }
            B.b.d(r13)     // Catch:{ all -> 0x0119 }
            goto L_0x0193
        L_0x0150:
            B.b.d(r1)     // Catch:{ all -> 0x0119 }
            B.b.d(r13)     // Catch:{ all -> 0x0119 }
            r1 = 1
            r0.setReadable(r1, r9)     // Catch:{ all -> 0x0119 }
            r0.setExecutable(r1, r9)     // Catch:{ all -> 0x0119 }
            r0.setWritable(r1)     // Catch:{ all -> 0x0119 }
        L_0x0160:
            r12.close()     // Catch:{ IOException -> 0x01a3 }
            goto L_0x01a3
        L_0x0164:
            r0 = move-exception
            r7 = r1
            r17 = r13
            goto L_0x017f
        L_0x0169:
            r13.write(r14, r9, r7)     // Catch:{ FileNotFoundException -> 0x018d, IOException -> 0x0186, all -> 0x0164 }
            long r6 = (long) r7
            long r15 = r15 + r6
            goto L_0x0130
        L_0x016f:
            r0 = move-exception
            r7 = r1
        L_0x0171:
            r17 = 0
            goto L_0x017f
        L_0x0174:
            r13 = 0
            goto L_0x0186
        L_0x0176:
            r13 = 0
            goto L_0x018d
        L_0x0178:
            r0 = move-exception
            r7 = 0
            goto L_0x0171
        L_0x017b:
            r1 = 0
            goto L_0x0174
        L_0x017d:
            r1 = 0
            goto L_0x0176
        L_0x017f:
            B.b.d(r7)     // Catch:{ all -> 0x0119 }
            B.b.d(r17)     // Catch:{ all -> 0x0119 }
            throw r0     // Catch:{ all -> 0x0119 }
        L_0x0186:
            B.b.d(r1)     // Catch:{ all -> 0x0119 }
            B.b.d(r13)     // Catch:{ all -> 0x0119 }
            goto L_0x0193
        L_0x018d:
            B.b.d(r1)     // Catch:{ all -> 0x0119 }
            B.b.d(r13)     // Catch:{ all -> 0x0119 }
        L_0x0193:
            r1 = r8
            r7 = 0
            goto L_0x00f9
        L_0x0197:
            java.lang.String r1 = "FATAL! Couldn't extract the library from the APK!"
            java.lang.Object r6 = r2.f10d     // Catch:{ all -> 0x0119 }
            E.j r6 = (E.j) r6     // Catch:{ all -> 0x0119 }
            if (r6 == 0) goto L_0x0160
            lambda$loadLibrary$0(r1)     // Catch:{ all -> 0x0119 }
            goto L_0x0160
        L_0x01a3:
            java.lang.String r0 = r0.getAbsolutePath()
            r4.getClass()
            java.lang.System.load(r0)
            r5.add(r3)
            java.lang.String r0 = "%s (%s) was re-linked!"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            r2.e(r0, r1)
            goto L_0x0056
        L_0x01bc:
            loadLibraryCalled = r18
            return
        L_0x01bf:
            java.lang.String[] r0 = B.b.f(r1, r10)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01cd
        L_0x01c4:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0119 }
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0119 }
        L_0x01cd:
            B.c r1 = new B.c     // Catch:{ all -> 0x0119 }
            r1.<init>(r10, r8, r0)     // Catch:{ all -> 0x0119 }
            throw r1     // Catch:{ all -> 0x0119 }
        L_0x01d3:
            r0 = move-exception
            r1 = r7
            r7 = r1
        L_0x01d6:
            if (r7 == 0) goto L_0x01df
            java.lang.Object r1 = r7.f3c     // Catch:{ IOException -> 0x01df }
            java.util.zip.ZipFile r1 = (java.util.zip.ZipFile) r1     // Catch:{ IOException -> 0x01df }
            r1.close()     // Catch:{ IOException -> 0x01df }
        L_0x01df:
            throw r0
        L_0x01e0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Given context is null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.loadLibrary(android.content.Context):void");
    }

    public void markTextureFrameAvailable(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j2);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            jVar.f675r.clear();
            jVar.f676s.clear();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            SparseArray sparseArray = jVar.m;
            if (sparseArray.get(i2) != null) {
                jVar.e();
                io.flutter.plugin.platform.b bVar = (io.flutter.plugin.platform.b) sparseArray.get(i2);
                if (bVar.getParent() == null) {
                    jVar.f661c.addView(bVar);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
                layoutParams.leftMargin = i3;
                layoutParams.topMargin = i4;
                bVar.setLayoutParams(layoutParams);
                bVar.setVisibility(0);
                bVar.bringToFront();
                jVar.f675r.add(Integer.valueOf(i2));
                return;
            }
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            jVar.e();
            if (jVar.f669k.get(i2) != null) {
                throw new ClassCastException();
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    public void onDisplayPlatformView2(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        } else if (iVar.f653g.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public void onEndFrame() {
        boolean z2;
        ? r3;
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            boolean z3 = false;
            if (!jVar.f673p || !jVar.f676s.isEmpty()) {
                if (jVar.f673p) {
                    C0012m mVar = jVar.f661c.f116c;
                    if (mVar != null) {
                        z2 = mVar.e();
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z3 = true;
                    }
                }
                jVar.c(z3);
                return;
            }
            jVar.f673p = false;
            x xVar = jVar.f661c;
            c cVar = new c(2, jVar);
            C0012m mVar2 = xVar.f116c;
            if (mVar2 != null && (r3 = xVar.f118e) != 0) {
                xVar.f117d = r3;
                xVar.f118e = null;
                io.flutter.embedding.engine.renderer.j jVar2 = xVar.f121h.f140b;
                if (jVar2 == null) {
                    mVar2.d();
                    C0012m mVar3 = xVar.f116c;
                    if (mVar3 != null) {
                        mVar3.f89a.close();
                        xVar.removeView(xVar.f116c);
                        xVar.f116c = null;
                    }
                    cVar.run();
                    return;
                }
                r3.b();
                jVar2.a(new w(xVar, jVar2, cVar));
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (k a2 : this.flutterUiDisplayListeners) {
            a2.a();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (k b2 : this.flutterUiDisplayListeners) {
            b2.b();
        }
    }

    public void onSurfaceChanged(int i2, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i2, i3);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j2, long j3, long j4) {
        nativeOnVsync(j2, j3, j4);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j2, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference(textureRegistry$ImageConsumer), z2);
    }

    public void registerTexture(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(kVar);
    }

    public void requestDartDeferredLibrary(int i2) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j2);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(l lVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = lVar;
    }

    public void setAccessibilityFeatures(int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i2);
        }
    }

    public void setAccessibilityFeaturesInNative(int i2) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i2);
    }

    public void setAsyncWaitForVsyncDelegate(m mVar) {
        asyncWaitForVsyncDelegate = mVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(N.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(F.k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(j jVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = jVar;
    }

    public void setPlatformViewsController2(i iVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = iVar;
    }

    public void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z2);
        }
    }

    public void setSemanticsEnabledInNative(boolean z2) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z2);
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3);
    }

    public void showOverlaySurface2() {
        i iVar = this.platformViewsController2;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        } else if (iVar.f658l != null) {
            SurfaceControl.Transaction h2 = C0010k.h();
            h2.setVisibility(iVar.f658l, true);
            h2.apply();
        }
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j2) {
        boolean z2;
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j2);
        Long l2 = nativeSpawn.nativeShellHolderId;
        if (l2 == null || l2.longValue() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void swapTransactions() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            synchronized (iVar) {
                try {
                    iVar.f656j.clear();
                    for (int i2 = 0; i2 < iVar.f655i.size(); i2++) {
                        iVar.f656j.add(C0010k.j(iVar.f655i.get(i2)));
                    }
                    iVar.f655i.clear();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return;
        }
        throw new RuntimeException("");
    }

    public void unregisterTexture(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j2);
    }

    public void updateDisplayMetrics(int i2, float f2, float f3, float f4) {
        displayWidth = f2;
        displayHeight = f3;
        displayDensity = f4;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i2, d dVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = M.m.f328a.c(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, dVar.f713b, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
