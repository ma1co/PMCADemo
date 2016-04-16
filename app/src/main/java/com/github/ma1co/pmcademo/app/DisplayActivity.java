package com.github.ma1co.pmcademo.app;

import android.graphics.Point;
import android.os.Bundle;
import android.widget.TextView;
import com.github.ma1co.openmemories.framework.DisplayManager;

import java.util.Arrays;

public class DisplayActivity extends BaseActivity {
    private DisplayManager.Display displays[] = {
        DisplayManager.Display.SCREEN,
        DisplayManager.Display.FINDER,
        DisplayManager.Display.NONE,
    };

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        textView = (TextView) findViewById(R.id.logView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        logDisplay();
    }

    @Override
    protected boolean onEnterKeyUp() {
        int currentDisplay = Arrays.asList(displays).indexOf(getDisplayManager().getActiveDisplay());
        int nextDisplay = (currentDisplay + 1) % displays.length;
        getDisplayManager().setActiveDisplay(displays[nextDisplay]);
        return true;
    }

    @Override
    public void displayChanged(DisplayManager.Display display) {
        super.displayChanged(display);
        logDisplay();
    }

    protected void logDisplay() {
        DisplayManager.Display display = getDisplayManager().getActiveDisplay();
        logDisplay(display.toString(), getDisplayManager().getDisplayInfo(display));
        logDisplay("Frame buffer", getDisplayManager().getFrameBufferInfo());
    }

    protected void logDisplay(String displayName, DisplayManager.DisplayInfo info) {
        Point aspect = approxFraction(info.aspectRatio, 16);
        log(displayName + ": " + info.width + " x " + info.height + " (" + aspect.x + ":" + aspect.y + ")");
    }

    protected void log(String msg) {
        textView.append(msg + "\n");
    }

    protected Point approxFraction(float n, int maxDenominator) {
        float bestError = 0;
        int bestDenominator = 0;
        for (int i=1; i<=maxDenominator; i++) {
            float error = Math.abs(n - 1f * Math.round(n * i) / i);
            if (error < bestError || i == 1) {
                bestError = error;
                bestDenominator = i;
            }
        }
        return new Point(Math.round(n * bestDenominator), bestDenominator);
    }
}
