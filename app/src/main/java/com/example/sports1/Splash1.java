package com.example.sports1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;



public class Splash1 extends AppCompatActivity {

    public static final long SPLASH_SCREEN_DELAY = 30000;

    Animation topAnim, buttomAnim;
    ImageView image;
    GridView gridViewImagenes;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        buttomAnim = AnimationUtils.loadAnimation(this,R.anim.button_animation);
        image = findViewById(R.id.imageView);
        image.setAnimation((topAnim));


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash1.this, Splash2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);
    }
}