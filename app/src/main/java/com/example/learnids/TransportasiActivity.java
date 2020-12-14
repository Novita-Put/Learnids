package com.example.learnids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TransportasiActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah,next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportasi);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_transportasi);
        show = (ImageButton) findViewById(R.id.mobil);
        hide = (ImageButton) findViewById(R.id.angkot);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        final MediaPlayer suara1 = MediaPlayer.create(this, R.raw.mobil);
        final MediaPlayer suara2 = MediaPlayer.create(this, R.raw.angkot);
        final MediaPlayer suara3 = MediaPlayer.create(this, R.raw.bus);
        final MediaPlayer suara4 = MediaPlayer.create(this, R.raw.truk);
        final MediaPlayer suara5 = MediaPlayer.create(this, R.raw.delman);
        final MediaPlayer suara6 = MediaPlayer.create(this, R.raw.kereta_api);
        final MediaPlayer suara7 = MediaPlayer.create(this, R.raw.bajaj);
        final MediaPlayer suara8 = MediaPlayer.create(this, R.raw.becak);
        final MediaPlayer suara9 = MediaPlayer.create(this, R.raw.motor);
        final MediaPlayer suara0 = MediaPlayer.create(this, R.raw.sepeda);

        ImageButton ButtonSuara1 = (ImageButton) this.findViewById(R.id.mobil);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.angkot);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.bus);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.truk);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.delman);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.kereta_api);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.bajaj);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.becak);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.motor);
        ImageButton ButtonSuara0 = (ImageButton) this.findViewById(R.id.sepeda);

        ButtonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_mobil);
                TampilGambar.startAnimation(animScale);
                suara1.start();
            }
        });
        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_angkot);
                TampilGambar.startAnimation(animScale);
                suara2.start();
            }
        });
        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_bus);
                TampilGambar.startAnimation(animScale);
                suara3.start();
            }
        });
        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_truk);
                TampilGambar.startAnimation(animScale);
                suara4.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_delman);
                TampilGambar.startAnimation(animScale);
                suara5.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_keretaapi);
                TampilGambar.startAnimation(animScale);
                suara6.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_bajaj);
                TampilGambar.startAnimation(animScale);
                suara7.start();
            }
        });
        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_becak);
                TampilGambar.startAnimation(animScale);
                suara8.start();
            }
        });
        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_motor);
                TampilGambar.startAnimation(animScale);
                suara9.start();
            }
        });
        ButtonSuara0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_sepeda);
                TampilGambar.startAnimation(animScale);
                suara0.start();
            }
        });

        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                suaraButton.start();
                // TODO Auto-generated method stub
                Intent explicit_intent = new Intent(TransportasiActivity.this,
                        MainActivity.class);
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