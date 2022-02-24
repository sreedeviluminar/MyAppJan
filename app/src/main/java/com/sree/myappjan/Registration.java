package com.sree.myappjan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        Button reg = (Button) findViewById(R.id.register);
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