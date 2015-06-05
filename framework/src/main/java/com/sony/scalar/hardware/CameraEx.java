package com.sony.scalar.hardware;

public class CameraEx {
    public static class AnalizedData {
        public com.sony.scalar.meta.Histogram hist;
    }

    public interface ApertureChangeListener {
        void onApertureChange(ApertureInfo info, CameraEx cameraEx);
    }

    public static class ApertureInfo {
        public int currentAperture;
        public int currentAvailableMax;
        public int currentAvailableMin;
    }

    public interface AutoFocusDoneListener {
        int STATUS_CLEAR = 0;
        int STATUS_CONTINUOUS = 4;
        int STATUS_LOCK = 1;
        int STATUS_LOCK_WARM = 2;
        int STATUS_WORKING = 3;
        void onDone(int status, int[] arg, CameraEx cameraEx);
    }

    public interface AutoFocusStartListener {
        void onStart(CameraEx cameraEx);
    }

    public interface AutoISOSensitivityListener {
        void onChanged(int iso, CameraEx cameraEx);
    }

    public static class AutoPictureReviewControl {
        public void cancelAutoPictureReview() { throw new RuntimeException(); }
        public int[] getPictureReviewSupportedTimes() { throw new RuntimeException(); }
        public int getPictureReviewTime() { throw new RuntimeException(); }
        public void handleMessage(android.os.Message message) { throw new RuntimeException(); }
        public void setPictureReviewInfoHist(boolean enable) { throw new RuntimeException(); }
        public void setPictureReviewInfoListener(PictureReviewInfoListener listener) { throw new RuntimeException(); }
        public void setPictureReviewStartListener(PictureReviewStartListener listener) { throw new RuntimeException(); }
        public void setPictureReviewTime(int time) { throw new RuntimeException(); }
    }

    public interface AutoSceneModeListener {
        void onChanged(String mode, CameraEx cameraEx);
    }

    public interface CustomWhiteBalanceCallback {
        void onCapture(CustomWhiteBalanceInfo info, CameraEx cameraEx);
    }

    public static class CustomWhiteBalanceInfo {
        public int colorCompensation;
        public int colorTemperature;
        public boolean inRange;
        public int lightBalance;
    }

    public interface DirectShutterStoppedCallback {
        void onShutterStopped(CameraEx cameraEx);
    }

    public interface EquipmentCallback {
        int DEVICE_AVAILABLE = 1;
        int DEVICE_STATUS_CHANGED = 2;
        int DEVICE_TYPE_EXTERNAL_FLASH = 3;
        int DEVICE_TYPE_INTERNAL_FLASH = 2;
        int DEVICE_TYPE_LENS = 1;
        int DEVICE_UNAVAILABLE = 0;
        void onEquipmentChange(int status, int type, CameraEx cameraEx);
    }

    public interface ErrorCallback {
        void onError(int error, CameraEx cameraEx);
    }

    public static class ExternalFlashInfo {
        public boolean afLightAutoStatus;
        public boolean hssStatus;
        public boolean redEyeReductionStatus;
        public boolean wirelessStatus;
    }

    public interface FaceDetectionListener {
        void onFaceDetected(com.sony.scalar.meta.FaceInfo[] infos, CameraEx cameraEx);
    }

    public interface FlashChargingStateListener {
        int CHARGE_DONE = 0;
        int CHARGE_ERROR = 2;
        int CHARGE_ING = 1;
        void onChanged(int state, CameraEx cameraEx);
    }

    public interface FlashEmittingListener {
        void onFlash(boolean flash, CameraEx cameraEx);
    }

    public interface FocalLengthChangeListener {
        void onFocalLengthChanged(int focalLength, CameraEx cameraEx);
    }

    public static class FocusAreaInfos {
        public String focusAreaMode;
        public FocusAreaRectInfo[] rectInfos;
    }

    public static class FocusAreaRectInfo {
        public int index;
        public android.graphics.Rect rect;
    }

    public interface FocusLightStateListener {
        void onChanged(boolean state, boolean arg, CameraEx cameraEx);
    }

    public interface JpegListener {
        void onPictureTaken(byte[] jpeg, CameraEx cameraEx);
    }

    public static class LensInfo {
        public static final String LENS_TYPE_A_MOUNT = "A-mount";
        public static final String LENS_TYPE_E_MOUNT = "E-mount";
        public static final String LENS_TYPE_OTHER = "other";
        public static final String PHASE_SHIFT_SENSOR_15POINT = "15Points";
        public static final String PHASE_SHIFT_SENSOR_OTHER = "other";
        public static final String PHASE_SHIFT_SENSOR_UNKNOWN = "Unknown";

        public WideTele FocalLength;
        public String LensName;
        public String LensType;
        public WideTele MaxFValue;
        public WideTele MinFValue;
        public String PhaseShiftSensor;
    }

    public static class OpenOptions {
        public void setInheritSetting(boolean inherit) { throw new RuntimeException(); }
        public void setPreview(boolean preview) { throw new RuntimeException(); }
        public void setTargetMedia(String targetMedia) { throw new RuntimeException(); }
    }

    public class ParametersModifier {
        public static final String AE_LOCK_OFF = "unlocked";
        public static final String AE_LOCK_ON = "locked";
        public static final String AE_LOCK_SPOT = "spot";
        public static final String ANTI_HAND_BLUR_MODE_CONTINUOUS = "keep";
        public static final String ANTI_HAND_BLUR_MODE_OFF = "off";
        public static final String ANTI_HAND_BLUR_MODE_SHOOT = "onetime";
        public static final String AUTO_FOCUS_MODE_AF_A = "af-a";
        public static final String AUTO_FOCUS_MODE_AF_C = "af-c";
        public static final String AUTO_FOCUS_MODE_AF_S = "af-s";
        public static final String BRACKET_MODE_COLOR = "color";
        public static final String BRACKET_MODE_DRO = "dro";
        public static final String BRACKET_MODE_EXPOSURE = "exposure";
        public static final String BRACKET_MODE_WHITE_BALANCE = "white-balance";
        public static final String BRACKET_ORDER_START_MINUS = "start-minus";
        public static final String BRACKET_ORDER_START_ZERO = "start-zero";
        public static final String BRACKET_STEP_PERIOD_HIGH = "high";
        public static final String BRACKET_STEP_PERIOD_LOW = "low";
        public static final String BURST_DRIVE_BUTTON_RELEASE_BEHAVE_CONTINUE = "continue";
        public static final String BURST_DRIVE_BUTTON_RELEASE_BEHAVE_STOP = "stop";
        public static final String BURST_DRIVE_SPEED_HIGH = "high";
        public static final String BURST_DRIVE_SPEED_LOW = "low";
        public static final String BURST_DRIVE_SPEED_MIDDLE = "middle";
        public static final String COLOR_MODE_CLEAR = "clear";
        public static final String COLOR_MODE_DEEP = "deep";
        public static final String COLOR_MODE_LANDSCAPE = "landscape";
        public static final String COLOR_MODE_LIGHT = "light";
        public static final String COLOR_MODE_MONO = "mono";
        public static final String COLOR_MODE_NEUTRAL = "neutral";
        public static final String COLOR_MODE_NIGHT = "night";
        public static final String COLOR_MODE_PORTRAIT = "portrait";
        public static final String COLOR_MODE_REAL = "real";
        public static final String COLOR_MODE_RED_LEAVES = "red-leaves";
        public static final String COLOR_MODE_SEPIA = "sepia";
        public static final String COLOR_MODE_STANDARD = "standard";
        public static final String COLOR_MODE_SUNSET = "sunset";
        public static final String COLOR_MODE_VIVID = "vivid";
        public static final String COLOR_SELECT_MODE_EXTRACT = "extract";
        public static final String COLOR_SELECT_MODE_OFF = "off";
        public static final String COLOR_SELECT_MODE_REVISION = "revision";
        public static final String DRIVE_MODE_BRACKET = "bracket";
        public static final String DRIVE_MODE_BURST = "burst";
        public static final String DRIVE_MODE_SINGLE = "single";
        public static final String DRIVE_MODE_SPEED_PRIOR_BURST = "speed-prior-burst";
        public static final String DRO_MODE_AUTO = "auto";
        public static final String DRO_MODE_OFF = "off";
        public static final String DRO_MODE_ON = "on";
        public static final String EXPOSURE_BRACKET_MODE_CONTINUE = "continue";
        public static final String EXPOSURE_BRACKET_MODE_SINGLE = "single";
        public static final String FACE_DETECTION_MODE_ADULT = "adult";
        public static final String FACE_DETECTION_MODE_AUTO = "auto";
        public static final String FACE_DETECTION_MODE_CHILD = "child";
        public static final String FACE_DETECTION_MODE_OFF = "off";
        public static final String FLASH_TYPE_FRONT_SYNC = "front-sync";
        public static final String FLASH_TYPE_REAR_SYNC = "rear-sync";
        public static final String FLASH_TYPE_SLOW_REAR_SYNC = "slow-rear-sync";
        public static final String FLASH_TYPE_SLOW_SYNC = "slow-sync";
        public static final String FLASH_TYPE_WIRELESS = "wireless";
        public static final String FOCUS_AREA_MODE_CENTER = "center";
        public static final String FOCUS_AREA_MODE_CENTER_SPOT = "center-spot";
        public static final String FOCUS_AREA_MODE_FLEX_SPOT = "flex-spot";
        public static final String FOCUS_AREA_MODE_LOCAL = "local";
        public static final String FOCUS_AREA_MODE_MINIATURE = "miniature";
        public static final String FOCUS_AREA_MODE_MULTI = "multi";
        public static final String FOCUS_AREA_MODE_SEMIWIDE = "semiwide";
        public static final String FOCUS_AREA_MODE_SEMI_MULTI = "semi-multi";
        public static final String FOCUS_AREA_MODE_SPOT = "spot";
        public static final String FOCUS_AREA_MODE_TOUCH = "touch";
        public static final String FOCUS_AREA_MODE_TRACKING = "tracking";
        public static final String FOCUS_AREA_MODE_WIDE = "wide";
        public static final String FOCUS_MODE_DMF = "dmf";
        public static final String FOCUS_MODE_MANUAL = "manual";
        public static final String FOCUS_MODE_NEIGHBOR = "neighbor";
        public static final String HDR_MODE_AUTO = "auto";
        public static final String HDR_MODE_OFF = "off";
        public static final String HDR_MODE_ON = "on";
        public static final String LENS_CORRECTION_CHROMA_BLUE = "chroma-b";
        public static final String LENS_CORRECTION_CHROMA_RED = "chroma-r";
        public static final String LENS_CORRECTION_DISTOTION = "distotion";
        public static final String LENS_CORRECTION_DISTOTION_MIDDLE = "distotion-m";
        public static final String LENS_CORRECTION_SHADING_COLOR_BLUE = "shading-cb";
        public static final String LENS_CORRECTION_SHADING_COLOR_MIDDLE = "shading-cm";
        public static final String LENS_CORRECTION_SHADING_COLOR_RED = "shading-cr";
        public static final String LENS_CORRECTION_SHADING_WHOLE = "shading-w";
        public static final String LENS_CORRECTION_SHADING_WHOLE_MIDDLE = "shading-wm";
        public static final String METERING_MODE_CENTER_SPOT = "center-spot";
        public static final String METERING_MODE_CENTER_WEIGHTED = "center-weighted";
        public static final String METERING_MODE_CENTER_WEIGHTED_AVERAGE = "center-weighted-average";
        public static final String METERING_MODE_MULTI = "multi";
        public static final String PICTURE_EFFECT_HDR_ART = "hdr-art";
        public static final String PICTURE_EFFECT_ILLUST = "illust";
        public static final String PICTURE_EFFECT_MINIATURE = "miniature";
        public static final String PICTURE_EFFECT_MINIATURE_FOCUS_AREA_AUTO = "auto";
        public static final String PICTURE_EFFECT_MINIATURE_FOCUS_AREA_HCENTER = "hcenter";
        public static final String PICTURE_EFFECT_MINIATURE_FOCUS_AREA_LEFT = "left";
        public static final String PICTURE_EFFECT_MINIATURE_FOCUS_AREA_LOWER = "lower";
        public static final String PICTURE_EFFECT_MINIATURE_FOCUS_AREA_RIGHT = "right";
        public static final String PICTURE_EFFECT_MINIATURE_FOCUS_AREA_UPPER = "upper";
        public static final String PICTURE_EFFECT_MINIATURE_FOCUS_AREA_VCENTER = "vcenter";
        public static final String PICTURE_EFFECT_OFF = "off";
        public static final String PICTURE_EFFECT_PART_COLOR = "part-color";
        public static final String PICTURE_EFFECT_PART_COLOR_EFFECT_BLUE = "blue";
        public static final String PICTURE_EFFECT_PART_COLOR_EFFECT_GREEN = "green";
        public static final String PICTURE_EFFECT_PART_COLOR_EFFECT_RED = "red";
        public static final String PICTURE_EFFECT_PART_COLOR_EFFECT_YELLOW = "yellow";
        public static final String PICTURE_EFFECT_POP_COLOR = "pop-color";
        public static final String PICTURE_EFFECT_POSTERIZATION = "posterization";
        public static final String PICTURE_EFFECT_POSTERIZATION_EFFECT_COLOR = "posterization-color";
        public static final String PICTURE_EFFECT_POSTERIZATION_EFFECT_MONO = "posterization-mono";
        public static final String PICTURE_EFFECT_RETRO_PHOTO = "retro-photo";
        public static final String PICTURE_EFFECT_RICHTONE_MONO = "richtone-mono";
        public static final String PICTURE_EFFECT_ROUGH_MONO = "rough-mono";
        public static final String PICTURE_EFFECT_SOFT_FOCUS = "soft-focus";
        public static final String PICTURE_EFFECT_SOFT_HIGH_KEY = "soft-high-key";
        public static final String PICTURE_EFFECT_SOFT_HIGH_KEY_EFFECT_BLUE = "blue";
        public static final String PICTURE_EFFECT_SOFT_HIGH_KEY_EFFECT_GREEN = "green";
        public static final String PICTURE_EFFECT_SOFT_HIGH_KEY_EFFECT_PINK = "pink";
        public static final String PICTURE_EFFECT_TOY_CAMERA = "toy-camera";
        public static final String PICTURE_EFFECT_TOY_CAMERA_EFFECT_COOL = "cool";
        public static final String PICTURE_EFFECT_TOY_CAMERA_EFFECT_GREEN = "green";
        public static final String PICTURE_EFFECT_TOY_CAMERA_EFFECT_MAGENTA = "magenta";
        public static final String PICTURE_EFFECT_TOY_CAMERA_EFFECT_NORMAL = "normal";
        public static final String PICTURE_EFFECT_TOY_CAMERA_EFFECT_WARM = "warm";
        public static final String PICTURE_EFFECT_WATERCOLOR = "watercolor";
        public static final String PICTURE_STORAGE_FMT_JPEG = "jpeg";
        public static final String PICTURE_STORAGE_FMT_RAW = "raw";
        public static final String PICTURE_STORAGE_FMT_RAWJPEG = "rawjpeg";
        public static final String QUICK_AF_C_WO_AEL = "afc_woaf";
        public static final String QUICK_AF_WO_AEL = "af_woaf";
        public static final String RED_EYE_REDUCTION_MODE_AUTO = "auto";
        public static final String RED_EYE_REDUCTION_MODE_OFF = "off";
        public static final String RED_EYE_REDUCTION_MODE_ON = "on";
        public static final String SCENE_MODE_ADVANCE_SPORTS = "advance-sports";
        public static final String SCENE_MODE_ANTI_MOTION_BLUR = "anti-motion-blur";
        public static final String SCENE_MODE_APERTURE_PRIORITY = "aperture-priority";
        public static final String SCENE_MODE_BACKGROUND_DEFOCUS = "background-defocus";
        public static final String SCENE_MODE_BACK_LIGHT = "back-light";
        public static final String SCENE_MODE_CONT_PRIORITY_AE = "cont-priority-ae";
        public static final String SCENE_MODE_CONT_PRIORITY_AE_CROP = "cont-priority-ae-crop";
        public static final String SCENE_MODE_GOURMET = "gourmet";
        public static final String SCENE_MODE_HAND_HELD_TWILIGHT = "hand-held-twilight";
        public static final String SCENE_MODE_HIGH_SENSITIVITY = "high-sensitivity";
        public static final String SCENE_MODE_HIGH_SPEED_SHUTTER = "high-speed-shutter";
        public static final String SCENE_MODE_LOW_LIGHT = "low-light";
        public static final String SCENE_MODE_MACRO = "macro";
        public static final String SCENE_MODE_MAGNIFIER = "magnifier";
        public static final String SCENE_MODE_MANUAL_EXPOSURE = "manual-exposure";
        public static final String SCENE_MODE_MY_PHOTO_STYLE = "my-photo-style";
        public static final String SCENE_MODE_MY_PHOTO_STYLE_IN_PREMIER = "my-photo-style-in-premier";
        public static final String SCENE_MODE_NIGHT_SHOT = "night-shot";
        public static final String SCENE_MODE_PET = "pet";
        public static final String SCENE_MODE_PICTURE_EFFECT = "picture-effect";
        public static final String SCENE_MODE_PROGRAM_AUTO = "program-auto";
        public static final String SCENE_MODE_SHUTTER_PRIORITY = "shutter-speed";
        public static final String SCENE_MODE_SOFT_SKIN = "soft-skin";
        public static final String SCENE_MODE_SPOTLIGHT = "spotlight";
        public static final String SCENE_MODE_SUNRISE_SUNSET = "sunrise-sunset";
        public static final String SCENE_MODE_ULTRA_SENSITIVITY = "ultra-sensitivity";
        public static final String SCENE_MODE_UNDERWATER = "underwater";
        public static final String SHOOTING_PREVIEW_MODE_IRIS = "iris";
        public static final String SHOOTING_PREVIEW_MODE_IRIS_SS_ISO = "iris_ss_iso";
        public static final String SHOOTING_PREVIEW_MODE_IRIS_SS_ISO_AEUNLOCK = "iris_ss_iso_aeunlock";
        public static final String SHOOTING_PREVIEW_MODE_OFF = "off";
        public static final String WHITE_BALANCE_COLOR_TEMP = "color-temp";
        public static final String WHITE_BALANCE_CUSTOM = "custom";
        public static final String WHITE_BALANCE_FLASH = "flash";
        public static final String WHITE_BALANCE_FLUORESCENT_COOLWHITE = "fluorescent-coolwhite";
        public static final String WHITE_BALANCE_FLUORESCENT_DAYLIGHT = "fluorescent-daylight";
        public static final String WHITE_BALANCE_FLUORESCENT_DAYWHITE = "fluorescent-daywhite";
        public static final String WHITE_BALANCE_UNDERWATER_BLUE = "underwater-blue";
        public static final String WHITE_BALANCE_UNDERWATER_GREEN = "underwater-green";

        public String getAntiHandBlurMode() { throw new RuntimeException(); }
        public int getAperture() { throw new RuntimeException(); }
        public String getAutoExposureLock() { throw new RuntimeException(); }
        public String getAutoFocusMode() { throw new RuntimeException(); }
        public int getAutoShutterSpeedLowLimit() { throw new RuntimeException(); }
        public boolean getAutoWhiteBalanceLock() { throw new RuntimeException(); }
        public String getBracketMode() { throw new RuntimeException(); }
        public String getBracketOrder() { throw new RuntimeException(); }
        public String getBracketStepPeriod() { throw new RuntimeException(); }
        public String getBurstDriveButtonReleaseBehave() { throw new RuntimeException(); }
        public String getBurstDriveSpeed() { throw new RuntimeException(); }
        public int getColorCompensationForWhiteBalance() { throw new RuntimeException(); }
        public String getColorMode() { throw new RuntimeException(); }
        public String getColorSelectMode() { throw new RuntimeException(); }
        public int getColorTemperatureForWhiteBalance() { throw new RuntimeException(); }
        public int getContrast() { throw new RuntimeException(); }
        public int getCustomWhiteBalance() { throw new RuntimeException(); }
        public int getDROLevel() { throw new RuntimeException(); }
        public String getDROMode() { throw new RuntimeException(); }
        public String getDriveMode() { throw new RuntimeException(); }
        public String getExposureBracketMode() { throw new RuntimeException(); }
        public int getExposureBracketPeriod() { throw new RuntimeException(); }
        public String getFaceDetectionMode() { throw new RuntimeException(); }
        public int getFlashCompensation() { throw new RuntimeException(); }
        public float getFlashCompensationStep() { throw new RuntimeException(); }
        public String getFlashType() { throw new RuntimeException(); }
        public String getFocusAreaMode() { throw new RuntimeException(); }
        public android.util.Pair<Integer, Integer> getFocusPoint() { throw new RuntimeException(); }
        public int getFocusPointIndex() { throw new RuntimeException(); }
        public int getHDRExposureDifferenceLevel() { throw new RuntimeException(); }
        public float getHDRExposureDifferenceLevelStep() { throw new RuntimeException(); }
        public String getHDRMode() { throw new RuntimeException(); }
        public int getISOSensitivity() { throw new RuntimeException(); }
        public boolean getLensCorrection() { throw new RuntimeException(); }
        public int getLensCorrectionLevel(String arg0) { throw new RuntimeException(); }
        public int getLightBalanceForWhiteBalance() { throw new RuntimeException(); }
        public int getMaxColorCompensationForWhiteBalance() { throw new RuntimeException(); }
        public int getMaxColorSelectChannels() { throw new RuntimeException(); }
        public int getMaxColorTemperatureForWhiteBalance() { throw new RuntimeException(); }
        public int getMaxContrast() { throw new RuntimeException(); }
        public int getMaxDROLevel() { throw new RuntimeException(); }
        public int getMaxFlashCompensation() { throw new RuntimeException(); }
        public int getMaxFocusShift() { throw new RuntimeException(); }
        public int getMaxHDRExposureDifferenceLevel() { throw new RuntimeException(); }
        public int getMaxLensCorrectionLevel(String arg0) { throw new RuntimeException(); }
        public int getMaxLightBalanceForWhiteBalance() { throw new RuntimeException(); }
        public int getMaxNumDetectedFaces() { throw new RuntimeException(); }
        public int getMaxNumOfBurstPicture() { throw new RuntimeException(); }
        public int getMaxPictureEffectHDRArtEffectLevel() { throw new RuntimeException(); }
        public int getMaxPictureEffectIllustEffectLevel() { throw new RuntimeException(); }
        public int getMaxPictureEffectRoughMonoEffectLevel() { throw new RuntimeException(); }
        public int getMaxPictureEffectSoftFocusEffectLevel() { throw new RuntimeException(); }
        public int getMaxPictureEffectWaterColorEffectLevel() { throw new RuntimeException(); }
        public int getMaxSaturation() { throw new RuntimeException(); }
        public int getMaxSharpness() { throw new RuntimeException(); }
        public int getMaxToyCameraTuning() { throw new RuntimeException(); }
        public String getMeteringMode() { throw new RuntimeException(); }
        public int getMinColorCompensationForWhiteBalance() { throw new RuntimeException(); }
        public int getMinColorTemperatureForWhiteBalance() { throw new RuntimeException(); }
        public int getMinContrast() { throw new RuntimeException(); }
        public int getMinFlashCompensation() { throw new RuntimeException(); }
        public int getMinFocusShift() { throw new RuntimeException(); }
        public int getMinHDRExposureDifferenceLevel() { throw new RuntimeException(); }
        public int getMinLensCorrectionLevel(String arg0) { throw new RuntimeException(); }
        public int getMinLightBalanceForWhiteBalance() { throw new RuntimeException(); }
        public int getMinPictureEffectHDRArtEffectLevel() { throw new RuntimeException(); }
        public int getMinPictureEffectIllustEffectLevel() { throw new RuntimeException(); }
        public int getMinPictureEffectRoughMonoEffectLevel() { throw new RuntimeException(); }
        public int getMinPictureEffectSoftFocusEffectLevel() { throw new RuntimeException(); }
        public int getMinPictureEffectWaterColorEffectLevel() { throw new RuntimeException(); }
        public int getMinSaturation() { throw new RuntimeException(); }
        public int getMinSharpness() { throw new RuntimeException(); }
        public int getMinToyCameraTuning() { throw new RuntimeException(); }
        public boolean getMultiShootNRMode() { throw new RuntimeException(); }
        public int getNumOfBracketPicture() { throw new RuntimeException(); }
        public int getNumOfBurstPicture() { throw new RuntimeException(); }
        public int getNumOfCustomWhiteBalance() { throw new RuntimeException(); }
        public boolean getOVFPreviewMode() { throw new RuntimeException(); }
        public String getPictureEffect() { throw new RuntimeException(); }
        public int getPictureEffectHDRArtEffectLevel() { throw new RuntimeException(); }
        public int getPictureEffectIllustEffectLevel() { throw new RuntimeException(); }
        public String getPictureEffectMiniatureFocusArea() { throw new RuntimeException(); }
        public String getPictureEffectPartColorEffect() { throw new RuntimeException(); }
        public String getPictureEffectPosterizationEffect() { throw new RuntimeException(); }
        public int getPictureEffectRoughMonoEffectLevel() { throw new RuntimeException(); }
        public int getPictureEffectSoftFocusEffectLevel() { throw new RuntimeException(); }
        public String getPictureEffectSoftHightKeyEffect() { throw new RuntimeException(); }
        public String getPictureEffectToyCameraEffect() { throw new RuntimeException(); }
        public int getPictureEffectWaterColorEffectLevel() { throw new RuntimeException(); }
        public String getPictureStorageFormat() { throw new RuntimeException(); }
        public String getRedEyeReductionMode() { throw new RuntimeException(); }
        public boolean getRemoteControlMode() { throw new RuntimeException(); }
        public int getSaturation() { throw new RuntimeException(); }
        public int getSelfTimer() { throw new RuntimeException(); }
        public int getSharpness() { throw new RuntimeException(); }
        public String getShootingPreviewMode() { throw new RuntimeException(); }
        public android.util.Pair<Integer, Integer> getShutterSpeed() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedAntiHandBlurModes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedAutoExposureLocks() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedAutoFocusModes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedBracketModes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedBracketOrders() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedBracketStepPeriods() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedBurstDriveButtonReleaseBehaves() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedBurstDriveSpeeds() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedColorModes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedColorSelectModes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedDROModes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedDriveModes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedExposureBracketModes() { throw new RuntimeException(); }
        public java.util.List<Integer> getSupportedExposureBracketPeriods() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedFaceDetectionModes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedFlashTypes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedFocusAreaModes() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedHDRModes() { throw new RuntimeException(); }
        public java.util.List<Integer> getSupportedISOSensitivities() { throw new RuntimeException(); }
        public java.util.List<Integer> getSupportedISOSensitivitiesForMultiShootNR() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedLensCorrections() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedMeteringModes() { throw new RuntimeException(); }
        public java.util.List<Integer> getSupportedNumsOfBracketPicture() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedPictureEffectMiniatureFocusAreas() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedPictureEffectPartColorEffects() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedPictureEffectPosterizationEffects() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedPictureEffectSoftHightKeyEffects() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedPictureEffectToyCameraEffects() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedPictureEffects() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedPictureStorageFormats() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedQuickAutoFocus() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedRedEyeReductionModes() { throw new RuntimeException(); }
        public java.util.List<Integer> getSupportedSelfTimers() { throw new RuntimeException(); }
        public java.util.List<String> getSupportedShootingPreviewModes() { throw new RuntimeException(); }
        public int getToyCameraTuning() { throw new RuntimeException(); }
        public boolean isAutoWhiteBalanceLockSupported() { throw new RuntimeException(); }
        public boolean isDirectShutterSupported() { throw new RuntimeException(); }
        public boolean isSupportedAutoShutterSpeedLowLimit() { throw new RuntimeException(); }
        public boolean isSupportedFocalLengthNotify() { throw new RuntimeException(); }
        public boolean isSupportedFocusShift() { throw new RuntimeException(); }
        public boolean isSupportedLensInfo() { throw new RuntimeException(); }
        public boolean isSupportedOVFPreviewMode() { throw new RuntimeException(); }
        public boolean isSupportedPreviewAnalize() { throw new RuntimeException(); }
        public boolean isSupportedRemoteControlMode() { throw new RuntimeException(); }
        public boolean isSupportedToggleFocusMode() { throw new RuntimeException(); }
        public void setAntiHandBlurMode(String arg) { throw new RuntimeException(); }
        public void setAutoExposureLock(String arg) { throw new RuntimeException(); }
        public void setAutoFocusMode(String arg) { throw new RuntimeException(); }
        public void setAutoShutterSpeedLowLimit(int arg) { throw new RuntimeException(); }
        public void setAutoWhiteBalanceLock(boolean arg) { throw new RuntimeException(); }
        public void setBracketMode(String arg) { throw new RuntimeException(); }
        public void setBracketOrder(String arg) { throw new RuntimeException(); }
        public void setBracketStepPeriod(String arg) { throw new RuntimeException(); }
        public void setBurstDriveButtonReleaseBehave(String arg) { throw new RuntimeException(); }
        public void setBurstDriveSpeed(String arg) { throw new RuntimeException(); }
        public void setColorCompensationForWhiteBalance(int arg) { throw new RuntimeException(); }
        public void setColorMode(String arg) { throw new RuntimeException(); }
        public void setColorSelectMode(String arg0, int[] arg1) { throw new RuntimeException(); }
        public void setColorTemperatureForWhiteBalance(int arg) { throw new RuntimeException(); }
        public void setContrast(int arg) { throw new RuntimeException(); }
        public void setCustomWhiteBalance(int arg) { throw new RuntimeException(); }
        public void setDROLevel(int arg) { throw new RuntimeException(); }
        public void setDROMode(String arg) { throw new RuntimeException(); }
        public void setDriveMode(String arg) { throw new RuntimeException(); }
        public void setExposureBracketMode(String arg) { throw new RuntimeException(); }
        public void setExposureBracketPeriod(int arg) { throw new RuntimeException(); }
        public void setFaceDetectionMode(String arg) { throw new RuntimeException(); }
        public void setFaceFrameRendering(boolean arg) { throw new RuntimeException(); }
        public void setFlashCompensation(int arg) { throw new RuntimeException(); }
        public void setFlashType(String arg) { throw new RuntimeException(); }
        public void setFocusAreaMode(String arg) { throw new RuntimeException(); }
        public void setFocusPoint(int arg) { throw new RuntimeException(); }
        public void setFocusPoint(int arg0, int arg1) { throw new RuntimeException(); }
        public void setHDRExposureDifferenceLevel(int arg) { throw new RuntimeException(); }
        public void setHDRMode(String arg) { throw new RuntimeException(); }
        public void setISOSensitivity(int arg) { throw new RuntimeException(); }
        public void setLensCorrection(boolean arg) { throw new RuntimeException(); }
        public void setLensCorrectionLevel(String arg0, int arg1) { throw new RuntimeException(); }
        public void setLightBalanceForWhiteBalance(int arg) { throw new RuntimeException(); }
        public void setMeteringMode(String arg) { throw new RuntimeException(); }
        public void setMultiShootNRMode(boolean arg) { throw new RuntimeException(); }
        public void setNumOfBracketPicture(int arg) { throw new RuntimeException(); }
        public void setNumOfBurstPicture(int arg) { throw new RuntimeException(); }
        public void setOVFPreviewMode(boolean arg) { throw new RuntimeException(); }
        public void setPictureEffect(String arg) { throw new RuntimeException(); }
        public void setPictureEffectHDRArtEffectLevel(int arg) { throw new RuntimeException(); }
        public void setPictureEffectIllustEffectLevel(int arg) { throw new RuntimeException(); }
        public void setPictureEffectMiniatureFocusArea(String arg) { throw new RuntimeException(); }
        public void setPictureEffectPartColorEffect(String arg) { throw new RuntimeException(); }
        public void setPictureEffectPosterizationEffect(String arg) { throw new RuntimeException(); }
        public void setPictureEffectRoughMonoEffectLevel(int arg) { throw new RuntimeException(); }
        public void setPictureEffectSoftFocusEffectLevel(int arg) { throw new RuntimeException(); }
        public void setPictureEffectSoftHightKeyEffect(String arg) { throw new RuntimeException(); }
        public void setPictureEffectToyCameraEffect(String arg) { throw new RuntimeException(); }
        public void setPictureEffectWaterColorEffectLevel(int arg) { throw new RuntimeException(); }
        public void setPictureStorageFormat(String arg) { throw new RuntimeException(); }
        public void setRedEyeReductionMode(String arg) { throw new RuntimeException(); }
        public void setRemoteControlMode(boolean arg) { throw new RuntimeException(); }
        public void setSaturation(int arg) { throw new RuntimeException(); }
        public void setSelfTimer(int arg) { throw new RuntimeException(); }
        public void setSharpness(int arg) { throw new RuntimeException(); }
        public void setShootingPreviewMode(String arg) { throw new RuntimeException(); }
        public void setToyCameraTuning(int arg) { throw new RuntimeException(); }
        public void tryIgnoreInhibit() { throw new RuntimeException(); }
    }

    public interface PictureReviewInfoListener {
        void onGetInfo(ReviewInfo info, CameraEx cameraEx);
    }

    public interface PictureReviewStartListener {
        void onStart(CameraEx cameraEx);
    }

    public interface PowerZoomListener {
        int STATUS_AVAILABLE = 1;
        int STATUS_INAPPLICABLE = 3;
        int STATUS_UNAVAILABLE = 2;
        void onChanged(int status, CameraEx cameraEx);
    }

    public interface PreviewAnalizeListener {
        void onAnalizedData(AnalizedData data, CameraEx cameraEx);
    }

    public interface PreviewStartListener {
        void onStart(CameraEx cameraEx);
    }

    public interface ProgramLineListener {
        void onChanged(boolean line, CameraEx cameraEx);
    }

    public interface ProgramLineRangeOverListener {
        int MSG_TYPE_AERANGE = 1;
        int MSG_TYPE_AERANGE_BIT_AE = 1;
        int MSG_TYPE_AERANGE_BIT_IRIS = 4;
        int MSG_TYPE_AERANGE_BIT_SHUT = 2;
        int MSG_TYPE_EVRANGE = 2;
        int MSG_TYPE_METERINGRANGE = 3;
        void onAERange(boolean arg0, boolean arg1, boolean arg2, CameraEx cameraEx);
        void onEVRange(int arg, CameraEx cameraEx);
        void onMeteringRange(boolean arg, CameraEx cameraEx);
    }

    public interface RecordingMediaChangeCallback {
        void onRecordingMediaChange(CameraEx cameraEx);
    }

    public static class ReviewInfo {
        public com.sony.scalar.meta.Histogram hist;
        public com.sony.scalar.meta.TakenPhotoInfo photo;
    }

    public static class SelectedColor {
        public int Cb;
        public int Cr;
        public int Phase;
        public int Range;
        public int Saturation;
        public int Y;
    }

    public interface SettingChangedListener {
        int TYPE_AE_LOCK = 4;
        int TYPE_AUTO_FOCUS_MODE = 8;
        int TYPE_DRIVE_MODE = 12;
        int TYPE_FACE_DETECTION_MODE = 1;
        int TYPE_FLASH_MODE = 3;
        int TYPE_FLASH_TYPE = 10;
        int TYPE_FOCUS_AREA_MODE = 7;
        int TYPE_FOCUS_MODE = 2;
        int TYPE_ISO_SENSITIVITY = 6;
        int TYPE_METERING_MODE = 5;
        int TYPE_RED_EYE_REDUCTION_MODE = 14;
        int TYPE_REMOTE_CONTROL_MODE = 13;
        int TYPE_SCENE_MODE = 9;
        int TYPE_SELF_TIMER = 11;
        void onChanged(int[] settings, android.hardware.Camera.Parameters parameters, CameraEx cameraEx);
    }

    public interface ShutterListener {
        int STATUS_CANCELED = 1;
        int STATUS_ERROR = 2;
        int STATUS_OK = 0;
        void onShutter(int status, CameraEx cameraEx);
    }

    public interface ShutterSpeedChangeListener {
        void onShutterSpeedChange(ShutterSpeedInfo info, CameraEx cameraEx);
    }

    public static class ShutterSpeedInfo {
        public int currentAvailableMax_d;
        public int currentAvailableMax_n;
        public int currentAvailableMin_d;
        public int currentAvailableMin_n;
        public int currentShutterSpeed_d;
        public int currentShutterSpeed_n;
    }

    public static class WideTele {
        public int tele;
        public int wide;
    }

    public static final int PREVIEW_ASPECT_TYPE_16_9 = 1;
    public static final int PREVIEW_ASPECT_TYPE_3_2 = 0;
    public static final int PROGRAM_LINE_RESET = 0;

    public static CameraEx open(int id, OpenOptions options) { throw new RuntimeException(); }
    public void adjustAperture(int arg) { throw new RuntimeException(); }
    public void adjustProgramLine(int arg) { throw new RuntimeException(); }
    public void adjustShutterSpeed(int arg) { throw new RuntimeException(); }
    public void burstableTakePicture() { throw new RuntimeException(); }
    public boolean cancelSelfTimerShutter() { throw new RuntimeException(); }
    public void cancelTakePicture() { throw new RuntimeException(); }
    public void captureCustomWhiteBalance(CustomWhiteBalanceCallback arg) { throw new RuntimeException(); }
    public android.hardware.Camera.Parameters createEmptyParameters() { throw new RuntimeException(); }
    public ParametersModifier createParametersModifier(android.hardware.Camera.Parameters parameters) { throw new RuntimeException(); }
    public void decrementAperture() { throw new RuntimeException(); }
    public void decrementShutterSpeed() { throw new RuntimeException(); }
    public void disableSettingChangedTypes(int[] arg) { throw new RuntimeException(); }
    public void enableSettingChangedTypes(int[] arg) { throw new RuntimeException(); }
    public SelectedColor getChannelColorSelect(int arg) { throw new RuntimeException(); }
    public ExternalFlashInfo getExternalFlashInfo() { throw new RuntimeException(); }
    public boolean getFlashStatus() { throw new RuntimeException(); }
    public FocusAreaInfos[] getFocusAreaInfos(int arg) { throw new RuntimeException(); }
    public int getInhibitionInfo() { throw new RuntimeException(); }
    public LensInfo getLensInfo() { throw new RuntimeException(); }
    public android.hardware.Camera getNormalCamera() { throw new RuntimeException(); }
    public SelectedColor getPreviewDisplayColor(int arg0, int arg1) { throw new RuntimeException(); }
    public boolean hasSupportedParameters() { throw new RuntimeException(); }
    public void incrementAperture() { throw new RuntimeException(); }
    public void incrementShutterSpeed() { throw new RuntimeException(); }
    public void release() { throw new RuntimeException(); }
    public void resetQuickAutoFocus(String arg) { throw new RuntimeException(); }
    public void saveCustomWhiteBalance(int arg) { throw new RuntimeException(); }
    public final void setApertureChangeListener(ApertureChangeListener arg) { throw new RuntimeException(); }
    public void setAutoFocusDoneListener(AutoFocusDoneListener arg) { throw new RuntimeException(); }
    public void setAutoFocusStartListener(AutoFocusStartListener arg) { throw new RuntimeException(); }
    public final void setAutoISOSensitivityListener(AutoISOSensitivityListener arg) { throw new RuntimeException(); }
    public void setAutoPictureReviewControl(AutoPictureReviewControl arg) { throw new RuntimeException(); }
    public final void setAutoSceneModeListener(AutoSceneModeListener arg) { throw new RuntimeException(); }
    public void setColorSelectToChannel(int arg0, SelectedColor arg1) { throw new RuntimeException(); }
    public final void setEquipmentCallback(EquipmentCallback arg) { throw new RuntimeException(); }
    public final void setErrorCallback(ErrorCallback arg) { throw new RuntimeException(); }
    public final void setFaceDetectionListener(FaceDetectionListener arg) { throw new RuntimeException(); }
    public void setFlashChargingStateListener(FlashChargingStateListener arg) { throw new RuntimeException(); }
    public void setFlashEmittingListener(FlashEmittingListener arg) { throw new RuntimeException(); }
    public void setFocalLengthChangeListener(FocalLengthChangeListener arg) { throw new RuntimeException(); }
    public void setFocusLightStateListener(FocusLightStateListener arg) { throw new RuntimeException(); }
    public void setJpegListener(JpegListener arg) { throw new RuntimeException(); }
    public final void setPowerZoomListener(PowerZoomListener arg) { throw new RuntimeException(); }
    public void setPreviewAnalizeListener(PreviewAnalizeListener arg) { throw new RuntimeException(); }
    public void setPreviewStartListener(PreviewStartListener arg) { throw new RuntimeException(); }
    public final void setProgramLineListener(ProgramLineListener arg) { throw new RuntimeException(); }
    public void setProgramLineRangeOverListener(ProgramLineRangeOverListener arg) { throw new RuntimeException(); }
    public void setQuickAutoFocus(String arg) { throw new RuntimeException(); }
    public void setRecordingMedia(String arg0, RecordingMediaChangeCallback arg1) { throw new RuntimeException(); }
    public void setSettingChangedListener(SettingChangedListener arg) { throw new RuntimeException(); }
    public void setShutterListener(ShutterListener arg) { throw new RuntimeException(); }
    public final void setShutterSpeedChangeListener(ShutterSpeedChangeListener arg) { throw new RuntimeException(); }
    public void setToggleFocusMode(boolean arg) { throw new RuntimeException(); }
    public boolean shiftFocusPosition(int arg) { throw new RuntimeException(); }
    public void startCustomWhiteBalanceCapture() { throw new RuntimeException(); }
    public void startDirectShutter() { throw new RuntimeException(); }
    public void startFaceDetection(int arg) { throw new RuntimeException(); }
    public void startSelfTimerShutter() { throw new RuntimeException(); }
    public void stopCustomWhiteBalanceCapture() { throw new RuntimeException(); }
    public void stopDirectShutter(DirectShutterStoppedCallback arg) { throw new RuntimeException(); }
    public void stopFaceDetection() { throw new RuntimeException(); }
    public void withSupportedParameters(boolean arg) { throw new RuntimeException(); }
}
