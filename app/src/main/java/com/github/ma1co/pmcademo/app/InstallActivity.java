package com.github.ma1co.pmcademo.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class InstallActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    protected class SpkListItem extends ListAdapter.ListItem {
        private File file;

        public SpkListItem(File file) {
            this.file = file;
        }

        @Override
        public String getText1() {
            return file.getName();
        }

        public File getFile() {
            return file;
        }
    }

    private ListView listView;
    private File tmpFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(this);

        tmpFile = new File("/data/local/tmp/" + getPackageName() + "/app.1.spk");
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateList(new File(Environment.getExternalStorageDirectory(), "PMCADEMO"));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        SpkListItem item = (SpkListItem) adapterView.getItemAtPosition(position);
        installPackage(item.getFile());
    }

    protected void updateList(File dir) {
        ArrayList<SpkListItem> items = new ArrayList<SpkListItem>();

        for (File file : dir.listFiles()) {
            if (file.getName().toLowerCase().endsWith(".spk"))
                items.add(new SpkListItem(file));
        }

        listView.setAdapter(new ListAdapter<SpkListItem>(this, items.toArray(new SpkListItem[items.size()])));
    }

    protected void installPackage(File file) {
        try {
            tmpFile.delete();
            tmpFile.getParentFile().mkdirs();
            setPermissions(tmpFile.getParentFile());
            copyFile(file, tmpFile);
            setPermissions(tmpFile);
        } catch (IOException e) {}

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(tmpFile), "application/vnd.android.package-archive");
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        int result = data.getIntExtra("com.sony.scalar.dlsys.scalarainstaller.ResultCode", 0);
        Toast.makeText(this, "Result: " + result, Toast.LENGTH_LONG).show();
    }

    protected void setPermissions(File file) {
        file.setReadable(true, false);
        file.setWritable(true, false);
        file.setExecutable(true, false);
    }

    protected void copyFile(File src, File dst) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dst);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0)
            out.write(buf, 0, len);
        in.close();
        out.close();
    }
}
