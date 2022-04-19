package com.sree.myappjan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d("Lifecycle","onCreate executed");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","onStart executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","onResume executed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","onPause executed");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","onStop executed");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle","onReStart executed");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","onDestroy executed");

    }
}