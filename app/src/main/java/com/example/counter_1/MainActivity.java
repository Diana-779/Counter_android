package com.example.counter_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView txtCount;
private RadioButton rBtnUp, rBtnDown;
private Button btnCount;
private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rBtnUp = (RadioButton) findViewById(R.id.rBtnUpId);
        rBtnDown = (RadioButton) findViewById(R.id.rBtnDownId);
        txtCount = (TextView) findViewById(R.id.txtCountId);
        txtCount.setText(String.valueOf(count));
        btnCount = (Button) findViewById(R.id.btnCountId);


    }

    public void btnCountOnClickHandler(View view){
        if( rBtnUp.isChecked()) {
            count += 4;
        }
         else if(rBtnDown.isChecked()) {
             count -= 4;
        }
         txtCount.setText(String.valueOf(count));
    }
}