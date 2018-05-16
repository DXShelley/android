package com.example.layoutlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity {
    private FrameLayout frameLayout;
    private ImageView editTextA;
    private ImageView editTextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        frameLayout = findViewById(R.id.root);
        editTextA = findViewById(R.id.iv1);
        editTextB = findViewById(R.id.iv2);
        showA();
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextA.getVisibility() == View.INVISIBLE){
                    showA();
                }else {
                    showB();
                }
            }
        });
    }

    private void showA(){
        editTextA.setVisibility(View.VISIBLE);
        editTextB.setVisibility(View.INVISIBLE);
    }
    private void showB(){
        editTextB.setVisibility(View.VISIBLE);
        editTextA.setVisibility(View.INVISIBLE);
    }

}
