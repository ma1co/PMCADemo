package com.sony.wifi.direct;

public class DirectConfiguration implements android.os.Parcelable {
    public static class ConfigurationMethod {
        public static final int DISPLAY = 3;
        public static final int ETHERNET = 1;
        public static final int EXTERNAL_NFC_TOKEN = 4;
        public static final int INTEGRATED_NFC_TOKEN = 5;
        public static final int KEYPAD = 8;
        public static final int LABEL = 2;
        public static final int NFC_INTERFACE = 6;
        public static final int PHYSICAL_DISPLAY_PIN = 12;
        public static final int PHYSICAL_PUSH_BUTTON = 10;
        public static final int PUSH_BUTTON = 7;
        public static final int USBA = 0;
        public static final int VIRTUAL_DISPLAY_PIN = 11;
        public static final int VIRTUAL_PUSH_BUTTON = 9;
    }

    public static class DeviceCapability {
        public static final int CONCURRENT_OPERATION = 2;
        public static final int P2P_CLIENT_DISCOVERABILITY = 1;
        public static final int P2P_DEVICE_LIMIT = 4;
        public static final int P2P_INFRASTRUCTURE_MANAGED = 3;
        public static final int P2P_INVITATION_PROCEDURE = 5;
        public static final int SERVICE_DISCOVERY = 0;
    }

    public static class GroupCapability {
        public static final int CROSS_CONNECTION = 4;
        public static final int GROUP_FORMATION = 6;
        public static final int INTRA_BSS_DISTRIBUTION = 3;
        public static final int P2P_GROUP_LIMIT = 2;
        public static final int P2P_GROUP_OWNER = 0;
        public static final int PERSISTENT_P2P_GROUP = 1;
        public static final int PERSISTENT_RECONNECT = 5;
    }

    public static class OperatingMode {
        public static final int GO = 3;
        public static final int P2P_CLIENT = 2;
        public static final int P2P_DEVICE = 0;
    }

    public int describeContents() { throw new RuntimeException(); }
    public int getFreq() { throw new RuntimeException(); }
    public String getGoDevAddress() { throw new RuntimeException(); }
    public String getIfName() { throw new RuntimeException(); }
    public int getNetworkId() { throw new RuntimeException(); }
    public int getOperatingMode() { throw new RuntimeException(); }
    public String getP2PIfAddress() { throw new RuntimeException(); }
    public String getPreSharedKey() { throw new RuntimeException(); }
    public String getSsid() { throw new RuntimeException(); }
    public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException(); }
}
