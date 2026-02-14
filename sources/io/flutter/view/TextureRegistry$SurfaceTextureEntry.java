package io.flutter.view;

import android.graphics.SurfaceTexture;

public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    void setOnFrameConsumedListener(n nVar) {
    }

    void setOnTrimMemoryListener(o oVar) {
    }

    SurfaceTexture surfaceTexture();
}
