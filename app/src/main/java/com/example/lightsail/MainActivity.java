package com.example.lightsail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        int loginvar = sharedPreferences.getInt("login",0);

       if (loginvar == 0){
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                   startActivity(new Intent(MainActivity.this, LoginActivity.class));
               }
           }, 2000);
       } else if(loginvar == 1) {
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                   startActivity(new Intent(MainActivity.this, DashboardActivity.class));
               }
           }, 2000);
       }


    }


}