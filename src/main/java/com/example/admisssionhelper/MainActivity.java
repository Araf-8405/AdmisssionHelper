package com.example.admisssionhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonId3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonId3 = (Button) findViewById(R.id.buttonId3);
        buttonId3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });
    }
    public void openactivity2() {
        startActivity(new Intent(MainActivity.this, activity2.class));
    }



    public void web1(View view) {
        Intent intent = new Intent(MainActivity.this, MBBS.class);
        startActivity(intent);
    }

    public void web2(View view) {

        Intent intent = new Intent(MainActivity.this, Agrri.class);
        startActivity(intent);
    }

    public void web3(View view) {
        Intent intent = new Intent(MainActivity.this, Xi.class);
        startActivity(intent);
    }



}




