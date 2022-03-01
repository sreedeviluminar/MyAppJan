package com.sree.myappjan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomList extends AppCompatActivity {

    String fruits[] ={"Mango","Orange","Pineapple","Banana","Apple","Grapes"};
    int fruitsimg[] ={R.drawable.mango,R.drawable.orange,R.drawable.pineapple,
                      R.drawable.bananas,R.drawable.apple,R.drawable.grapes};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        ListView fruitlist  = (ListView) findViewById(R.id.fruitslist);

        CustomListAdapter customFruits = new CustomListAdapter(getApplicationContext(),fruits,fruitsimg);
        fruitlist.setAdapter(customFruits);

        fruitlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+fruits[i]+" Fruit",Toast.LENGTH_SHORT).show();
            }
        });
    }
}