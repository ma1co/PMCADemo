package com.github.ma1co.pmcademo.app;

import android.os.Bundle;
import android.widget.ListView;

public class PropertyActivity extends BaseActivity {
    protected class PropertyListItem extends ListAdapter.ListItem {
        private int nameResource;
        private String value;

        public PropertyListItem(int nameResource, String value) {
            this.nameResource = nameResource;
            this.value = value;
        }

        @Override
        public String getText1() {
            return getResources().getString(nameResource);
        }

        @Override
        public String getText2() {
            return value;
        }
    }

    protected PropertyListItem properties[] = {
        new PropertyListItem(R.string.type, getDeviceInfo().isCamera() ? "Camera" : "Other"),
        new PropertyListItem(R.string.brand, getDeviceInfo().getBrand()),
        new PropertyListItem(R.string.model, getDeviceInfo().getModel()),
        new PropertyListItem(R.string.category, getDeviceInfo().getCategory().toString()),
        new PropertyListItem(R.string.productCode, getDeviceInfo().getProductCode()),
        new PropertyListItem(R.string.serial, getDeviceInfo().getSerialNumber()),
        new PropertyListItem(R.string.firmwareVersion, getDeviceInfo().getFirmwareVersion()),
        new PropertyListItem(R.string.hardwareVersion, Integer.toString(getDeviceInfo().getHardwareVersion())),
        new PropertyListItem(R.string.apiVersion, Integer.toString(getDeviceInfo().getApiVersion())),
        new PropertyListItem(R.string.androidVersion, getDeviceInfo().getAndroidVersion()),
        new PropertyListItem(R.string.androidSdk, Integer.toString(getDeviceInfo().getAndroidSdkVersion())),
        new PropertyListItem(R.string.androidIncremental, getDeviceInfo().getAndroidIncrementalVersion()),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter<PropertyListItem>(this, properties));
    }
}
