package com.github.ma1co.pmcademo.app;

import android.os.Bundle;
import android.widget.TextView;
import com.sony.scalar.hardware.avio.DisplayManager;

import java.util.Arrays;

public class DisplayActivity extends BaseActivity {
    private String devices[] = {
        DisplayManager.DEVICE_ID_PANEL,
        DisplayManager.DEVICE_ID_FINDER,
        DisplayManager.DEVICE_ID_NONE,
    };

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        textView = (TextView) findViewById(R.id.logView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        logDisplay();
    }

    @Override
    protected boolean onEnterKeyUp() {
        int currentDevice = Arrays.asList(devices).indexOf(getDisplayManager().getActiveDevice());
        int nextDevice = (currentDevice + 1) % devices.length;
        getDisplayManager().switchDisplayOutputTo(devices[nextDevice]);
        return true;
    }

    @Override
    public void onDisplayChanged(String device) {
        super.onDisplayChanged(device);
        logDisplay();
    }

    protected void logDisplay() {
        String device = getDisplayManager().getActiveDevice();
        DisplayManager.DeviceInfo info = getDisplayManager().getDeviceInfo(device);

        String name;
        if (device.equals(DisplayManager.DEVICE_ID_PANEL))
            name = "Panel";
        else if (device.equals(DisplayManager.DEVICE_ID_FINDER))
            name = "Finder";
        else if (device.equals(DisplayManager.DEVICE_ID_HDMI))
            name = "HDMI";
        else
            name = "Unknown device (" + device + ")";

        log("Current display: " + name + " (" + info.res_w + " x " + info.res_h + ")");
    }

    protected void log(String msg) {
        textView.append(msg + "\n");
    }
}
