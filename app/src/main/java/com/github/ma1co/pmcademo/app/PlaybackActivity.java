package com.github.ma1co.pmcademo.app;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;
import com.sony.scalar.media.AvindexContentInfo;
import com.sony.scalar.provider.AvindexStore;

public class PlaybackActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ListView listView = (ListView) findViewById(R.id.listView);

        Uri baseUri = AvindexStore.Images.Media.getContentUri(AvindexStore.Images.Media.EXTERNAL_DEFAULT_MEDIA_ID);
        Cursor cursor = getContentResolver().query(baseUri, AvindexStore.Images.Media.ALL_COLUMNS, null, null, null);

        listView.setAdapter(new ResourceCursorAdapter(this, R.layout.image_list_item, cursor) {
            @Override
            public void bindView(View view, Context context, Cursor cursor) {
                String data = cursor.getString(cursor.getColumnIndex(AvindexStore.Images.Media.DATA));
                AvindexContentInfo info = AvindexStore.Images.Media.getImageInfo(data);

                String filename = info.getAttribute(AvindexContentInfo.TAG_DCF_TBL_FILE_NAME);
                String date = info.getAttribute(AvindexContentInfo.TAG_DATETIME);
                byte[] thumbnailData = info.getThumbnail();
                Bitmap thumbnail = BitmapFactory.decodeByteArray(thumbnailData, 0, thumbnailData.length);

                ((TextView) view.findViewById(android.R.id.text1)).setText(filename);
                ((TextView) view.findViewById(android.R.id.text2)).setText(date);
                ((ScalingBitmapView) view.findViewById(R.id.imageView)).setImageBitmap(thumbnail);
            }
        });

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long listId) {
        Cursor cursor = (Cursor) adapterView.getItemAtPosition(position);
        long id = cursor.getLong(cursor.getColumnIndex(AvindexStore.Images.Media._ID));

        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }
}
