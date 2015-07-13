package com.github.ma1co.pmcademo.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    protected class ActivityListItem extends ListAdapter.ListItem {
        private int nameResource;
        private Class<? extends Activity> clazz;

        public ActivityListItem(int nameResource, Class<? extends Activity> clazz) {
            this.nameResource = nameResource;
            this.clazz = clazz;
        }

        @Override
        public String getText1() {
            return getResources().getString(nameResource);
        }

        public Class<? extends Activity> getActivityClass() {
            return clazz;
        }
    }

    protected ActivityListItem activities[] = {
        new ActivityListItem(R.string.title_activity_camera, CameraActivity.class),
        new ActivityListItem(R.string.title_activity_key_event, KeyEventActivity.class),
        new ActivityListItem(R.string.title_activity_property, PropertyActivity.class),
        new ActivityListItem(R.string.title_activity_time, TimeActivity.class),
        new ActivityListItem(R.string.title_activity_wifi, WifiActivity.class),
        new ActivityListItem(R.string.title_activity_wifi_setting, WifiSettingActivity.class),
        new ActivityListItem(R.string.title_activity_wifi_direct, WifiDirectActivity.class),
        new ActivityListItem(R.string.title_activity_display, DisplayActivity.class),
        new ActivityListItem(R.string.title_activity_led, LedActivity.class),
        new ActivityListItem(R.string.title_activity_playback, PlaybackActivity.class),
        new ActivityListItem(R.string.title_activity_install, InstallActivity.class),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                StringWriter sw = new StringWriter();
                sw.append(throwable.toString());
                sw.append("\n");
                throwable.printStackTrace(new PrintWriter(sw));
                Logger.error(sw.toString());

                System.exit(0);
            }
        });

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter<ActivityListItem>(this, activities));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        ActivityListItem item = (ActivityListItem) adapterView.getItemAtPosition(position);
        startActivity(new Intent(this, item.getActivityClass()));
    }
}
