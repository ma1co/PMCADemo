package com.github.ma1co.pmcademo.app;

import android.os.Bundle;
import android.widget.TextView;
import com.sony.scalar.hardware.avio.DisplayManager;

import java.util.Arrays;

public class DisplayActivity extends BaseActivity implements DisplayManager.DisplayEventListener {
    private String devices[] = {
        DisplayManager.DEVICE_ID_PANEL,
        DisplayManager.DEVICE_ID_FINDER,
        DisplayManager.DEVICE_ID_NONE,
    };

    private TextView textView;
    private DisplayManager displayManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        textView = (TextView) findViewById(R.id.logView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        displayManager = new DisplayManager();
        displayManager.setDisplayStatusListener(this);
        logDisplay();
    }

    @Override
    protected void onPause() {
        super.onPause();
        displayManager.releaseDisplayStatusListener();
        displayManager.finish();
        displayManager = null;
    }

    @Override
    protected boolean onEnterKeyUp() {
        int currentDevice = Arrays.asList(devices).indexOf(displayManager.getActiveDevice());
        int nextDevice = (currentDevice + 1) % devices.length;
        displayManager.switchDisplayOutputTo(devices[nextDevice]);
        return true;
    }

    @Override
    public void onDeviceStatusChanged(int event) {
        if (event == DisplayManager.EVENT_SWITCH_DEVICE)
            logDisplay();
    }

    protected void logDisplay() {
        String device = displayManager.getActiveDevice();
        DisplayManager.DeviceInfo info = displayManager.getDeviceInfo(device);

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
