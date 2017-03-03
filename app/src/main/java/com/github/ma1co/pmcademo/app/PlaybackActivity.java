package com.github.ma1co.pmcademo.app;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;
import com.github.ma1co.openmemories.framework.ImageInfo;
import com.github.ma1co.openmemories.framework.MediaManager;

import java.text.SimpleDateFormat;

public class PlaybackActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    private MediaManager mediaManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ListView listView = (ListView) findViewById(R.id.listView);

        mediaManager = MediaManager.create(this);
        Cursor cursor = mediaManager.queryNewestImages();

        listView.setAdapter(new ResourceCursorAdapter(this, R.layout.image_list_item, cursor) {
            @Override
            public void bindView(View view, Context context, Cursor cursor) {
                ImageInfo info = mediaManager.getImageInfo(cursor);

                String text1 = info.getFolder() + "/" + info.getFilename();
                String text2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(info.getDate()) + " - " +
                        info.getWidth() + "x" + info.getHeight() + " - " +
                        info.getFocalLength() + "mm" + " - " +
                        "f" + info.getAperture() + " - " +
                        "1/" + (int) (info.getExposureTime() != 0 ? 1 / info.getExposureTime() : 0) + "s" + " - " +
                        "ISO" + info.getIso();
                Bitmap thumbnail = BitmapUtil.fixOrientation(BitmapFactory.decodeStream(info.getThumbnail()), info.getOrientation());

                ((TextView) view.findViewById(android.R.id.text1)).setText(text1);
                ((TextView) view.findViewById(android.R.id.text2)).setText(text2);
                ((ScalingBitmapView) view.findViewById(R.id.imageView)).setImageBitmap(thumbnail);
            }
        });

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long listId) {
        Cursor cursor = (Cursor) adapterView.getItemAtPosition(position);
        long id = mediaManager.getImageId(cursor);

        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }
}
