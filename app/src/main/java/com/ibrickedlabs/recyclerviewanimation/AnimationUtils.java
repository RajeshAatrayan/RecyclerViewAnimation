package com.ibrickedlabs.recyclerviewanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;

public class AnimationUtils {

    public void animate(RecyclerView.ViewHolder holder, boolean goesDown) {
        slidingAnimation(holder, goesDown);

        // bounceAnimation(holder,goesDown);
    }

    private void bounceAnimation(RecyclerView.ViewHolder holder, boolean goesDown) {
        AnimatorSet animatorSet = new AnimatorSet();//bcaseu we want to things at the same time
        ObjectAnimator animatorTranslateY = ObjectAnimator.ofFloat(holder.itemView, "translationY", goesDown ? 200 : -200, 0);
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(holder.itemView, "translationX", -30, 30, -20, 20, -5, 5, 0);

        animatorTranslateY.setDuration(1000);
        animatorTranslateX.setDuration(1000);

        animatorSet.playTogether(animatorTranslateX, animatorTranslateY);
        animatorSet.start();
    }

    private void slidingAnimation(RecyclerView.ViewHolder holder, boolean goesDown) {

        ObjectAnimator animatorTranslateY = ObjectAnimator.ofFloat(holder.itemView, "translationY", goesDown ? 200 : -200, 0);
        animatorTranslateY.setDuration(1000);
        animatorTranslateY.start();
    }
}
