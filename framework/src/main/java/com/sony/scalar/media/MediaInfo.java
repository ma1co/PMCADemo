package com.sony.scalar.media;

public abstract class MediaInfo {
    public static final int MEDIA_TYPE_MS = 2;
    public static final int MEDIA_TYPE_SD = 1;
    public static final int MEDIA_TYPE_UNKNOWN = 0;

    public abstract int getMediaType();
    public abstract boolean isEyeFi();
    public abstract boolean isFakeMs();
}
