package com.sree.myappjan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    String districts[] ={"Tvm","Kollam","Kottayam","Pathanamthitta","Idukki","Alappuzha","Ernakulam","Thrissur","Malappuram"};
    Spinner dist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        Button reg = (Button) findViewById(R.id.register);
        dist = (Spinner)findViewById(R.id.states);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,districts);
        dist.setAdapter(adapter);

        dist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),districts[i],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText eu = (EditText)findViewById(R.id.uname);
                EditText ep =(EditText)findViewById(R.id.pwd);

                String user = eu.getText().toString();
                String pwd = ep.getText().toString();

                Intent i = new Intent(getApplicationContext(), Login.class);
                i.putExtra("username",user);
                i.putExtra("password",pwd);
                startActivity(i);
            }
        });
    }
}