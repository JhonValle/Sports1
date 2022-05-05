package com.example.sports1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class BiografiaB extends AppCompatActivity {
    ImageView imv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biografia_b);
        imv3 = (ImageView) findViewById(R.id.imv3);
        String Basquetbolista = getIntent().getExtras().getString("Basquetbolista");
        switch (Basquetbolista) {
            case "Iman shumpert":
                imv3.setImageResource(R.drawable.bas1);
                break;
        }
    }
}