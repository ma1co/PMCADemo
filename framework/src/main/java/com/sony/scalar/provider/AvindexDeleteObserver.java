package com.sony.scalar.provider;

public interface AvindexDeleteObserver {
    int COMPLETE_RESULT_CANCEL = 1;
    int COMPLETE_RESULT_INTERNAL_ERROR = 2;
    int COMPLETE_RESULT_OK = 0;

    void onComplete(int result);
    void onProgress(int arg1, int arg2);
}
