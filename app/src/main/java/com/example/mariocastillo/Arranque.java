package com.example.mariocastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Arranque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arranque);
        openLogin();

        ImageView background = findViewById(R.id.backgroundSplash);
        Glide.with(this)
                .load(R.drawable.gradient)
                .transition(DrawableTransitionOptions.withCrossFade(4000))
                .centerCrop()
                .into(background);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.goup);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.godown);


        ImageView imageLogo = findViewById(R.id.idIVLogo);
        imageLogo.setAnimation(animation1);
        imageLogo.setAnimation(animation1);

        // on below line we are calling handler to run a task
        // for specific time interval
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // on below line we are
                // creating a new intent
                Intent i = new Intent(Arranque.this, MainActivity.class);

                // on below line we are
                // starting a new activity.
                startActivity(i);

                // on the below line we are finishing
                // our current activity.
                finish();
            }
        }, 4000);
    }

    public void openLogin(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Arranque.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3000);
    }

}