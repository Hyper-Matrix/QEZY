package com.example.bookit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Events extends AppCompatActivity {
    ImageButton ibbarabati,ibkalinga,ibxtasy,ibmandir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        ImageButton ibbarabati = findViewById(R.id.ibbarabati);
        ImageButton ibkalinga = findViewById(R.id.ibkalinga);
        ImageButton ibxtasy = findViewById(R.id.ibxtasy);
        ImageButton ibmandir = findViewById(R.id.ibmandir);
        ibbarabati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this,bookingid.class);
                startActivity(intent);
            }
        });



        ibkalinga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this,comngsoon.class);
                startActivity(intent);
            }
        });
        ibxtasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this,comngsoon.class);
                startActivity(intent);
            }
        });
        ibmandir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this,comngsoon.class);
                startActivity(intent);
            }
        });


    }
}
