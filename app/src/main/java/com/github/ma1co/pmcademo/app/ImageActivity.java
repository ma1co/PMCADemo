package com.github.ma1co.pmcademo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.github.ma1co.openmemories.framework.ImageInfo;
import com.github.ma1co.openmemories.framework.MediaManager;

public class ImageActivity extends BaseActivity {
    private Bitmap image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);

        ScalingBitmapView imageView = (ScalingBitmapView) findViewById(R.id.imageView);
        long id = getIntent().getLongExtra("id", 0);

        MediaManager mediaManager = MediaManager.create(this);
        ImageInfo info = mediaManager.getImageInfo(id);
        image = BitmapUtil.fixOrientation(BitmapFactory.decodeStream(info.getPreviewImage()), info.getOrientation());

        imageView.setImageBitmap(image);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        image.recycle();
        image = null;
    }
}
