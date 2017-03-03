package com.github.ma1co.pmcademo.app;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;

public class BitmapUtil {
    public static Bitmap fixOrientation(Bitmap bitmap, int orientation) {
        int degrees = getExifOrientationDegrees(orientation);
        if (bitmap != null && degrees != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(degrees);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        return bitmap;
    }

    public static int getExifOrientationDegrees(int orientation) {
        switch (orientation) {
            case ExifInterface.ORIENTATION_ROTATE_90:
                return 90;
            case ExifInterface.ORIENTATION_ROTATE_180:
                return 180;
            case ExifInterface.ORIENTATION_ROTATE_270:
                return 270;
            default:
                return 0;
        }
    }
}
