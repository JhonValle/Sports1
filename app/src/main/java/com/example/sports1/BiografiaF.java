package com.example.sports1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class BiografiaF extends AppCompatActivity {

    ImageView imv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biografia_f);
        imv2=(ImageView)findViewById(R.id.imv2);
        String Futbolista = getIntent().getExtras().getString("Futbolista");
        switch (Futbolista){
            case "NEYMAR":imv2.setImageResource(R.drawable.juga1);break;
            case "LEWANDOSKY":imv2.setImageResource(R.drawable.juga2);break;
            case "MESSI":imv2.setImageResource(R.drawable.juga3);break;
            case "CUADRADO":imv2.setImageResource(R.drawable.juga4);break;
            case "MANE":imv2.setImageResource(R.drawable.juga5);break;
            case "SUAREZ":imv2.setImageResource(R.drawable.juga6);break;
            case "CR7":imv2.setImageResource(R.drawable.juga7);break;
            case "SALAH":imv2.setImageResource(R.drawable.juga8);break;
            case "MBAPE":imv2.setImageResource(R.drawable.juga9);break;
            case "DI MARIA":imv2.setImageResource(R.drawable.juga10);break;
            case "BENZEMA":imv2.setImageResource(R.drawable.juga11);break;
            case "PAOLO GUERRERO":imv2.setImageResource(R.drawable.juga12);break;
            case "POGBA":imv2.setImageResource(R.drawable.juga13);break;
            case "MODRIC":imv2.setImageResource(R.drawable.juga14);break;
            case "RAMOS":imv2.setImageResource(R.drawable.juga15);break;



        }
    }
}