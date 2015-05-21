package com.github.ma1co.pmcademo.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    protected class ActivityListItem {
        protected int nameResource;
        protected Class<? extends Activity> clazz;

        public ActivityListItem(int nameResource, Class<? extends Activity> clazz) {
            this.nameResource = nameResource;
            this.clazz = clazz;
        }

        @Override
        public String toString() {
            return getResources().getString(nameResource);
        }
    }

    ActivityListItem activities[] = {
        new ActivityListItem(R.string.title_activity_key_event, KeyEventActivity.class)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                System.exit(0);
            }
        });

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<ActivityListItem>(this, android.R.layout.simple_list_item_1, activities));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        ActivityListItem item = (ActivityListItem) adapterView.getItemAtPosition(position);
        startActivity(new Intent(this, item.clazz));
    }
}
