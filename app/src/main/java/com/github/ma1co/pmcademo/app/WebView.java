package com.github.ma1co.pmcademo.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class WebView extends android.webkit.WebView {
    public WebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == 0)
            return false;
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == 0)
            return false;
        return super.onKeyUp(keyCode, event);
    }
}
