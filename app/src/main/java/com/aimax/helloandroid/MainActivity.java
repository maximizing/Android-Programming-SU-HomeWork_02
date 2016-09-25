package com.aimax.helloandroid;

import
        android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int checkSum = 1;
    TextView tv;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv2);
        btn1 = (Button) findViewById(R.id.btn_one);
        btn2 = (Button) findViewById(R.id.btn_two);
        btn3 = (Button) findViewById(R.id.btn_three);
        btn4 = (Button) findViewById(R.id.btn_four);
        btn5 = (Button) findViewById(R.id.btn_five);
        btn6 = (Button) findViewById(R.id.btn_six);
        btn7 = (Button) findViewById(R.id.btn_seven);
        btn8 = (Button) findViewById(R.id.btn_eight);
        btn9 = (Button) findViewById(R.id.btn_nine);
        btn0 = (Button) findViewById(R.id.btn_zero);
        btn_clear = (Button) findViewById(R.id.btn_clear);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn_clear.setOnClickListener(this);

        tv.setText("");

    }

    @Override
    public void onClick(View v) {
//        Toast t = Toast.makeText(this,"Press buutton 1",Toast.LENGTH_LONG);
//        t.show();


        switch (v.getId()) {
            default:
                break;
            case R.id.btn_one:
                checkTextView(btn1.getText().toString());
                break;
            case R.id.btn_two:
                checkTextView(btn2.getText().toString());
                break;
            case R.id.btn_three:
                checkTextView(btn3.getText().toString());
                break;
            case R.id.btn_four:
                checkTextView(btn4.getText().toString());
                break;
            case R.id.btn_five:
                checkTextView(btn5.getText().toString());
                break;
            case R.id.btn_six:
                checkTextView(btn6.getText().toString());
                break;
            case R.id.btn_seven:
                checkTextView(btn7.getText().toString());
                break;
            case R.id.btn_eight:
                checkTextView(btn8.getText().toString());
                break;
            case R.id.btn_nine:
                checkTextView(btn9.getText().toString());
                break;
            case R.id.btn_zero:
                checkTextView(btn0.getText().toString());
                break;
            case R.id.btn_clear:
                tv.setText("");
                checkSum = 1;
                break;
        }

    }

    public void checkTextView(String button) {
         if (checkSum < 7){
            tv.setText(tv.getText().toString() + button);
             checkSum++;
        }
    }
}
