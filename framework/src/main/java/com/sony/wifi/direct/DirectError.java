package com.sony.wifi.direct;

public class DirectError {
    public static final int BOTH_GO_INTENT_15 = 9;
    public static final int DHCP_FAILED = 1007;
    public static final int INCOMPATIBLE_PARAMETERS = 2;
    public static final int INCOMPATIBLE_PROVISIONING_METHOD = 10;
    public static final int INFORMATION_IS_CURRENTLY_UNAVAILABLE = 1;
    public static final int INTERNAL_ERROR = 1000;
    public static final int INVALID_PARAMETER = 4;
    public static final int INVALID_STATE = 1008;
    public static final int LIMIT_REACHED = 3;
    public static final int NEED_PIN = 1009;
    public static final int NO_COMMON_CHANNEL = 7;
    public static final int PREVIOUS_PROTOCOL_ERROR = 6;
    public static final int REJECTED_BY_USER = 11;
    public static final int SUCCESS = 0;
    public static final int TARGET_DEVICE_BUSY = 1002;
    public static final int TIMEOUT = 1003;
    public static final int UNABLE_TO_ACCOMMODATE_REQUEST = 5;
    public static final int UNKNOWN_P2P_GROUP = 8;
    public static final int USER_CANCELED = 1001;
    public static final int WPS_PINMISMATCH_DETECTED = 1006;
    public static final int WPS_SESSION_OVERLAP = 1005;

    public static String getErrorStr(int error) { throw new RuntimeException(); }
}
