package com.github.ma1co.pmcademo.app;

import android.os.Bundle;
import android.widget.ListView;
import com.sony.scalar.sysutil.ScalarProperties;

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

    protected class StringPropertyListItem extends PropertyListItem {
        public StringPropertyListItem(int nameResource, String prop) {
            super(nameResource, ScalarProperties.getString(prop));
        }
    }

    protected PropertyListItem properties[] = {
        new StringPropertyListItem(R.string.modelName, ScalarProperties.PROP_MODEL_NAME),
        new StringPropertyListItem(R.string.modelCode, ScalarProperties.PROP_MODEL_CODE),
        new StringPropertyListItem(R.string.modelSerial, ScalarProperties.PROP_MODEL_SERIAL_CODE),
        new PropertyListItem(R.string.firmwareVersion, ScalarProperties.getFirmwareVersion()),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter<PropertyListItem>(this, properties));
    }
}
