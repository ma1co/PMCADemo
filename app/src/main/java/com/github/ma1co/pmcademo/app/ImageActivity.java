package com.github.ma1co.pmcademo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.sony.scalar.provider.AvindexStore;

import java.io.InputStream;

public class ImageActivity extends BaseActivity {
    private Bitmap image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);

        ScalingBitmapView imageView = (ScalingBitmapView) findViewById(R.id.imageView);
        long id = getIntent().getLongExtra("id", 0);

        Uri baseUri = AvindexStore.Images.Media.getContentUri(AvindexStore.Images.Media.EXTERNAL_DEFAULT_MEDIA_ID);
        InputStream is = AvindexStore.Images.Media.getScreennailInputStream(getContentResolver(), baseUri, id);
        image = BitmapFactory.decodeStream(is);

        imageView.setImageBitmap(image);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        image.recycle();
        image = null;
    }
}
