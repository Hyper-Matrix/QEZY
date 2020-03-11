package com.example.bookit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class bookingid extends AppCompatActivity {
Button btn1;
EditText etbookingid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingid);
        Button btn1 = findViewById(R.id.btn1);
        final EditText etbookingid = findViewById(R.id.etbookingid);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = etbookingid.getText().toString().trim();
                int len = val.length();
                for(int i=0 ; i<len ; i++)
                {
                    if(Character.isLetterOrDigit(val.charAt(i))== true && len >=10)
                    {
                        Intent intent = new Intent(bookingid.this,peopleselection.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(bookingid.this, "PLEASE ENTER A VALID BOOKING ID", Toast.LENGTH_SHORT).show();
                    }
                }
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Booking id");
                myRef.child("id").push().setValue(val);

                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot ds : dataSnapshot.getChildren()) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            String value = ds.child("value").getValue(String.class);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value

                    }
                });
            }
        });


    }


}
