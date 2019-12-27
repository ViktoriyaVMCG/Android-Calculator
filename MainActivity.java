package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText Display;
    Button btn_minus, btn_nine, btn_eight, btn_seven, btn_four,
            btn_five, btn_six, btn_plus, btn_one, btn_two, btn_three,
            btn_zero, btn_equ, btn_C, btn_M, btn_D;

    float val, vl;
    char t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_C = (Button) findViewById(R.id.btn_C);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_nine = (Button) findViewById(R.id.btn_nine);
        btn_eight = (Button) findViewById(R.id.btn_eight);
        btn_seven = (Button) findViewById(R.id.btn_seven);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_five = (Button) findViewById(R.id.btn_five);
        btn_six = (Button) findViewById(R.id.btn_six);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_zero = (Button) findViewById(R.id.btn_zero);
        btn_equ = (Button) findViewById(R.id.btn_equ);
        btn_M = (Button) findViewById(R.id.btn_M);
        btn_D = (Button) findViewById(R.id.btn_D);

        Display = (EditText) findViewById(R.id.Display);

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "1");
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "2");
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "3");
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "4");
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "5");
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "6");
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "7");
            }
        });

        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "8");
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "9");
            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Display.getText() + "0");
            }
        });

        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Text = Display.getText().toString();
                Display.setText(" ");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = Float.parseFloat(Display.getText()+"");
                t='+';
                Display.setText(null);
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = Float.parseFloat(Display.getText()+"");
                t='-';
                Display.setText(null);
            }
        });

        btn_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = Float.parseFloat(Display.getText()+"");
                t='*';
                Display.setText(null);
            }
        });

        btn_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = Float.parseFloat(Display.getText()+"");
                t='/';
                Display.setText(null);
            }
        });

        btn_equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               vl = Float.parseFloat(Display.getText()+"");
               switch(t)
               {
                   case '+':
                       Display.setText(val+vl+"");
                       break;
                   case '-':
                       Display.setText(val-vl+"");
                       break;
                   case '*':
                       Display.setText(val*vl+"");
                       break;
                   case '/':
                       Display.setText(val/vl+"");
                       break;
               }

            }
        });

    }
}
