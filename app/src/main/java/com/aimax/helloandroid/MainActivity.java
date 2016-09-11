package com.aimax.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int checkFirst = 0;
    TextView tv;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    }

    @Override
    public void onClick(View v) {
//        Toast t = Toast.makeText(this,"Press buutton 1",Toast.LENGTH_LONG);
//        t.show();
        tv = (TextView) findViewById(R.id.tv2);

        switch (v.getId()) {
            default:
                break;
            case R.id.btn_one:
                checkTextView();
                tv.setText(tv.getText().toString() + "1");
                break;
            case R.id.btn_two:
                checkTextView();
                tv.setText(tv.getText().toString() + "2");
                break;
            case R.id.btn_three:
                checkTextView();
                tv.setText(tv.getText().toString() + "3");
                break;
            case R.id.btn_four:
                checkTextView();
                tv.setText(tv.getText().toString() + "4");
                break;
            case R.id.btn_five:
                checkTextView();
                tv.setText(tv.getText().toString() + "5");
                break;
            case R.id.btn_six:
                checkTextView();
                tv.setText(tv.getText().toString() + "6");
                break;
            case R.id.btn_seven:
                checkTextView();
                tv.setText(tv.getText().toString() + "7");
                break;
            case R.id.btn_eight:
                checkTextView();
                tv.setText(tv.getText().toString() + "8");
                break;
            case R.id.btn_nine:
                checkTextView();
                tv.setText(tv.getText().toString() + "9");
                break;
            case R.id.btn_zero:
                checkTextView();
                tv.setText(tv.getText().toString() + "0");
                break;
            case R.id.btn_clear:
                checkTextView();
                tv.setText("");
                break;
        }

    }

    public void checkTextView() {
        if (checkFirst < 1) {
            tv.setText("");
            checkFirst++;
        }
    }
}
