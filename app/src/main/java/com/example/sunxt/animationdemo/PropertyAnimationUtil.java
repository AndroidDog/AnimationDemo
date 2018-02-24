package com.example.sunxt.animationdemo;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;

/**
 * Created by xtsun on 2018/2/23.
 */

public class PropertyAnimationUtil {
    /**
     * 将 View 沿着垂直方向移动 View 高度的距离
     *
     * @param targetView 被移动的 View
     */
    public static void translateViewByObjectAnimator(View targetView) {
        //TranslationY 目标 View 要改变的属性
        //ivShow.getHeight() 要移动的距离
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(targetView, "TranslationY", 500);
        objectAnimator.start();
    }

    /**
     * 改变 View 对象的背景色由红色变为蓝色
     *
     * @param targetView
     */
    public static void changeViewBackGroundColor(View targetView) {
        ValueAnimator valueAnimator = ObjectAnimator.ofInt(targetView, "backgroundColor", Color.RED, Color.BLUE);
        valueAnimator.setDuration(3000);
        //设置估值器，该处插入颜色估值器
        valueAnimator.setEvaluator(new ArgbEvaluator());
        //无限循环
        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
        //翻转模式
        valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
        valueAnimator.start();
    }

    /**
     * 启动一个动画集合
     *
     * @param targetView
     */
    public static void startAnimationSet(View targetView) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(targetView, "rotationX", 0, 360),
                //旋转
                ObjectAnimator.ofFloat(targetView, "rotationY", 0, 360),
                ObjectAnimator.ofFloat(targetView, "rotation", 0, -90),
                //平移
                ObjectAnimator.ofFloat(targetView, "translationX", 0, 90),
                ObjectAnimator.ofFloat(targetView, "translationY", 0, 90),
                //缩放
                ObjectAnimator.ofFloat(targetView, "scaleX", 1, 1.5f),
                ObjectAnimator.ofFloat(targetView, "scaleY", 1, 1.5f),
                //透明度
                ObjectAnimator.ofFloat(targetView, "alpha", 1, 0.25f, 1));
        animatorSet.setDuration(3000).start();
    }
}
