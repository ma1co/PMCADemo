package com.github.ma1co.pmcademo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ExitCompletedReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // KILL_MYSELF_TO_RELEASE_WEBVIEW_DB:
        // Kill process to release WebView when app is terminated (this hack is used by SNSDirect, too)
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
