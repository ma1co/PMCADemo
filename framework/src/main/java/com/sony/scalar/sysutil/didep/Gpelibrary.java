package com.sony.scalar.sysutil.didep;

public class Gpelibrary {
    public enum GS_FRAMEBUFFER_TYPE {
        ABGR8888,
        RGBA4444,
    }

    public enum GS_SWITCH_TYPE {
        SWITCH_CANCEL,
        SWITCH_OFF,
        SWITCH_ON,
    }

    public static final int ACTIVITY_STATE_CREATE = 0;
    public static final int ACTIVITY_STATE_DESTROY = 6;
    public static final int ACTIVITY_STATE_PAUSE = 4;
    public static final int ACTIVITY_STATE_RESTART = 2;
    public static final int ACTIVITY_STATE_RESUME = 3;
    public static final int ACTIVITY_STATE_START = 1;
    public static final int ACTIVITY_STATE_STOP = 5;

    public static void changeFrameBufferPixel(GS_FRAMEBUFFER_TYPE type) { throw new RuntimeException(); }
    public static void onActivityStateChanged(int arg0, int arg1) { throw new RuntimeException(); }
    public static void onWindowFocusChanged(boolean arg0, int arg1) { throw new RuntimeException(); }
    public static void updateEnable(GS_SWITCH_TYPE type) { throw new RuntimeException(); }
}
