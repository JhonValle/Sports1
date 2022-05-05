package com.example.sports1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Futbolistas extends AppCompatActivity {
    EditText et1;
    ImageButton imageButton1,imageButton2,imageButton3,imageButton4,imageButton5 ,imageButton6
            ,imageButton7 ,imageButton8 ,imageButton9 ,imageButton10,imageButton11,imageButton12,imageButton13,imageButton14,imageButton15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futbolistas);

        imageButton1=(ImageButton) findViewById(R.id.imageButton1);
        imageButton2=(ImageButton) findViewById(R.id.imageButton2);
        imageButton3=(ImageButton) findViewById(R.id.imageButton3);
        imageButton4=(ImageButton) findViewById(R.id.imageButton4);
        imageButton5=(ImageButton) findViewById(R.id.imageButton5);
        imageButton6=(ImageButton) findViewById(R.id.imageButton6);
        imageButton7=(ImageButton) findViewById(R.id.imageButton7);
        imageButton8=(ImageButton) findViewById(R.id.imageButton8);
        imageButton9=(ImageButton) findViewById(R.id.imageButton9);
        imageButton10=(ImageButton) findViewById(R.id.imageButton10);
        imageButton11=(ImageButton) findViewById(R.id.imageButton11);
        imageButton12=(ImageButton) findViewById(R.id.imageButton12);
        imageButton13=(ImageButton) findViewById(R.id.imageButton13);
        imageButton14=(ImageButton) findViewById(R.id.imageButton14);
        imageButton15=(ImageButton) findViewById(R.id.imageButton15);

        et1=(EditText)findViewById(R.id.txtWeb);

    }

    @SuppressLint("NonConstantResourceId")
    public void imageButton(View view) {
        switch (view.getId()){
            case R.id.imageButton1: intent("NEYMAR") ;break;
            case R.id.imageButton2: intent("LEWANDOSKY") ;break;
            case R.id.imageButton3: intent("MESSI") ;break;
            case R.id.imageButton4: intent("CUADRADO") ;break;
            case R.id.imageButton5: intent("MANE") ;break;
            case R.id.imageButton6: intent("SUAREZ") ;break;
            case R.id.imageButton7: intent("CR7") ;break;
            case R.id.imageButton8: intent("SALAH") ;break;
            case R.id.imageButton9: intent("MBAPE") ;break;
            case R.id.imageButton10: intent("DI MARIA") ;break;
            case R.id.imageButton11: intent("BENZEMA") ;break;
            case R.id.imageButton12: intent("PAOLO GUERRERO") ;break;
            case R.id.imageButton13: intent("POGBA") ;break;
            case R.id.imageButton14: intent("MODRIC") ;break;
            case R.id.imageButton15: intent("RAMOS") ;break;

        }

    }
    public void intent(String futbolista){
        Intent i = new Intent(Futbolistas.this, BiografiaF.class);
        i.putExtra("Futbolista", futbolista);
        startActivity(i);
    }


    public void Titulo(View view) {
        Intent intent = new Intent(Futbolistas.this, Basquetbolistas.class);
        startActivity(intent);
        finish();
    }

    public void ButtonIR(View view) {
        Intent i=new Intent(this,ActivityWeb.class);
        //enviar parametros intent,metodo put extra
        i.putExtra("SitioWeb",et1.getText().toString());
        startActivity(i);
    }
}