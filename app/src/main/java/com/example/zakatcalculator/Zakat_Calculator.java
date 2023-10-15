package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Zakat_Calculator extends AppCompatActivity {


    EditText caret18_gold,caret21_gold,caret22_gold,caret18_rupa,caret21_rupa,caret22_rupa,nijer_hate,jomano_taka,bank_tk,provident_fund,
            boideshik_mudra,bima,prodotto_loan,security,sell_product,utpadito_ponno,share,personalLoan,commercialLoan,vara,sallary,payable_bye,
            goat_shep,cow;


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
        cow = findViewById(R.id.cow);
        goat_shep = findViewById(R.id.goat_shep);





        try {


            //==================================== SHAON, Start your work from here.This is try Block =========================================

            String scaret18_gold = caret18_gold.getText().toString();
            Double aDoublecaret18_gold = Double.parseDouble(String.valueOf(scaret18_gold));

            String scaret21_gold = caret21_gold.getText().toString();
            Double aDoublcaret21_gold = Double.parseDouble(String.valueOf(scaret21_gold));

            String scaret22_gold = caret22_gold.getText().toString();
            Double aDoublcaret22_gold = Double.parseDouble(String.valueOf(scaret22_gold));


            String scaret18_rupa = caret18_rupa.getText().toString();
            Double aDoublcaret18_rupa = Double.parseDouble(String.valueOf(scaret18_rupa));

            String scaret21_rupa = caret21_rupa.getText().toString();
            Double aDoublcaret21_rupa = Double.parseDouble(String.valueOf(scaret21_rupa));


            String scaret22_rupa = caret22_rupa.getText().toString();
            Double aDoublcaret22_rupa = Double.parseDouble(String.valueOf(scaret22_rupa));



            String snijer_hate = nijer_hate.getText().toString();
            Integer integernijer_hate = Integer.parseInt(snijer_hate);

            String sjomano_taka = jomano_taka.getText().toString();
            Integer integerjomano_taka = Integer.parseInt(sjomano_taka);

            String sbank_tk = bank_tk.getText().toString();
            Integer integerbank_tk = Integer.parseInt(sbank_tk);

            String sprovident_fund = provident_fund.getText().toString();
            Integer integerprovident_fund = Integer.parseInt(sprovident_fund);

            String sboideshik_mudra = boideshik_mudra.getText().toString();
            Integer integerboideshik_mudra = Integer.parseInt(sboideshik_mudra);

            String sbima = bima.getText().toString();
            Integer integerbima = Integer.parseInt(sbima);

            String sprodotto_loan = prodotto_loan.getText().toString();
            Integer integerprodotto_loan = Integer.parseInt(sprodotto_loan);

            String ssecurity = security.getText().toString();
            Integer integersecurity = Integer.parseInt(ssecurity);

            String ssell_product = sell_product.getText().toString();
            Integer integersell_product = Integer.parseInt(ssell_product);

            String sutpadito_ponno = utpadito_ponno.getText().toString();
            Integer integerutpadito_ponno = Integer.parseInt(sutpadito_ponno);

            String sshare = share.getText().toString();
            Integer integershare = Integer.parseInt(sshare);

            String spersonalLoan = personalLoan.getText().toString();
            Integer integerpersonalLoan = Integer.parseInt(spersonalLoan);

            String scommercialLoan = commercialLoan.getText().toString();
            Integer integerpercommercialLoan = Integer.parseInt(scommercialLoan);

            String svara = vara.getText().toString();
            Integer integervara = Integer.parseInt(svara);

            String ssallary = sallary.getText().toString();
            Integer integersallary = Integer.parseInt(ssallary);

            String spayable_bye = payable_bye.getText().toString();
            Integer integerpayable_bye = Integer.parseInt(spayable_bye);

            String scow = cow.getText().toString();
            Integer icow = Integer.parseInt(scow);

            String sgoat_shep = goat_shep.getText().toString();
            Integer igoat_shep = Integer.parseInt(sgoat_shep);








            Toast.makeText(Zakat_Calculator.this, "Your payable Zakat is ", Toast.LENGTH_SHORT).show();





            //==================================== SHAON, Here end your work.Here ending try Block =========================================

        }catch (Exception e){


        }

        }


        //========================== This area out of the first Third Bracket ====================================================//













}