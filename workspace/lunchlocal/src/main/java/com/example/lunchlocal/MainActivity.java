package com.example.lunchlocal;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_lunch_aty);
      //  Uri uri = getIntent().getData();
        ImageView imageView = new ImageView(MainActivity.this);
        imageView.setImageResource(R.mipmap.ic_launcher_round);
        setContentView(imageView);

    }
}
