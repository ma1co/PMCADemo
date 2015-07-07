package com.github.ma1co.pmcademo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import com.sony.scalar.provider.AvindexStore;

public class ImageActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        long id = getIntent().getLongExtra("id", 0);

        Uri baseUri = AvindexStore.Images.Media.getContentUri(AvindexStore.Images.Media.EXTERNAL_DEFAULT_MEDIA_ID);
        byte[] imageData = AvindexStore.Images.Media.getScreennail(getContentResolver(), baseUri, id);
        Bitmap image = BitmapFactory.decodeByteArray(imageData, 0, imageData.length);

        imageView.setImageBitmap(image);
    }
}
