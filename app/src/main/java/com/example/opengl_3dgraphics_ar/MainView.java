package com.example.opengl_3dgraphics_ar;

import android.content.Context;
import android.graphics.PixelFormat;
import android.opengl.GLSurfaceView;

class MainView extends GLSurfaceView {

    public MainRenderer cr;

    public MainView(Context context) {
        super(context);
        cr = new MainRenderer();
        this.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        this.setRenderer(cr);
        this.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
        this.getHolder().setFormat(PixelFormat.TRANSPARENT);
    }
}