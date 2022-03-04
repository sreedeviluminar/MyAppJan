package com.sree.myappjan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GridwithImageandText extends AppCompatActivity {

        GridView androidGridView;

        String[] gridViewString = {
                "Settings", "Blutooth", "Email", "Girl", "Message", "Tools",
                "Settings", "Blutooth", "Email", "Girl", "Message", "Tools",
                "Settings", "Blutooth", "Email", "Girl", "Message", "Tools",
        } ;
        int[] gridViewImageId = {
                R.drawable.settings, R.drawable.bluetoothon, R.drawable.email, R.drawable.girl, R.drawable.email, R.drawable.girl,
                R.drawable.settings, R.drawable.bluetoothon, R.drawable.email, R.drawable.girl, R.drawable.email, R.drawable.girl,
                R.drawable.settings, R.drawable.bluetoothon, R.drawable.email, R.drawable.girl, R.drawable.email, R.drawable.girl,

        };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gridwith_imageand_text);

            GridAdapter adapterViewAndroid = new GridAdapter(getApplicationContext(), gridViewString, gridViewImageId);
            androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
            androidGridView.setAdapter(adapterViewAndroid);
            androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                    Toast.makeText(getApplicationContext(), "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
                }
            });

        }
    }