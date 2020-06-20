package com.kroshz.homework_3_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String res="";

    private TextView tv_res;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnCom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        tv_res = findViewById(R.id.textView);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnCom = findViewById(R.id.btnCom);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    tv_res.setText("0");
                } else {res = res+0;
                    tv_res.setText(res);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "1";
                    tv_res.setText(res);
                } else {res = res+1;
                    tv_res.setText(res);
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "2";
                    tv_res.setText(res);
                } else {res = res+2;
                    tv_res.setText(res);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "3";
                    tv_res.setText(res);
                } else {res = res+3;
                    tv_res.setText(res);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "4";
                    tv_res.setText(res);
                } else {res = res+4;
                    tv_res.setText(res);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "5";
                    tv_res.setText(res);
                } else {res = res+5;
                    tv_res.setText(res);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "6";
                    tv_res.setText(res);
                } else {res = res+6;
                    tv_res.setText(res);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "7";
                    tv_res.setText(res);
                } else {res = res+7;
                    tv_res.setText(res);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "8";
                    tv_res.setText(res);
                } else {res = res+8;
                    tv_res.setText(res);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.isEmpty()) {
                    res = "9";
                    tv_res.setText(res);
                } else {res = res+9;
                    tv_res.setText(res);
                }
            }
        });

        btnCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = ".";
                if (res.isEmpty())  {
                    res = "0.";
                    tv_res.setText(res);
                } else if (res.indexOf(sub) != -1) {
                    tv_res.setText(res);
                } else {res = res+".";
                    tv_res.setText(res);
                }
            }
        });
    }
}
