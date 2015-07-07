package com.sony.scalar.media;

public abstract class AvindexContentFaceInfo {
    public abstract int getFacePriority(int defaultValue);
    public abstract int getFaceScore(int defaultValue);
    public abstract int getPositionX();
    public abstract int getPositionY();
    public abstract int getSizeHeight();
    public abstract int getSizeWidth();
    public abstract boolean hasFacePriority();
    public abstract boolean hasFaceScore();
}
