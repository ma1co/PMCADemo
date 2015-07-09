package com.github.ma1co.pmcademo.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.sony.scalar.hardware.avio.DisplayManager;

public class ScalingBitmapView extends ImageView implements AppNotificationManager.NotificationListener {
    protected class ScaledBitmapDrawable extends BitmapDrawable {
        private float xScale;

        public ScaledBitmapDrawable(Bitmap bitmap, float xScale) {
            super(bitmap);
            this.xScale = xScale;
        }

        @Override
        public int getIntrinsicWidth() {
            return Math.round(super.getIntrinsicWidth() * xScale);
        }
    }

    private Bitmap bitmap;

    public ScalingBitmapView(Context context, AttributeSet attrs) {
        super(context, attrs);
        AppNotificationManager.getInstance().addListener(this);
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        update();
    }

    @Override
    public void onNotify(String message) {
        if (message.equals(BaseActivity.NOTIFICATION_DISPLAY_CHANGED))
            update();
    }

    private void update() {
        DisplayManager displayManager = new DisplayManager();
        String device = displayManager.getActiveDevice();
        DisplayManager.DeviceInfo info = displayManager.getDeviceInfo(device);
        displayManager.finish();
        displayManager = null;

        float scale;
        if (device.equals(DisplayManager.DEVICE_ID_PANEL) && info.aspect == DisplayManager.ASPECT_RATIO_16_9)
            scale = .75f;
        else
            scale = 1;

        setImageDrawable(new ScaledBitmapDrawable(bitmap, scale));
    }
}
