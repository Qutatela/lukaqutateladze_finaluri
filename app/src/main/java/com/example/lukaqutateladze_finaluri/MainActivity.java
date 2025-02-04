package com.example.lukaqutateladze_finaluri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button grafiki = (Button) findViewById(R.id.grafiki);
        grafiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                work1();
            }
        });

        Button xarji = (Button) findViewById(R.id.xarji);
        xarji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                work2();
            }
        });
    }
    public void work1(){
        Intent intent = new Intent(this, Work_1.class);
        startActivity(intent);
    }
    public void work2(){
        Intent intent1 = new Intent(this, Work_2.class);
        startActivity(intent1);
    }
}
