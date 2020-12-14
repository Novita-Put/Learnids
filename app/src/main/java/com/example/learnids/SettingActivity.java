package com.example.learnids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class SettingActivity extends AppCompatActivity {
    SeekBar lightBar;
    Context context;
    int brightness;
    ImageButton next_button,pindah;
    private SeekBar volumeSeekBar;
    private AudioManager audioManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        initControls();
        
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);

        lightBar = findViewById(R.id.brightness);
        context = getApplicationContext();
        brightness =
                Settings.System.getInt(context.getContentResolver(),
                        Settings.System.SCREEN_BRIGHTNESS, 0);
        lightBar.setProgress(brightness);
        lightBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Settings.System.putInt(context.getContentResolver(),
                        Settings.System.SCREEN_BRIGHTNESS, progress);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        pindah = (ImageButton) findViewById(R.id.help);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(SettingActivity.this, HelpActivity.class);
                startActivity(intent);
            }
        });

        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                suaraButton.start();
                // TODO Auto-generated method stub
                Intent explicit_intent = new Intent(SettingActivity.this, MainActivity.class);
                startActivity(explicit_intent);
            }
        });
    }

    private void initControls() {
        // TODO Auto-generated method stub
        try {
            volumeSeekBar = (SeekBar) findViewById(R.id.sound);
            audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
            volumeSeekBar.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            volumeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    // TODO Auto-generated method stub
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    // TODO Auto-generated method stub

                }
            });

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
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
