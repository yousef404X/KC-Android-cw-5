package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button register = findViewById(R.id.Register);
        EditText Ed1 = findViewById(R.id.Ed1);
        EditText Ed2 = findViewById(R.id.Ed2);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent data = new Intent(MainActivity.this,MainActivity2.class);
                if (Ed1.getText().toString().equals(""))  {
                    Toast.makeText(MainActivity.this, "please fill them", Toast.LENGTH_SHORT).show();

                }else if (Ed2.getText().toString().equals("")){

                    Toast.makeText(MainActivity.this, "please fill them", Toast.LENGTH_SHORT).show();

                }else{
                    String Ed0 = Ed1.getText().toString();
                    int Ed = Integer.parseInt(Ed2.getText().toString());

                    data.putExtra("Name",Ed0);
                    data.putExtra("Age",Ed);
                    Toast.makeText(MainActivity.this, "you have done", Toast.LENGTH_SHORT).show();
                    startActivity(data);

                }





            }
        });
    }
}