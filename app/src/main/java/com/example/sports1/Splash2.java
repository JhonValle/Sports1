package com.example.sports1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash2 extends AppCompatActivity {

    public static final long SPLASH_SCREEN_DELAY = 3000;

    Animation topAnim, buttomAnim;
    ImageView image;
    TextView btnFutbol;
    TextView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        buttomAnim = AnimationUtils.loadAnimation(this,R.anim.button_animation);

        image = findViewById(R.id.image2);
        btnFutbol = findViewById(R.id.btnFutbol);
        logo = findViewById(R.id.txtV2);

        image.setAnimation((topAnim));
        btnFutbol.setAnimation(buttomAnim);
        logo.setAnimation(buttomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash2.this, Futbolistas.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);
    }
}