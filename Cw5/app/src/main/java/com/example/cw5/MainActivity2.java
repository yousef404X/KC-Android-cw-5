package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle data = getIntent().getExtras();
        Button Back = findViewById(R.id.back);
        TextView T3 = findViewById(R.id.T3);
        TextView T4 = findViewById(R.id.T4);
        String t3 = data.getString("Name");
        int t4 = data.getInt("Age");
        T3.setText(t3);
        T4.setText(t4 + " ");

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data1 = new Intent(MainActivity2.this,MainActivity.class);




                startActivity(data1);

            }
        });


    }
}