package com.example.sunxt.animationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by xtsun on 2018/2/23.
 */

public class ViewAnimationActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_anim);

        final ImageView alphaView = findViewById(R.id.img_1);
        alphaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha_demo);
                alphaView.startAnimation(animation);
            }
        });

        final ImageView rotateView = findViewById(R.id.img_2);
        rotateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_demo);
                rotateView.startAnimation(animation);
            }
        });

        final ImageView scaleView = findViewById(R.id.img_3);
        scaleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_demo);
                scaleView.startAnimation(animation);
            }
        });

        final ImageView translateView = findViewById(R.id.img_4);
        translateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_demo);
                translateView.startAnimation(animation);
            }
        });

        final ImageView animationSetView = findViewById(R.id.img_5);
        animationSetView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_set_demo);
                animationSetView.startAnimation(animation);
            }
        });

    }
}
