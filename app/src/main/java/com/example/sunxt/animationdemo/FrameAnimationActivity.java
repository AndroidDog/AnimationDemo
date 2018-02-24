package com.example.sunxt.animationdemo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by xtsun on 2018/2/23.
 */

public class FrameAnimationActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        final ImageView loadingView = findViewById(R.id.loading_anim);
        loadingView.setBackgroundResource(R.drawable.loading_frame_anim);
        loadingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        Button start = findViewById(R.id.start_anim);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingView.setVisibility(View.VISIBLE);
                ((AnimationDrawable) loadingView.getBackground()).start();
            }
        });
        Button stop = findViewById(R.id.stop_anim);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((AnimationDrawable) loadingView.getBackground()).stop();
//                loadingView.setVisibility(View.INVISIBLE);
            }
        });
    }
}
