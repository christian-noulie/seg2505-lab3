package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, egal, plus, moins, div, mult, clear;
    TextView screen;
    float val1, val2;
    boolean add, equals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.bouton0);
        b1 = (Button) findViewById(R.id.bouton1);
        b2 = (Button) findViewById(R.id.bouton2);
        b3 = (Button) findViewById(R.id.bouton3);
        b4 = (Button) findViewById(R.id.bouton4);
        b5 = (Button) findViewById(R.id.bouton5);
        b6 = (Button) findViewById(R.id.bouton6);
        b7 = (Button) findViewById(R.id.bouton7);
        b8 = (Button) findViewById(R.id.bouton8);
        b9 = (Button) findViewById(R.id.bouton9);
        egal = (Button) findViewById(R.id.boutone);
        plus = (Button) findViewById(R.id.boutadd);
        moins = (Button) findViewById(R.id.boutmin);
        div = (Button) findViewById(R.id.boutdiv);
        mult = (Button) findViewById(R.id.boutmul);
        clear = (Button) findViewById(R.id.boutonC);

        screen = (TextView) findViewById(R.id.text);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "9");
            }
        });
        egal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equals = true;
                val2 = Float.parseFloat(screen.getText() + " ");

                if(add){
                    screen.setText((val1 + val2) + " ");
                    add = false;
                }
            }
        });
        moins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen == null){
                    screen.setText(null);
                }
                val1 = Float.parseFloat(screen.getText() + " ");
                add = true;
                screen.setText(null);
                screen.setText(val1 + " - ");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen == null){
                    screen.setText(null);
                }
                val1 = Float.parseFloat(screen.getText() + " ");
                add = true;
                screen.setText(null);
                screen.setText(val1 + " / ");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen == null){
                    screen.setText(null);
                }
                val1 = Float.parseFloat(screen.getText() + " ");
                add = true;
                screen.setText(null);
                screen.setText(val1 + " + ");
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen == null){
                    screen.setText(null);
                }
                val1 = Float.parseFloat(screen.getText() + " ");
                add = true;
                screen.setText(null);
                screen.setText(val1 + " * ");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(null);
            }
        });

    }
}