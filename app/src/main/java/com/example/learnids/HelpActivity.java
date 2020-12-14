package com.example.learnids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class HelpActivity extends AppCompatActivity {
    ImageButton next_button,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);

        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                suaraButton.start();
                // TODO Auto-generated method stub
                    Intent explicit_intent = new Intent(HelpActivity.this, SettingActivity.class);
                startActivity(explicit_intent);
            }
        });
    }
    @Override
    public boolean onKeyDown(int KeyCode, KeyEvent event) {
        if (KeyCode == KeyEvent.KEYCODE_BACK) {
            //preventing default Implementation previos to android.os.Build.VERESION_CODES.ECLAIR
            return true;
        }
        return super.onKeyDown(KeyCode, event);
    }
}

