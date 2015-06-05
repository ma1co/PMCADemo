package com.sony.wifi.direct;

public class DirectManager {
    public static final String AUTO_CONNECT_START_ACTION = "com.sony.wifi.direct.AUTO_CONNECT_START_ACTION";
    public static final String DEVICE_FOUND_ACTION = "com.sony.wifi.direct.DEVICE_FOUND_ACTION";
    public static final String DIRECT_DETAILED_STATE_CHANGED_ACTION = "com.sony.wifi.direct.DIRECT_DETAILED_STATE_CHANGED_ACTION";
    public static final int DIRECT_DETAILED_STATE_CONNECTING = 10;
    public static final int DIRECT_DETAILED_STATE_DISABLED = 6;
    public static final int DIRECT_DETAILED_STATE_FINDING = 8;
    public static final int DIRECT_DETAILED_STATE_IDLE = 7;
    public static final int DIRECT_DETAILED_STATE_INVITING = 12;
    public static final int DIRECT_DETAILED_STATE_LISTENING = 9;
    public static final int DIRECT_DETAILED_STATE_UNKNOWN = 13;
    public static final int DIRECT_DETAILED_STATE_WPS = 11;
    public static final String DIRECT_STATE_CHANGED_ACTION = "com.sony.wifi.direct.DIRECT_STATE_CHANGED_ACTION";
    public static final int DIRECT_STATE_DISABLED = 1;
    public static final int DIRECT_STATE_DISABLING = 0;
    public static final int DIRECT_STATE_ENABLED = 4;
    public static final int DIRECT_STATE_ENABLING = 3;
    public static final int DIRECT_STATE_UNKNOWN = -1;
    public static final String EXTRA_DIRECT_CONFIG = "direct_config";
    public static final String EXTRA_DIRECT_DETAILED_STATE = "direct_detailed_state";
    public static final String EXTRA_DIRECT_OPERATION_MODE = "direct_operate_mode";
    public static final String EXTRA_DIRECT_STATE = "direct_state";
    public static final String EXTRA_ERROR_CODE = "error_code";
    public static final String EXTRA_P2P_DEVICE = "p2p_device";
    public static final String EXTRA_P2P_DEV_ADDR = "p2p_dev_addr";
    public static final String EXTRA_PREVIOUS_DIRECT_DETAILED_STATE = "previous_direct_detailed_state";
    public static final String EXTRA_PREVIOUS_DIRECT_STATE = "previous_direct_state";
    public static final String EXTRA_SERVICE_DISCOVERY_INFO = "p2p_serv_disc_info";
    public static final String EXTRA_STA_ADDR = "sta_addr";
    public static final String GO_NEG_REQUEST_ACTION = "com.sony.wifi.direct.GO_NEG_REQUEST_ACTION";
    public static final String GROUP_CREATE_FAILURE_ACTION = "com.sony.wifi.direct.GROUP_CREATE_FAILURE_ACTION";
    public static final String GROUP_CREATE_SUCCESS_ACTION = "com.sony.wifi.direct.GROUP_CREATE_SUCCESS_ACTION";
    public static final String GROUP_TERMINATE_ACTION = "com.sony.wifi.direct.GROUP_TERMINATE_ACTION";
    public static final String INVITATION_REQUEST_ACTION = "com.sony.wifi.direct.INVITATION_REQUEST_ACTION";
    public static final String INVITE_FAILURE_ACTION = "com.sony.wifi.direct.INVITE_FAILURE_ACTION";
    public static final String INVITE_SUCCESS_ACTION = "com.sony.wifi.direct.INVITE_SUCCESS_ACTION";
    public static final int MINIMUM_RSSI = -2147483648;
    public static final int PERSISTENT_GO = -2;
    public static final String PROVISIONING_REQUEST_ACTION = "com.sony.wifi.direct.PROVISIONING_REQUEST_ACTION";
    public static final String RECONNECT_ACTION = "com.sony.wifi.direct.RECONNECT_ACTION";
    public static final String SERVICE_DISCOVERY_RESPONSE_ACTION = "com.sony.wifi.direct.SERVICE_DISCOVERY_RESPONSE_ACTION";
    public static final String STA_CONNECTED_ACTION = "com.sony.wifi.direct.STA_CONNECTED_ACTION";
    public static final String STA_DISCONNECTED_ACTION = "com.sony.wifi.direct.STA_DISCONNECTED_ACTION";
    public static final String STA_REJECTED_ACTION = "com.sony.wifi.direct.STA_REJECTED_ACTION";
    public static final int TEMPORARY_GO = -1;
    public static final String WIFI_DIRECT_SERVICE = "wifi-direct";
    public static final String WPS_REG_FAILURE_ACTION = "com.sony.wifi.direct.WPS_REG_FAILURE_ACTION";
    public static final String WPS_REG_SUCCESS_ACTION = "com.sony.wifi.direct.WPS_REG_SUCCESS_ACTION";

    public java.util.List<DirectConfiguration> getConfigurations() { throw new RuntimeException(); }
    public DirectConfiguration getCurrentConfiguration() { throw new RuntimeException(); }
    public java.util.List<DirectDevice> getDeviceList() { throw new RuntimeException(); }
    public int getDirectDetailedState() { throw new RuntimeException(); }
    public String getDirectDetailedStateStr(int state) { throw new RuntimeException(); }
    public int getDirectState() { throw new RuntimeException(); }
    public String getDirectStateStr(int state) { throw new RuntimeException(); }
    public DirectDevice getMyDevice() { throw new RuntimeException(); }
    public boolean isDirectEnabled() { throw new RuntimeException(); }
    public boolean setDirectEnabled(boolean enabled) { throw new RuntimeException(); }
    public boolean startGo(int networkId) { throw new RuntimeException(); }
}
