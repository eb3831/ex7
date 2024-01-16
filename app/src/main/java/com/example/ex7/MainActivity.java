package com.example.ex7;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    ImageButton ibtn;

    ImageView iv;

    int rndNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ibtn = findViewById(R.id.ibtn);
        iv = findViewById(R.id.iv);



    }



    public void clicked(View view) {
        Random rnd = new Random();
        rndNum= rnd.nextInt(3)+1;
        if (rndNum==1){
            iv.setImageResource(R.drawable.minion1);
            ibtn.setImageResource(R.drawable.num1);
        }
        if (rndNum==2){
            iv.setImageResource(R.drawable.minion2);
            ibtn.setImageResource(R.drawable.num2);
        }
        if (rndNum==3){
            iv.setImageResource(R.drawable.minion3);
            ibtn.setImageResource(R.drawable.num3);
        }
    }
}