package com.example.administrator.calculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private  Button btn_0;
    private  Button btn_1;
    private  Button btn_2;
    private  Button btn_3;
    private  Button btn_4;
    private  Button btn_5;
    private  Button btn_6;
    private  Button btn_7;
    private  Button btn_8;
    private  Button btn_9;
    private  Button btn_empty;
    private  Button btn_delete;
    private  Button btn_percent;
    private  Button btn_divide;
    private  Button btn_multipty;
    private  Button btn_subtract;
    private  Button btn_add;
    private  Button btn_result;
    private  Button btn_point;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        setContentView(R.layout.activity_main);
    }
}
