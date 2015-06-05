package com.sony.wifi.direct;

public class ServiceDiscoveryInfo implements android.os.Parcelable {
    public static class Status {
        public static final int BAD_REQUEST = 3;
        public static final int REQUESTED_INFORMATION_NOT_AVAILABLE = 2;
        public static final int SERVICE_PROTOCOL_NOT_AVAILABLE = 1;
        public static final int SUCESS = 0;
    }

    public static final int UPNP_VER_1_0 = 16;

    public int describeContents() { throw new RuntimeException(); }
    public String getData() { throw new RuntimeException(); }
    public String getSrcAddress() { throw new RuntimeException(); }
    public int getStatus() { throw new RuntimeException(); }
    public int getVersion() { throw new RuntimeException(); }
    public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException(); }
}
