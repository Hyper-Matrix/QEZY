package com.example.bookit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class slots extends AppCompatActivity {
Button button12,button13,button14,button15,button16;
    int count=0,count1 = 0,count2=0,count3=0,count4 =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slots);
        final Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i ="9:00 - 9:30 AM";
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Booking id");
                myRef.child("SLOT").push().setValue(i);
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot ds : dataSnapshot.getChildren()){
                            String value = ds.child("value").getValue(String.class);

                            while (value == "9:00 - 9:30 AM")
                            {
                                count = count+1;

                            }


                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value

                    }
                });
                Intent intent = new Intent(slots.this,finalinfo.class);
                startActivity(intent);
            }
        });
        if(count == 50)
        {
            button12.setVisibility(View.INVISIBLE);
        };
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String j ="9:30 - 10:00 AM";
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Booking id");
                myRef.child("SLOT").push().setValue(j);
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot ds : dataSnapshot.getChildren()){
                            String value = ds.child("value").getValue(String.class);
                            while (value == "9:00 - 9:30 AM")
                            {
                                count1 = count1+1;

                            }
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value

                    }
                });
                Intent intent = new Intent(slots.this,finalinfo.class);
                startActivity(intent);
            }
        });
        if(count1 == 50)
        {
            button13.setVisibility(View.INVISIBLE);
        };
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String k ="10:00 - 10:30 AM";
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Booking id");
                myRef.child("SLOT").push().setValue(k);
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot ds : dataSnapshot.getChildren()){
                            String value = ds.child("value").getValue(String.class);
                            while (value == "9:00 - 9:30 AM")
                            {
                                count2 = count2+1;

                            }
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value

                    }
                });

                Intent intent = new Intent(slots.this,finalinfo.class);
                startActivity(intent);
            }
        });
        if(count2 == 50)
        {
            button14.setVisibility(View.INVISIBLE);
        };
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l ="10:30 - 11:00 AM";
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Booking id");
                myRef.child("SLOT").push().setValue(l);
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot ds : dataSnapshot.getChildren()){
                            String value = ds.child("value").getValue(String.class);
                            while (value == "9:00 - 9:30 AM")
                            {
                                count3 = count3+1;

                            }
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value

                    }
                });
                Intent intent = new Intent(slots.this,finalinfo.class);
                startActivity(intent);
            }
        });
        if(count3 == 50)
        {
            button15.setVisibility(View.INVISIBLE);
        };
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m ="11:00 - 11:30 AM";
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Booking id");
                myRef.child("SLOT").push().setValue(m);
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot ds : dataSnapshot.getChildren()){
                            String value = ds.child("value").getValue(String.class);
                            while (value == "9:00 - 9:30 AM")
                            {
                                count4 = count4+1;

                            }
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value

                    }
                });
                Intent intent = new Intent(slots.this,finalinfo.class);
                startActivity(intent);
            }
        });
        if(count4 == 50)
        {
            button16.setVisibility(View.INVISIBLE);
        };


    }
}
