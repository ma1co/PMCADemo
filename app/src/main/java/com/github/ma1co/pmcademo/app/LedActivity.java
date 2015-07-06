package com.github.ma1co.pmcademo.app;

import com.sony.scalar.hardware.indicator.Light;

public class LedActivity extends BaseActivity {
    private String afLed = Light.LID_SELF_TIMER;
    private String cardLed = Light.LID_MEDIA_ACCS_MMC0;

    private String[] modes = {
        Light.PTN_OFF,
        Light.PTN_SLOW,
        Light.PTN_MIDDLE,
        Light.PTN_FAST,
        Light.PTN_ON,
    };
    private int currentMode = 0;

    @Override
    protected void onPause() {
        super.onPause();
        Light.setState(afLed, false);
        Light.setState(cardLed, false);
    }

    @Override
    protected boolean onEnterKeyUp() {
        currentMode = (currentMode + 1) % modes.length;
        Light.setState(cardLed, true, modes[currentMode]);
        return true;
    }

    @Override
    protected boolean onFocusKeyDown() {
        Light.setState(afLed, true);
        return true;
    }

    @Override
    protected boolean onFocusKeyUp() {
        Light.setState(afLed, false);
        return true;
    }
}
