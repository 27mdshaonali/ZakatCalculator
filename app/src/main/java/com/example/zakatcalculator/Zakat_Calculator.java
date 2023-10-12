package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Zakat_Calculator extends AppCompatActivity {


    EditText caret18_gold,caret21_gold,caret22_gold,caret18_rupa,caret21_rupa,caret22_rupa,nijer_hate,jomano_taka,bank_tk,provident_fund,
            boideshik_mudra,bima,prodotto_loan,security,sell_product,utpadito_ponno,share,personalLoan,commercialLoan,vara,sallary,payable_bye;


    Button delete,calculate;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_LOCAL_FOCUS_MODE);
        setContentView(R.layout.activity_zakat_calculator);

        caret18_gold = findViewById(R.id.caret18_gold);
        caret21_gold = findViewById(R.id.caret_21_gold);
        caret22_gold = findViewById(R.id.caret22_gold);
        caret18_rupa = findViewById(R.id.caret18_rupa);
        caret21_rupa = findViewById(R.id.caret21_rupa);
        caret22_rupa = findViewById(R.id.caret22_rupa);
        nijer_hate = findViewById(R.id.nijer_hate);
        jomano_taka = findViewById(R.id.jomano_taka);
        bank_tk = findViewById(R.id.bank_tk);
        provident_fund = findViewById(R.id.provident_fund);
        boideshik_mudra = findViewById(R.id.boideshik_mudra);
        bima = findViewById(R.id.bima);
        prodotto_loan = findViewById(R.id.prodotto_loan);
        security = findViewById(R.id.security);
        sell_product = findViewById(R.id.sell_product);
        utpadito_ponno = findViewById(R.id.utpadito_ponno);
        share = findViewById(R.id.share);
        personalLoan = findViewById(R.id.personalLoan);
        commercialLoan = findViewById(R.id.commercialLoan);
        vara = findViewById(R.id.vara);
        sallary = findViewById(R.id.sallary);
        payable_bye = findViewById(R.id.payable_bye);
        delete = findViewById(R.id.delete);
        calculate = findViewById(R.id.calculate);









    }
}