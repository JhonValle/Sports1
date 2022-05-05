package com.example.sports1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Basquetbolistas extends AppCompatActivity {
    ImageButton img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basquetbolistas);

        img1=(ImageButton) findViewById(R.id.img1);
    }
    @SuppressLint("NonConstantResourceId")
    public void imageButton(View view) {
        switch (view.getId()){
            case R.id.img1: intent("Iman shumpert") ;break;
        }

    }
    public void intent(String basquetbolistas){
        Intent i = new Intent(Basquetbolistas.this, BiografiaB.class);
        i.putExtra("Basquetbolistas", basquetbolistas);
        startActivity(i);
    }
}