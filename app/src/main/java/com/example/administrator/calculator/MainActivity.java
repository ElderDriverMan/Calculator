package com.example.administrator.calculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private  Button btn_0, btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    private  Button btn_empty,btn_delete,btn_brackets1,btn_brackets2,btn_multipty,btn_subtract,btn_add,btn_divide,btn_result,btn_point;
    private TextView tv_main_display;
    private StringBuffer data=new StringBuffer();
    private boolean equals=false;
    int brackets1=0;
    int brackets2=0;
    int negative=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        setContentView(R.layout.activity_main);
        init();
        click();
    }
    private void init(){
        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
        tv_main_display=findViewById(R.id.tv_main_display);
        btn_empty=findViewById(R.id.btn_empty);
        btn_delete=findViewById(R.id.btn_delete);
        btn_brackets1=findViewById(R.id.btn_brackets1);
        btn_brackets2=findViewById(R.id.btn_brackets2);
        btn_multipty=findViewById(R.id.btn_multipty);
        btn_subtract=findViewById(R.id.btn_subtract);
        btn_add=findViewById(R.id.btn_add);
        btn_divide=findViewById(R.id.btn_divide);
        btn_result=findViewById(R.id.btn_result);
        btn_point=findViewById(R.id.btn_point);
    }
    private  void click(){
    btn_0.setOnClickListener(this);
    btn_1.setOnClickListener(this);
    btn_2.setOnClickListener(this);
    btn_3.setOnClickListener(this);
    btn_4.setOnClickListener(this);
    btn_5.setOnClickListener(this);
    btn_6.setOnClickListener(this);
    btn_7.setOnClickListener(this);
    btn_8.setOnClickListener(this);
    btn_9.setOnClickListener(this);
    btn_empty.setOnClickListener(this);
    btn_delete.setOnClickListener(this);
    btn_brackets1.setOnClickListener(this);
    btn_brackets2.setOnClickListener(this);
    btn_multipty.setOnClickListener(this);
    btn_subtract.setOnClickListener(this);
    btn_add.setOnClickListener(this);
    btn_divide.setOnClickListener(this);
    btn_result.setOnClickListener(this);
    btn_point.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_0:
                if(equals) {
                    data=data.delete(0,data.length());
                    equals=false;
                }
                data=data.append("0");
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_1:
                if(equals) {
                    data=data.delete(0,data.length());
                    equals=false;
                }
                if(data.length()>0&&data.charAt(data.length()-1)==')'){
                    data=data.append("*1");
                } else {
                    data=data.append("1");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_2:
                if(equals){
                    data=data.delete(0,data.length());
                    equals=false;
                }
                if (data.length()>0&&data.charAt(data.length()-1)==')'){
                    data=data.append("*2");
                }else {
                    data=data.append("2");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_3:
                if (equals) {
                    data=data.delete(0,data.length());
                    equals=false;
                }
                if (data.length()>0&&data.charAt(data.length()-1)==')'){
                    data=data.append("*3");
                }else{
                    data=data.append("3");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_4:
                if(equals){
                    data=data.delete(0, data.length());
                    equals=false;
                }
                if(data.length()>0&&data.charAt(data.length()-1)==')'){
                    data=data.append("*4");
                }else{
                    data=data.append("4");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_5:
                if(equals){
                    data = data.delete(0,data.length());
                    equals = false;
                }
                if(data.length()>0&&data.charAt(data.length()-1)==')'){
                    data= data.append("*5");
                }else{
                    data = data.append("5");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_6:
                if(equals) {
                    data = data.delete(0, data.length());
                    equals = false;
                }
                if(data.length()>0&&data.charAt(data.length()-1)==')'){
                    data=data.append("*6");
                }else{
                    data=data.append("6");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_7:
                if(equals){
                    data=data.delete(0, data.length());
                    equals=false;
                }
                if(data.length()>0&&data.charAt(data.length()-1)==')'){
                    data=data.append("*7");
                }else{
                    data=data.append("7");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_8:
                if(equals){
                    data=data.delete(0,data.length());
                    equals=false;
                }
                if(data.length()>0 && data.charAt(data.length()-1)==')'){
                    data=data.append("*8");
                }else{
                    data=data.append("8");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_9:
                if(equals) {
                    data=data.delete(0,data.length());
                    equals = false;
                }
                if(data.length() > 0 && data.charAt(data.length()- 1)==')'){
                    data=data.append("*9");
                }else{
                    data=data.append("9");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_delete:
                if(equals){
                    equals=false;
                }
                if(data.length()!=0){
                    data=data.deleteCharAt(data.length()-1);
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_empty:
                if(equals){
                    equals=false;
                }
                data= data.delete(0, data.length());
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_brackets1:
                if(equals){
                    equals=false;
                }
                if(data.length()>0&&(data.charAt(data.length()-1)>='0'&&data.charAt(data.length()-1)<='9')){
                    data = data.append("*(");
                }
                if(data.length() == 0) {
                    data = data.append("(");
                }
                if (data.length() > 0 && (data.charAt(data.length() - 1) == '*' || data.charAt(data.length() - 1) == '/' || data.charAt(data.length() - 1) == '+' || data.charAt(data.length() - 1) == '-')) {
                    data = data.append("(");
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_brackets2:
                if (equals) {
                    equals = false;
                }
                int number = 0;
               brackets1= brackets2 = 0;
                if (data.length() != 0) {
                    for (int i = data.length() - 1; i >= 0; i--) {
                        if (brackets1== 0 && (data.charAt(i) >= '0' && data.charAt(i) <= '9')) {
                           number++;
                        }
                        if (data.charAt(i) == '(') {
                            brackets1++;
                        }
                        if (data.charAt(i) == ')') {
                           brackets2++;
                        }
                    }
                    if ((brackets1> brackets2) && number > 0) {
                        data = data.append(")");
                    }
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_multipty:
                if (equals) {
                    equals = false;
                }
                if (data.length() != 0) {
                    if ((data.charAt(data.length() - 1) >= '0' && data.charAt(data.length() - 1) <= '9') || data.charAt(data.length() - 1) == '.') {
                        if ((data.charAt(data.length() - 1) >= '0' && data.charAt(data.length() - 1) <= '9')) {
                            data = data.append("*");
                        }
                        if (data.charAt(data.length() - 1) == '.') {
                            data= data.append("0*");
                        }
                    }
                    if ((data.charAt(data.length() - 1) == ')')) {
                        data = data.append("*");
                    }
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_subtract:

                if (equals) {
                    equals = false;
                }
                if (data.length() != 0) {
                    if ((data.charAt(data.length() - 1) >= '0' && data.charAt(data.length() - 1) <= '9') || data.charAt(data.length() - 1) == '.' || data.charAt(data.length() - 1) == '(') {
                        if (data.charAt(data.length() - 1) >= '0' && data.charAt(data.length() - 1) <= '9') {
                            data = data.append("-");
                        }
                        if (data.charAt(data.length() - 1) == '.') {
                            data= data.append("0-");
                        }
                        if (data.charAt(data.length() - 1) == '(') {
                            data = data.append("-");
                            negative++;
                        }
                    } else if ((data.charAt(data.length() - 1) == ')')) {
                        data= data.append("-");
                    } else {
                        data = data.append("(-");
                    }
                } else {
                    data = data.append("(-");
                    negative++;
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_add:
                if (equals) {
                    equals = false;
                }
                if (data.length() != 0) {
                    if ((data.charAt(data.length() - 1) >= '0' && data.charAt(data.length() - 1) <= '9') || data.charAt(data.length() - 1) == '.') {
                        if ((data.charAt(data.length() - 1) >= '0' && data.charAt(data.length() - 1) <= '9')) {
                            data= data.append("+");
                        }
                        if (data.charAt(data.length() - 1) == '.') {
                            data = data.append("0+");
                        }
                    }
                    if ((data.charAt(data.length() - 1) == ')')) {
                        data = data.append("+");
                    }
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_divide:
                if (equals) {
                    equals = false;
                }
                if (data.length() != 0) {
                    if ((data.charAt(data.length() - 1) >= '0' && data.charAt(data.length() - 1) <= '9') || data.charAt(data.length() - 1) == '.') {
                        if ((data.charAt(data.length() - 1) >= '0' && data.charAt(data.length() - 1) <= '9')) {
                            data = data.append("/");
                        }
                        if (data.charAt(data.length() - 1) == '.') {
                            data = data.append("0/");
                        }
                    }
                    if ((data.charAt(data.length() - 1) == ')')) {
                        data = data.append("/");
                    }
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_point:
                if (equals) {
                    equals = false;
                }
                int point = 0;
                if (data.length() != 0) {
                    for (int i = data.length() - 1; i >= 0; i--) {
                        if (data.charAt(i) == '.') {
                            point++;
                        }
                        if (!(data.charAt(i) >= '0' && data.charAt(i) <= '9')) {
                            break;
                        }
                    }
                    if (point == 0) {
                        if (data.charAt(data.length() - 1) == '*' || data.charAt(data.length() - 1) == '/' || data.charAt(data.length() - 1) == '+' || data.charAt(data.length() - 1) == '-') {
                            data = data.append("0.");
                        } else {
                            data = data.append(".");
                        }
                    }
                }
                tv_main_display.setText(data.toString());
                break;
            case R.id.btn_result:
                if (equals) {
                    equals = false;
                }
                brackets2=brackets1= 0;
                if (data.length() != 0) {
                    for (int i = 0; i < data.length(); i++) {
                        if (data.charAt(i) == '(')
                            brackets1++;
                        if (data.charAt(i) == ')')
                            brackets2++;
                    }
                    if (brackets1!= brackets2) {
                        tv_main_display.setText("错误");
                    }
                    if (brackets1== brackets2&&((data.charAt(data.length() - 1) >= '0' && data.charAt(data.length() - 1) <= '9') || data.charAt(data.length() - 1) == ')')) {
                        equals = true;
                        negative= 0;
                        try {
                            tv_main_display.setText(Algorithm.Cal(Algorithm.intent(data)));
                            data = data.delete(0, data.length());
                            data.append(tv_main_display.getText().toString());
                        } catch (Exception e) {
                            tv_main_display.setText("错误");
                            data = data.delete(0, data.length());
                        }
                    }
                }
                break;
            default:
                break;

        }

    }
}




