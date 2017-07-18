package com.example.android.guardiannews;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by PB on 17/07/2017.
 */

public class SplashActivity extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            /** Display splash screen with a timer */
            @Override
            public void run() {
                // This method executes once the timer is over
                startActivity(new Intent(SplashActivity.this, MainActivity.class));

                // Close splash activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
