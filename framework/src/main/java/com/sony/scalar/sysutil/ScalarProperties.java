package com.sony.scalar.sysutil;

public class ScalarProperties {
    public static class PictureSize {
        public int height;
        public int width;
    }

    public static final int INTVAL_ASPECT_16_9 = 169;
    public static final int INTVAL_ASPECT_4_3 = 43;
    public static final int INTVAL_CATEGORY_DSCHIGH = 2;
    public static final int INTVAL_CATEGORY_NEX = 1;
    public static final int INTVAL_IMAGER_TYPE_NORMAL = 0;
    public static final int INTVAL_IRREMOTE_CATEGORY_CAM = 2;
    public static final int INTVAL_IRREMOTE_CATEGORY_DSC = 1;
    public static final int INTVAL_IRREMOTE_CATEGORY_DSLR = 3;
    public static final int INTVAL_IRREMOTE_CATEGORY_NONE = 0;
    public static final int INTVAL_MODE_SW_TYPE_DIAL = 1;
    public static final int INTVAL_MODE_SW_TYPE_NONE = 0;
    public static final int INTVAL_NOT_SUPPORTED = 0;
    public static final int INTVAL_SUPPORTED = 1;
    public static final int INTVAL_TP_TYPE_CAPACITIVE = 2;
    public static final int INTVAL_TP_TYPE_NONE = 0;
    public static final int INTVAL_TP_TYPE_RESISTIVE = 1;

    public static final String PROP_DEVICE_EVF_EXTERNAL_SUPPORTED = "device.evf.external.supported";
    public static final String PROP_DEVICE_EVF_INTERNAL_ASPECT = "device.evf.internal.aspect";
    public static final String PROP_DEVICE_EVF_INTERNAL_RES_AS_SQUARE_H = "device.evf.internal.res.as.square.h";
    public static final String PROP_DEVICE_EVF_INTERNAL_RES_AS_SQUARE_W = "device.evf.internal.res.as.square.w";
    public static final String PROP_DEVICE_EVF_INTERNAL_RES_H = "device.evf.internal.res.h";
    public static final String PROP_DEVICE_EVF_INTERNAL_RES_W = "device.evf.internal.res.w";
    public static final String PROP_DEVICE_EVF_INTERNAL_SUPPORTED = "device.evf.internal.supported";
    public static final String PROP_DEVICE_GPS_SUPPORTED = "device.gps.supported";
    public static final String PROP_DEVICE_IMAGER_TYPE = "device.imager.type";
    public static final String PROP_DEVICE_IRREMOTE_CATEGORY = "device.irremote.category";
    public static final String PROP_DEVICE_PANEL_ASPECT = "device.panel.aspect";
    public static final String PROP_DEVICE_PANEL_RES_AS_SQUARE_H = "device.panel.res.as.square.h";
    public static final String PROP_DEVICE_PANEL_RES_AS_SQUARE_W = "device.panel.res.as.square.w";
    public static final String PROP_DEVICE_PANEL_RES_H = "device.panel.res.h";
    public static final String PROP_DEVICE_PANEL_RES_W = "device.panel.res.w";
    public static final String PROP_DEVICE_WIFI_SUPPORTED = "device.wifi.supported";
    public static final String PROP_INPUT_MODE_SW_MODE_LIST = "input.mode.sw.mode.list";
    public static final String PROP_INPUT_MODE_SW_TYPE = "input.mode.sw.type";
    public static final String PROP_INPUT_TP_SUPPORTED = "input.tp.supported";
    public static final String PROP_INPUT_TP_TYPE = "input.tp.type";
    public static final String PROP_MEM_DYNAMICAREA_SIZE_IN_RAWIMAGE_NUM = "mem.dynamicarea.size.in.rawimage.num";
    public static final String PROP_MEM_RAWIMAGE_SIZE_IN_MEGA_PIXEL = "mem.rawimage.size.in.mega.pixel";
    public static final String PROP_MODEL_CATEGORY = "model.category";
    public static final String PROP_MODEL_CODE = "model.code";
    public static final String PROP_MODEL_NAME = "model.name";
    public static final String PROP_MODEL_SERIAL_CODE = "model.serial.code";
    public static final String PROP_VERSION_PLATFORM = "version.platform";

    public static String getFirmwareVersion() { throw new RuntimeException(); }
    public static int getInt(String prop) { throw new RuntimeException(); }
    public static int getInt(String prop, int defaultValue) { throw new RuntimeException(); }
    public static int[] getIntArray(String prop) { throw new RuntimeException(); }
    public static String getString(String prop) { throw new RuntimeException(); }
    public static String getString(String prop, String defaultValue) { throw new RuntimeException(); }
    public static java.util.List<ScalarProperties.PictureSize> getSupportedPictureSizes() { throw new RuntimeException(); }
}
