package com.example.ronak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);
        card5 = (CardView) findViewById(R.id.c5);
        card6 = (CardView) findViewById(R.id.c6);
        card7 = (CardView) findViewById(R.id.c7);
        card8 = (CardView) findViewById(R.id.c8);
        card9 = (CardView) findViewById(R.id.c9);
        card10 = (CardView) findViewById(R.id.c10);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.c1:
                i = new Intent(this,Mridli.class);
                startActivity(i);
                break;

            case R.id.c2:
                i = new Intent(this,MajiSainik.class);
                startActivity(i);
                break;

            case R.id.c3:
                i = new Intent(this,woke.class);
                startActivity(i);
                break;

            case R.id.c4:
                i = new Intent(this,cafe.class);
                startActivity(i);
                break;

            case R.id.c5:
                i = new Intent(this,Messy.class);
                startActivity(i);
                break;

            case R.id.c6:
                i = new Intent(this,Pizza.class);
                startActivity(i);
                break;

            case R.id.c7:
                i = new Intent(this,Subway.class);
                startActivity(i);
                break;

            case R.id.c8:
                i = new Intent(this,Havmor.class);
                startActivity(i);
                break;

            case R.id.c9:
                i = new Intent(this,Chocolate.class);
                startActivity(i);
                break;

            case R.id.c10:
                i = new Intent(this,Mummy.class);
                startActivity(i);
                break;
        }

    }
}