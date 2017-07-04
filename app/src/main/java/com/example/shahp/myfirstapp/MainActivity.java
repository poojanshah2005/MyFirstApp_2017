package com.example.shahp.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public final String TAG="lifecycle";
    Button btnGoto;
    Button btnGotoWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Asssign the design xml file to your coding file
         */
        Log.i(TAG,"  On Create");
        setContentView(R.layout.activity_main);
        initializeUI();
    }

    public void initializeUI(){
        //convert xml object to java objects.

        btnGoto = (Button) findViewById(R.id.button);
        btnGotoWebsite = (Button) findViewById(R.id.buttonWebsite);

    }

    /** Called when the user taps the next button */
    public void nextScreen(View view){
        //create intent
        Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
        Log.i(TAG,"  nextActivity");
        //start activity
        startActivity(intent);
    }

    /** Called when the user taps the next button */
    public void implicitWebsite(View view){
        /**
         * create Implicit
         * Defined by action
         * provide the data
         */
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        //start activity
        startActivity(intent);
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
