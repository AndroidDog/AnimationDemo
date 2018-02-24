package com.example.sunxt.animationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by xtsun on 2018/2/23.
 */

public class PropertyAnimationActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_anim);

        final ImageView showView = findViewById(R.id.show_view);

        Button translate = findViewById(R.id.translate);
        Button color = findViewById(R.id.color);
        Button animSet = findViewById(R.id.anim_set);

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PropertyAnimationUtil.translateViewByObjectAnimator(showView);
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PropertyAnimationUtil.changeViewBackGroundColor(showView);
            }
        });

        animSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PropertyAnimationUtil.startAnimationSet(showView);
            }
        });
    }
}
