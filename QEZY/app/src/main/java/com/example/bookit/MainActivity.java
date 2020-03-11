 package com.example.bookit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {
    Button btnsubmit;
    EditText etloc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsubmit = findViewById(R.id.btnsubmit);
        final EditText etloc = findViewById(R.id.etloc);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String location  = etloc.getText().toString().trim();
                if(location.equalsIgnoreCase("BHUBANESWAR") || location.equalsIgnoreCase("bbsr"))
                {
                    Intent intent = new Intent(MainActivity.this,Events.class);
                    startActivity(intent);
                }

            }
        });
    }
}
