package com.github.ma1co.pmcademo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.TextView;
import com.sony.wifi.direct.DirectConfiguration;
import com.sony.wifi.direct.DirectManager;

import java.io.IOException;
import java.util.List;

public class WifiDirectActivity extends BaseActivity {
    public static final String MY_IP_ADDRESS = "192.168.122.1";

    private TextView textView;
    private WifiManager wifiManager;
    private DirectManager wifiDirectManager;
    private BroadcastReceiver wifiStateReceiver;
    private BroadcastReceiver wifiDirectStateReceiver;
    private BroadcastReceiver groupCreateSuccessReceiver;
    private BroadcastReceiver groupCreateFailureReceiver;
    private BroadcastReceiver stationConnectedReceiver;
    private BroadcastReceiver stationDisconnectedReceiver;
    private HttpServer httpServer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        textView = (TextView) findViewById(R.id.logView);

        wifiManager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        wifiDirectManager = (DirectManager) getSystemService(DirectManager.WIFI_DIRECT_SERVICE);

        wifiStateReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                wifiStateChanged(intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN));
            }
        };

        wifiDirectStateReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                wifiDirectStateChanged(intent.getIntExtra(DirectManager.EXTRA_DIRECT_STATE, DirectManager.DIRECT_STATE_UNKNOWN));
            }
        };

        groupCreateSuccessReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                groupCreated((DirectConfiguration) intent.getParcelableExtra(DirectManager.EXTRA_DIRECT_CONFIG));
            }
        };

        groupCreateFailureReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                groupCreateFailed();
            }
        };

        stationConnectedReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                stationConnected(intent.getStringExtra(DirectManager.EXTRA_STA_ADDR));
            }
        };

        stationDisconnectedReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                stationDisconnected(intent.getStringExtra(DirectManager.EXTRA_STA_ADDR));
            }
        };

        httpServer = new HttpServer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(wifiStateReceiver, new IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION));
        registerReceiver(wifiDirectStateReceiver, new IntentFilter(DirectManager.DIRECT_STATE_CHANGED_ACTION));
        registerReceiver(groupCreateSuccessReceiver, new IntentFilter(DirectManager.GROUP_CREATE_SUCCESS_ACTION));
        registerReceiver(groupCreateFailureReceiver, new IntentFilter(DirectManager.GROUP_CREATE_FAILURE_ACTION));
        registerReceiver(stationConnectedReceiver, new IntentFilter(DirectManager.STA_CONNECTED_ACTION));
        registerReceiver(stationDisconnectedReceiver, new IntentFilter(DirectManager.STA_DISCONNECTED_ACTION));
        wifiManager.setWifiEnabled(true);
        wifiDirectManager.setDirectEnabled(true);
        try {
            httpServer.start();
        } catch (IOException e) {}
        setAutoPowerOffMode(false);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(wifiStateReceiver);
        unregisterReceiver(wifiDirectStateReceiver);
        unregisterReceiver(groupCreateSuccessReceiver);
        unregisterReceiver(groupCreateFailureReceiver);
        unregisterReceiver(stationConnectedReceiver);
        unregisterReceiver(stationDisconnectedReceiver);
        wifiDirectManager.setDirectEnabled(false);
        wifiManager.setWifiEnabled(false);
        httpServer.stop();
        setAutoPowerOffMode(true);
    }

    protected void wifiStateChanged(int state) {
        switch (state) {
            case WifiManager.WIFI_STATE_ENABLING:
                log("Enabling wifi");
                break;
            case WifiManager.WIFI_STATE_ENABLED:
                log("Wifi enabled");
                break;
        }
    }

    protected void wifiDirectStateChanged(int state) {
        switch (state) {
            case DirectManager.DIRECT_STATE_ENABLING:
                log("Enabling wifi direct");
                break;
            case DirectManager.DIRECT_STATE_ENABLED:
                wifiDirectEnabled();
                break;
        }
    }

    protected void wifiDirectEnabled() {
        log("Wifi direct enabled");
        List<DirectConfiguration> configurations = wifiDirectManager.getConfigurations();
        if (configurations.isEmpty()) {
            log("Error: No configurations found");
        } else {
            log("Creating Group");
            wifiDirectManager.startGo(configurations.get(configurations.size() - 1).getNetworkId());
        }
    }

    protected void groupCreated(DirectConfiguration configuration) {
        log("Group created");
        log("SSID: " + configuration.getSsid());
        log("Key: " + configuration.getPreSharedKey());
        log("Server URL: http://" + MY_IP_ADDRESS + ":" + HttpServer.PORT + "/");
    }

    protected void groupCreateFailed() {
        log("Group create failed");
    }

    protected void stationConnected(String address) {
        log("Station connected: " + address);
    }

    protected void stationDisconnected(String address) {
        log("Station disconnected: " + address);
    }

    protected void log(String msg) {
        textView.append(msg + "\n");
    }
}
