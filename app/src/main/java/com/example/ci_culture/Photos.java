package com.example.ci_culture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Photos extends AppCompatActivity {

    Button previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);
        previous=findViewById(R.id.pic);
        previous.setOnClickListener(v ->{
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }
}
