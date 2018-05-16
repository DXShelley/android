package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    findViewById(R.id.startActy).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,Aty1.class);
            Bundle bundle = new Bundle();
            bundle.putString("name","yuzhenquan");
            bundle.putInt("age",22);
            bundle.putString("name1","name1");
            User user = new User("yuzhenquan",23);
            i.putExtras(bundle);
            i.putExtra("user", user);
            i.putExtra("data","hello china");
            startActivityForResult(i,1);
        }
    });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView.setText("另一个activity返回的结果" + data.getStringExtra("result"));
        System.out.println(data.getStringExtra("result"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");

    }
}
