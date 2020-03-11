package com.example.bookit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finalinfo extends AppCompatActivity {
Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalinfo);
     Button btnnext = findViewById(R.id.btnnext);
     btnnext.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(finalinfo.this,promotion.class);
             startActivity(intent);
         }
     });

    }
}
