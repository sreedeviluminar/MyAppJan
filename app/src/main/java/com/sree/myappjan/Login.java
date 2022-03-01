package com.sree.myappjan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText password, username;
    Button cancel;
    String un;
    String pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        username = (EditText) findViewById(R.id.usernameee);
        password = (EditText) findViewById(R.id.pswd);

        cancel = (Button) findViewById(R.id.cancel);

        cancel.setOnClickListener(this);

        Intent intentfromreg = getIntent();
        un= intentfromreg.getStringExtra("username");
        pw=intentfromreg.getStringExtra("password");
        password.setEnabled(false);
        username.setText(un);
        password.setText(pw);
    }

    public void login(View view) {
        String uname = username.getText().toString();
        String paswd = password.getText().toString();

        if(uname.equals(un) && paswd.equals(pw)){

            Intent i = new Intent(getApplicationContext(), ImplicitIntent.class);
            startActivity(i);

        }else{
            Toast.makeText(getApplicationContext(),"email or password incorrect",Toast.LENGTH_LONG).show();
        }
    }
    @Override
    public void onClick(View view) {
        finish();
    }


    public void gotoregister(View view) {
        Intent i = new Intent(getApplicationContext(),Registration.class);
        startActivity(i);
    }
}