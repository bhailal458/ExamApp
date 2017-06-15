package com.example.sparken02.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {

//    private static int SPLASH_TIME_OUT = 3000;
      private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
//        StartAnimation();


        Thread th=new Thread(){
            public void run(){
                try {
                    sleep(4000);
                    if (!flag) {
                        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                finally{
                    finish();
                }
            }
        };
        th.start();

//        private void StartAnimation() {
//
//            Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
//            anim.reset();
//            LinearLayout l=(LinearLayout) findViewById(R.id.lin_lay);
//            l.clearAnimation();
//            l.startAnimation(anim);
//
//            anim = AnimationUtils.loadAnimation(this, R.anim.anim);
//            anim.reset();
//            ImageView iv = (ImageView) findViewById(R.id.);
//            iv.clearAnimation();
//            iv.startAnimation(anim);
//        }

//        new Handler().postDelayed(new Runnable() {
//
//
//            @Override
//            public void run() {
//                Intent i = new Intent(SplashScreen.this,MainActivity.class);
//                startActivity(i);
//
//                finish();
//            }
//        },SPLASH_TIME_OUT);
    }

//    private void StartAnimation() {
//
//        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
//        anim.reset();
//        LinearLayout l=(LinearLayout) findViewById(R.id.lin_lay);
//        l.clearAnimation();
//        l.startAnimation(anim);
//
//        anim = AnimationUtils.loadAnimation(this, R.anim.anim);
//        anim.reset();
//        ImageView iv = (ImageView) findViewById(R.id.image);
//        iv.clearAnimation();
//        iv.startAnimation(anim);
//    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if(keyCode == KeyEvent.KEYCODE_BACK){
            flag = true ;
            finish();
        }

        return super.onKeyDown(keyCode, event);
    }
}
