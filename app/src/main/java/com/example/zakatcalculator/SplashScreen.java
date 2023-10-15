package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);




        //==================================Start Checking Network Connectivity========================================//


        //ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

//        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();


//        if (networkInfo != null && networkInfo.isConnected()){

//            Toast.makeText(SplashScreen.this, "Network is Connected", Toast.LENGTH_SHORT).show();


//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//
//                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
//
//
//
//                    startActivity(intent);
//                    finish();
//
//
//
//                }
//            },3000);


//        }else {
//            Toast.makeText(SplashScreen.this, "Network is not Connected", Toast.LENGTH_SHORT).show();




//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//
//                    Intent intent = new Intent(SplashScreen.this, Zakat_Calculator.class);
//
//
//
//                    startActivity(intent);
//                    finish();
//
//
//
//                }
//            },3000);

 //       }



        //==================================End Checking Network Connectivity========================================//




        //----------- Splash Screen delayed


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, MainActivity.class);



                startActivity(intent);
                finish();



            }
        },3000);


    }

}