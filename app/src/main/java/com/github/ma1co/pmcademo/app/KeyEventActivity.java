package com.github.ma1co.pmcademo.app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class KeyEventActivity extends BaseActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        textView = (TextView) findViewById(R.id.logView);
    }

    protected void log(String msg) {
        textView.append(msg + "\n");
    }

    protected boolean logKey(Boolean down, String key) {
        log(key + " key " + (down ? "pressed" : "released"));
        return true;
    }

    protected boolean logDial(String key, int value) {
        log(key + " dial changed: " + value);
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (!super.onKeyDown(keyCode, event))
            log("Unknown key pressed: " + keyCode + " / " + event.getScanCode());
        return true;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (!super.onKeyUp(keyCode, event))
            log("Unknown key released: " + keyCode + " / " + event.getScanCode());
        return true;
    }

    protected boolean onUpKeyDown() { return logKey(true, "up"); }
    protected boolean onUpKeyUp() { return logKey(false, "up"); }
    protected boolean onDownKeyDown() { return logKey(true, "down"); }
    protected boolean onDownKeyUp() { return logKey(false, "down"); }
    protected boolean onLeftKeyDown() { return logKey(true, "left"); }
    protected boolean onLeftKeyUp() { return logKey(false, "left"); }
    protected boolean onRightKeyDown() { return logKey(true, "right"); }
    protected boolean onRightKeyUp() { return logKey(false, "right"); }
    protected boolean onEnterKeyDown() { return logKey(true, "enter"); }
    protected boolean onEnterKeyUp() { return logKey(false, "enter"); }
    protected boolean onFnKeyDown() { return logKey(true, "fn"); }
    protected boolean onFnKeyUp() { return logKey(false, "fn"); }
    protected boolean onAelKeyDown() { return logKey(true, "ael"); }
    protected boolean onAelKeyUp() { return logKey(false, "ael"); }
    protected boolean onMenuKeyDown() { return logKey(true, "menu"); }
    protected boolean onMenuKeyUp() { return logKey(false, "menu"); }
    protected boolean onFocusKeyDown() { return logKey(true, "focus"); }
    protected boolean onFocusKeyUp() { return logKey(false, "focus"); }
    protected boolean onShutterKeyDown() { return logKey(true, "shutter"); }
    protected boolean onShutterKeyUp() { return logKey(false, "shutter"); }
    protected boolean onPlayKeyDown() { return logKey(true, "play"); }
    protected boolean onPlayKeyUp() { return logKey(false, "play"); }
    protected boolean onMovieKeyDown() { return logKey(true, "movie"); }
    protected boolean onMovieKeyUp() { return logKey(false, "movie"); }
    protected boolean onC1KeyDown() { return logKey(true, "c1"); }
    protected boolean onC1KeyUp() { return logKey(false, "c1"); }
    protected boolean onLensAttached() { log("lens attached"); return true; }
    protected boolean onLensDetached() { log("lens detached"); return true; }
    protected boolean onUpperDialChanged(int value) { return logDial("upper dial", value); }
    protected boolean onLowerDialChanged(int value) { return logDial("lower dial", value); }
    protected boolean onModeDialChanged(int value) { return logDial("mode dial", value); }
}
