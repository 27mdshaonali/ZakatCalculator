package com.example.zakatcalculator;

import static com.example.zakatcalculator.R.*;
import static com.example.zakatcalculator.R.string.app_name;
import static com.example.zakatcalculator.R.string.no;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {


    CardView zakat_keno_diben,zakater_hoqudar,hadise_zakat,zakater_shompod,zakat_calculator;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(layout.activity_main);




        zakat_keno_diben = findViewById(R.id.zakat_keno_diben);
        zakater_hoqudar = findViewById(R.id.zakater_hoqudar);
        hadise_zakat = findViewById(R.id.hadise_zakat);
        zakater_shompod = findViewById(R.id.zakater_shompod);
        zakat_calculator = findViewById(R.id.zakat_calculator);



        zakat_keno_diben.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Zakat_Keno_Diben.class);
                startActivity(intent);

            }
        });



        zakater_hoqudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Zakater_Hoqudar.class);
                startActivity(intent);

            }
        });



        hadise_zakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Hadise_Zakat.class));

            }
        });



        zakater_shompod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Zakater_Shompod.class));

            }
        });



        zakat_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Zakat_Calculator.class));

            }
        });





    }




    //Last second bracket has started here................


    // =================================== onBackPressed =================================== //


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(app_name);
        builder.setIcon(drawable.calculat);
        builder.setMessage("Do you want to exit?");



        builder.setNeutralButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {



            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finishAndRemoveTask();

            }
        });



        builder.show();


    }
}