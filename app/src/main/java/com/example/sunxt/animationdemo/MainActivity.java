package com.example.sunxt.animationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button viewAnimBtn;
    Button frameAnimBtn;
    Button propAnimBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewAnimBtn = (Button) findViewById(R.id.view_anim_btn);
        viewAnimBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ViewAnimationActivity.class);
                startActivity(intent);

            }
        });

        frameAnimBtn = (Button) findViewById(R.id.frame_anim_btn);
        frameAnimBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FrameAnimationActivity.class);
                startActivity(intent);
            }
        });

        propAnimBtn = (Button) findViewById(R.id.property_anim_btn);
        propAnimBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PropertyAnimationActivity.class);
                startActivity(intent);
            }
        });



    }
}
