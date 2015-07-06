package com.github.ma1co.pmcademo.app;

import android.os.Bundle;
import android.widget.TextView;
import com.sony.scalar.sysutil.PlainCalendar;
import com.sony.scalar.sysutil.TimeUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeActivity extends BaseActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        textView = (TextView) findViewById(R.id.logView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(getDate()));
    }

    protected Date getDate() {
        PlainCalendar calendar = TimeUtil.getCurrentCalendar();
        return new GregorianCalendar(calendar.year, calendar.month - 1, calendar.day, calendar.hour, calendar.minute, calendar.second).getTime();
    }
}
