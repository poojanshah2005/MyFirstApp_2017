package com.example.shahp.myfirstapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public final String TAG="lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"  On Create");
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"  onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"  onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"  onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"  onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"  onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"  onDestroy`");
    }
}
