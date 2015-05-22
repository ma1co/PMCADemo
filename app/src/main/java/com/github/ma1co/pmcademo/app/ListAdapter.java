package com.github.ma1co.pmcademo.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter<T extends ListAdapter.ListItem> extends ArrayAdapter<T> {
    public static class ListItem {
        public String getText1() { return ""; }
        public String getText2() { return ""; }
    }

    public ListAdapter(Context context, T[] objects) {
        super(context, 0, objects);
    }

    @Override
    public android.view.View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(android.R.layout.simple_list_item_2, parent, false);
        T item = getItem(position);
        ((TextView) convertView.findViewById(android.R.id.text1)).setText(item.getText1());
        ((TextView) convertView.findViewById(android.R.id.text2)).setText(item.getText2());
        return convertView;
    }
}
