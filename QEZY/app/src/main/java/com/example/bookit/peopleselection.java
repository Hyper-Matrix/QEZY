package com.example.bookit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class peopleselection extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner spinner;
Button btnsubmit,btnsub;
EditText etid;
TextView tvid;
String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peopleselection);
        Spinner spinner =  findViewById(R.id.spinner);
        final Button btnsubmit = findViewById(R.id.btnsubmit);
        Button btnsub = findViewById(R.id.btnsub);
        final EditText etid = findViewById(R.id.etid);
        final TextView tvid = findViewById(R.id.tvid);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)   {

                tvid.setVisibility(View.VISIBLE);
                etid.setVisibility(View.VISIBLE);
                btnsubmit.setVisibility(View.VISIBLE);


                tvid.setText("ENTER BOOKING ID'S OF "+text+"  MEMBERS SEPARATED WITH COMMAS");

            }
        });

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = etid.getText().toString().trim();
                if(etid.getText().toString().isEmpty())
                {
                    Toast.makeText(peopleselection.this, "PLEASE ENTER ALL FIELDS", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("Booking id");
                        myRef.child("Members ID").push().setValue(id);
                        myRef.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                for(DataSnapshot ds : dataSnapshot.getChildren()){
                                    String value = ds.child("value").getValue(String.class);
                                }
                            }

                            @Override
                            public void onCancelled(DatabaseError error) {
                                // Failed to read value

                            }
                        });
                        Intent intent = new Intent(peopleselection.this,slots.class);
                        startActivity(intent);
                    }
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
         text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
