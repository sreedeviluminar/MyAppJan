package com.sree.myappjan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Fruits extends AppCompatActivity {

    String fruits[] ={"Mango","Orange","Pineapple","Banana","Apple","Grapes"};
    int fruitsimg[] ={R.drawable.mango,R.drawable.orange,R.drawable.pineapple,
                      R.drawable.bananas,R.drawable.apple,R.drawable.grapes};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        ListView fruitlist  = (ListView) findViewById(R.id.fruitslist);

        CustomFruits customFruits = new CustomFruits(getApplicationContext(),fruits,fruitsimg);
        fruitlist.setAdapter(customFruits);
    }
}