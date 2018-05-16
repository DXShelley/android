package com.example.componentlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class SingleChooseActivity extends AppCompatActivity {

    private Button submit;
    private RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_choose);
        submit = findViewById(R.id.btnSubmit);
        radioButton = findViewById(R.id.RadioB);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (radioButton.isChecked()){
                        Toast.makeText(SingleChooseActivity.this,"正确！",Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(SingleChooseActivity.this,"错误！",Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}
