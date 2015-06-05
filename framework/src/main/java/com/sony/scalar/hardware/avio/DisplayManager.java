package com.sony.scalar.hardware.avio;

public class DisplayManager {
    public class DeviceInfo {
        public int aspect;
        public int res_h;
        public int res_w;
    }

    public static class DeviceStatus {
        public boolean active;
        public int format;
        public String id;
        public int ntpal;
        public int viewPattern;
    }

    public interface DisplayEventListener {
        void onDeviceStatusChanged(int event);
    }

    public interface OnScreenDisplayListener {
        void onPreventBurnInOLED(int burn);
    }

    public interface VideoLayoutStatusListener {
        void onLayoutChanged(VideoRect rect);
    }

    public static class VideoRect {
        public int pxBottom;
        public int pxLeft;
        public int pxRight;
        public int pxTop;
    }

    public static final int ASPECT_RATIO_11_9 = 5;
    public static final int ASPECT_RATIO_16_9 = 2;
    public static final int ASPECT_RATIO_3_2 = 1;
    public static final int ASPECT_RATIO_4_3 = 3;
    public static final int ASPECT_RATIO_5_3 = 4;
    public static final int ASPECT_RATIO_UNDEFINED = 0;
    public static final int BURN_IN_OLED_ARISE = 1;
    public static final int BURN_IN_OLED_CLEAR = 0;
    public static final String DEVICE_ID_FINDER = "DEVICE_ID_FINDER";
    public static final String DEVICE_ID_HDMI = "DEVICE_ID_HDMI";
    public static final String DEVICE_ID_NONE = "DEVICE_ID_NONE";
    public static final String DEVICE_ID_PANEL = "DEVICE_ID_PANEL";
    public static final int EVENT_ATTACH_DEVICE = 8192;
    public static final int EVENT_CHANGE_VIEW_PATTERN = 16384;
    public static final int EVENT_DETACH_DEVICE = 8448;
    public static final int EVENT_HDMI_FORMAT = 12288;
    public static final int EVENT_SWITCH_DEVICE = 4096;
    public static final int HDMI_FMT_D1 = 1;
    public static final int HDMI_FMT_D2 = 2;
    public static final int HDMI_FMT_D3 = 3;
    public static final int HDMI_FMT_D4 = 4;
    public static final int HDMI_FMT_D5 = 5;
    public static final int HDMI_FMT_INVALID = 0;
    public static final int SIGNAL_INVALID = -1;
    public static final int SIGNAL_NTSC = 0;
    public static final int SIGNAL_PAL = 1;
    public static final int VIEW_PATTERN_180 = 2;
    public static final int VIEW_PATTERN_INVALID = -1;
    public static final int VIEW_PATTERN_NORMAL = 0;
    public static final int VIEW_PATTERN_NORMAL_OSD180 = 5;
    public static final int VIEW_PATTERN_OSD_NORMAL = 4;
    public static final int VIEW_PATTERN_REVERSE = 3;
    public static final int VIEW_PATTERN_REVERSE_OSD180 = 1;

    public DisplayManager() { throw new RuntimeException(); }
    public void controlGraphicsOutputAll(boolean arg) { throw new RuntimeException(); }
    public void finish() { throw new RuntimeException(); }
    public String getActiveDevice() { throw new RuntimeException(); }
    public DeviceStatus getActiveDeviceStatus() { throw new RuntimeException(); }
    public String[] getActiveDevices() { throw new RuntimeException(); }
    public DeviceStatus[] getAllDevicesStatus() { throw new RuntimeException(); }
    public DeviceInfo getDeviceInfo(String device) { throw new RuntimeException(); }
    public VideoRect getDisplayedVideoRect() { throw new RuntimeException(); }
    public void releaseDisplayStatusListener() { throw new RuntimeException(); }
    public void releaseLayoutStatusListener() { throw new RuntimeException(); }
    public void releaseOnScreenDisplayListener() { throw new RuntimeException(); }
    public void setDisplayStatusListener(DisplayEventListener listener) { throw new RuntimeException(); }
    public void setLayoutStatusListener(VideoLayoutStatusListener listener) { throw new RuntimeException(); }
    public void setOnScreenDisplayListener(OnScreenDisplayListener listener) { throw new RuntimeException(); }
    public void switchDisplayOutputTo(String device) throws IllegalArgumentException { throw new RuntimeException(); }
}
