package com.example.ci_culture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.ScrollView;


public class MainActivity extends AppCompatActivity {

    Button bsn,rep,pic;
    ScrollView sn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        bsn = findViewById(R.id.bussineses);
        rep = findViewById(R.id.recipees);
        sn = findViewById(R.id.scNews);
        pic = findViewById(R.id.photos);



        autoScroll();

        bsn.setOnClickListener(v ->{
            Intent intent = new Intent(this, BussinesesActivity.class);
            startActivity(intent);
        });

        rep.setOnClickListener(v ->{
            Intent intent = new Intent(this, RecipeesActivity.class);
            startActivity(intent);
        });

        pic.setOnClickListener(v ->{
            Intent intent = new Intent(this,Photos.class);
            startActivity(intent);
        });
    }

    private void autoScroll(){
       new CountDownTimer(120000,30){

           @Override
           public void onTick(long l) {
               int currentY=sn.getScrollY();
               int newY=currentY+1;
               sn.scrollTo(0,newY);
               currentY=sn.getScrollY();
               if(newY!=currentY){
                   sn.scrollTo(0,0);
               }
           }

           @Override
           public void onFinish() {

           }
       }.start();

    }
}