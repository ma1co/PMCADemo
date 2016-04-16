package com.github.ma1co.pmcademo.app;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimeActivity extends BaseActivity {
    private TextView textView;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        textView = (TextView) findViewById(R.id.logView);
        timer = new Timer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        displayCurrentTime();
                    }
                });
            }
        }, 0, 100);
    }

    @Override
    protected void onPause() {
        super.onPause();
        timer.cancel();
    }

    protected void displayCurrentTime() {
        Calendar calendar = getDateTime().getCurrentTime();
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
        int timeZoneOffset = calendar.getTimeZone().getRawOffset() / 1000 / 3600;
        textView.setText(date + " (GMT" + (timeZoneOffset >= 0 ? "+" : "") + timeZoneOffset + ":00)");
    }
}
