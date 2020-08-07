package com.exam.asm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ManghinhchaoActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 2500;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_manghinhchao);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(ManghinhchaoActivity.this,MainActivity.class);
                ManghinhchaoActivity.this.startActivity(mainIntent);
                ManghinhchaoActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}