package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Aty1 extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty1);
        editText = findViewById(R.id.editText);

        findViewById(R.id.send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("result",editText.getText().toString());
                setResult(1,i);
                finish();
            }
        });
        findViewById(R.id.startActy2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Aty2.ACTION));
            }
        });
        Intent i = getIntent();
        textView = findViewById(R.id.tv);
        editText = findViewById(R.id.editText);
        Bundle bundle = i.getExtras();

        User user = (User) i.getSerializableExtra("user");
        textView.setText(user.getAge() + "");
      //  textView.setText(String.format("name=%s,age=%d,name1=%s",bundle.getString("name"),bundle.getInt("age"),bundle.getString("name1","默认名称")));

    }
}
