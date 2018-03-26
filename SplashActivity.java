package com.serc.joh40010740.speaksmart;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by emmajohnston on 04/05/2017.
 */

public class SplashActivity extends MainActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final ImageView iv = (ImageView) (findViewById(R.id.imgLogo));
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);

        // Added fade out
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);

        iv.startAnimation(an);
        an.setAnimationListener (new Animation.AnimationListener() {

            public void onAnimationStart(Animation animation) {

            }

            public void onAnimationEnd (Animation animation) {

                iv.startAnimation(an2);
                finish();
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
            }

            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
