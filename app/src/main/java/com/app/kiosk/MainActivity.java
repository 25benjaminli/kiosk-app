package com.app.kiosk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String inputCode = "";

    protected void setInputCode(String s) {
        inputCode += s;
        TextView t = (TextView) findViewById(R.id.textBox);
        t.setText(inputCode);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        Button b0 = (Button) findViewById(R.id.zero);
        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("0");
                System.out.println(inputCode);
            }
        });

        Button b1 = (Button) findViewById(R.id.one);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("1");
                System.out.println(inputCode);
            }
        });

        Button b2 = (Button) findViewById(R.id.two);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("2");
                System.out.println(inputCode);
            }
        });

        Button b3 = (Button) findViewById(R.id.three);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("3");
                System.out.println(inputCode);
            }
        });

        Button b4 = (Button) findViewById(R.id.four);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("4");
                System.out.println(inputCode);
            }
        });

        Button b5 = (Button) findViewById(R.id.five);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("5");
                System.out.println(inputCode);
            }
        });

        Button b6 = (Button) findViewById(R.id.six);
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("6");
                System.out.println(inputCode);
            }
        });

        Button b7 = (Button) findViewById(R.id.seven);
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("7");
                System.out.println(inputCode);
            }
        });

        Button b8 = (Button) findViewById(R.id.eight);
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("8");
                System.out.println(inputCode);
            }
        });

        Button b9 = (Button) findViewById(R.id.nine);
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInputCode("9");
                System.out.println(inputCode);
            }
        });

        Button delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!inputCode.equals("")) {
                    inputCode = inputCode.substring(0, inputCode.length()-1);
                    System.out.println(inputCode);
                }

                TextView t = (TextView) findViewById(R.id.textBox);
                t.setText(inputCode);

            }
        });

        Button enter = (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                System.out.println("submitted information: " + inputCode);
                // put stuff here, ping the server, if it is invalid then clear, prompt the user to re-enter

                // reset
                inputCode = "";
                TextView t = (TextView) findViewById(R.id.textBox);
                t.setText("");
            }
        });
    }

}