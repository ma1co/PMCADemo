package com.github.ma1co.pmcademo.app;

import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.sony.scalar.hardware.CameraEx;

import java.io.IOException;

public class CameraActivity extends BaseActivity implements SurfaceHolder.Callback {
    private SurfaceHolder surfaceHolder;
    private CameraEx camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.surfaceView);
        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }

    @Override
    protected void onResume() {
        super.onResume();
        camera = CameraEx.open(0, null);
        surfaceHolder.addCallback(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        camera.release();
        camera = null;
        surfaceHolder.removeCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        try {
            camera.getNormalCamera().setPreviewDisplay(holder);
            camera.getNormalCamera().startPreview();
        } catch (IOException e) {}
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {}

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {}

    @Override
    protected boolean onFocusKeyDown() {
        camera.getNormalCamera().autoFocus(null);
        return true;
    }

    @Override
    protected boolean onFocusKeyUp() {
        camera.getNormalCamera().cancelAutoFocus();
        return true;
    }

    @Override
    protected boolean onShutterKeyDown() {
        camera.getNormalCamera().takePicture(null, null, null);
        return true;
    }

    @Override
    protected boolean onShutterKeyUp() {
        camera.cancelTakePicture();
        return true;
    }
}
