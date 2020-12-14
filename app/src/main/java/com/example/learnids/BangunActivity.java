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

public class BangunActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah,next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_bangundatar);
        show = (ImageButton) findViewById(R.id.persegi);
        hide = (ImageButton) findViewById(R.id.persegi_panjang);

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

        final MediaPlayer suara1 = MediaPlayer.create(this, R.raw.persegi);
        final MediaPlayer suara2 = MediaPlayer.create(this, R.raw.persegi_panjang);
        final MediaPlayer suara3 = MediaPlayer.create(this, R.raw.lingkaran);
        final MediaPlayer suara4 = MediaPlayer.create(this, R.raw.segitiga);
        final MediaPlayer suara5 = MediaPlayer.create(this, R.raw.trapesium);
        final MediaPlayer suara6 = MediaPlayer.create(this, R.raw.belah_ketupat);
        final MediaPlayer suara7 = MediaPlayer.create(this, R.raw.layang_layang);
        final MediaPlayer suara8 = MediaPlayer.create(this, R.raw.jajar_genjang);

        ImageButton ButtonSuara1 = (ImageButton) this.findViewById(R.id.persegi);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.persegi_panjang);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.lingkaran);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.segitiga);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.trapesium);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.belah_ketupat);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.layang_layang);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.jajar_genjang);

        ButtonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_persegi);
                TampilGambar.startAnimation(animScale);
                suara1.start();
            }
        });
        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_pp);
                TampilGambar.startAnimation(animScale);
                suara2.start();
            }
        });
        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_lingkaran);
                TampilGambar.startAnimation(animScale);
                suara3.start();
            }
        });
        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_segitiga);
                TampilGambar.startAnimation(animScale);
                suara4.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_trapesium);
                TampilGambar.startAnimation(animScale);
                suara5.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_bp);
                TampilGambar.startAnimation(animScale);
                suara6.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_ll);
                TampilGambar.startAnimation(animScale);
                suara7.start();
            }
        });
        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_jg);
                TampilGambar.startAnimation(animScale);
                suara8.start();
            }
        });
        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                suaraButton.start();
                // TODO Auto-generated method stub
                Intent explicit_intent = new Intent(BangunActivity.this,
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