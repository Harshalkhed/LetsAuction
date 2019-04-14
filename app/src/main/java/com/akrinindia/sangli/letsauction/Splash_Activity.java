package com.akrinindia.sangli.letsauction;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        LottieAnimationView animationView= findViewById(R.id.splash_anime);
       animationView.addAnimatorListener(new AnimatorListenerAdapter() {
           @Override
           public void onAnimationEnd(Animator animation) {
               super.onAnimationEnd(animation);
               Intent landingpage =new Intent(Splash_Activity.this,Landingpage.class);
               startActivity(landingpage);
               finish();
           }
       });
    }
}
