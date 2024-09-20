package com.example.disablebuttonapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    TextView showValue;
    private Button buttonDisable;
    private Button buttonEnable;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showValue = (TextView) findViewById(R.id.counter);


        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable = findViewById(R.id.buttonEnable);


        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonDisable.setEnabled(false);
                counter++;
                showValue.setText(Integer.toString(counter));


                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH_SHORT).show();
            }
        });

        buttonEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonDisable.setEnabled(true);
            }
        });
    }
}
