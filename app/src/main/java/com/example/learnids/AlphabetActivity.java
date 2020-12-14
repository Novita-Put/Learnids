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

public class AlphabetActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show, hide, pindah,next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_alphabet);
        show = (ImageButton) findViewById(R.id.a);
        hide = (ImageButton) findViewById(R.id.b);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
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

        final MediaPlayer suaraA = MediaPlayer.create(this, R.raw.a);
        final MediaPlayer suaraB = MediaPlayer.create(this, R.raw.b);
        final MediaPlayer suaraC = MediaPlayer.create(this, R.raw.c);
        final MediaPlayer suaraD = MediaPlayer.create(this, R.raw.d);
        final MediaPlayer suaraE = MediaPlayer.create(this, R.raw.e);
        final MediaPlayer suaraF = MediaPlayer.create(this, R.raw.f);
        final MediaPlayer suaraG = MediaPlayer.create(this, R.raw.g);
        final MediaPlayer suaraH = MediaPlayer.create(this, R.raw.h);
        final MediaPlayer suaraI = MediaPlayer.create(this, R.raw.i);
        final MediaPlayer suaraJ = MediaPlayer.create(this, R.raw.j);
        final MediaPlayer suaraK = MediaPlayer.create(this, R.raw.k);
        final MediaPlayer suaraL = MediaPlayer.create(this, R.raw.l);
        final MediaPlayer suaraM = MediaPlayer.create(this, R.raw.m);
        final MediaPlayer suaraN = MediaPlayer.create(this, R.raw.n);
        final MediaPlayer suaraO = MediaPlayer.create(this, R.raw.o);
        final MediaPlayer suaraP = MediaPlayer.create(this, R.raw.p);
        final MediaPlayer suaraQ = MediaPlayer.create(this, R.raw.q);
        final MediaPlayer suaraR = MediaPlayer.create(this, R.raw.r);
        final MediaPlayer suaraS = MediaPlayer.create(this, R.raw.s);
        final MediaPlayer suaraT = MediaPlayer.create(this, R.raw.t);
        final MediaPlayer suaraU = MediaPlayer.create(this, R.raw.u);
        final MediaPlayer suaraV = MediaPlayer.create(this, R.raw.v);
        final MediaPlayer suaraW = MediaPlayer.create(this, R.raw.w);
        final MediaPlayer suaraX = MediaPlayer.create(this, R.raw.x);
        final MediaPlayer suaraY = MediaPlayer.create(this, R.raw.y);
        final MediaPlayer suaraZ = MediaPlayer.create(this, R.raw.z);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.a);
        ImageButton ButtonSuara1 = (ImageButton) this.findViewById(R.id.b);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.c);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.d);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.e);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.f);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.g);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.h);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.i);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.j);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.k);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.l);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.m);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.n);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.o);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.p);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.q);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.r);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.s);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.t);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.u);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.v);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.w);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.x);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.y);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.z);

        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_a);
                TampilGambar.startAnimation(animScale);
                suaraA.start();
            }
        });

        ButtonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_b);
                TampilGambar.startAnimation(animScale);
                suaraB.start();
            }
        });
        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_c);
                TampilGambar.startAnimation(animScale);
                suaraC.start();
            }
        });
        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_d);
                TampilGambar.startAnimation(animScale);
                suaraD.start();
            }
        });
        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_e);
                TampilGambar.startAnimation(animScale);
                suaraE.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_f);
                TampilGambar.startAnimation(animScale);
                suaraF.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_g);
                TampilGambar.startAnimation(animScale);
                suaraG.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_h);
                TampilGambar.startAnimation(animScale);
                suaraH.start();
            }
        });
        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_i);
                TampilGambar.startAnimation(animScale);
                suaraI.start();
            }
        });
        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_j);
                TampilGambar.startAnimation(animScale);
                suaraJ.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_k);
                TampilGambar.startAnimation(animScale);
                suaraK.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_l);
                TampilGambar.startAnimation(animScale);
                suaraL.start();
            }
        });
        ButtonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_m);
                TampilGambar.startAnimation(animScale);
                suaraM.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_n);
                TampilGambar.startAnimation(animScale);
                suaraN.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_o);
                TampilGambar.startAnimation(animScale);
                suaraO.start();
            }
        });
        ButtonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_p);
                TampilGambar.startAnimation(animScale);
                suaraP.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_q);
                TampilGambar.startAnimation(animScale);
                suaraQ.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_r);
                TampilGambar.startAnimation(animScale);
                suaraR.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_s);
                TampilGambar.startAnimation(animScale);
                suaraS.start();
            }
        });
        ButtonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_t);
                TampilGambar.startAnimation(animScale);
                suaraT.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_u);
                TampilGambar.startAnimation(animScale);
                suaraU.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_v);
                TampilGambar.startAnimation(animScale);
                suaraV.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_w);
                TampilGambar.startAnimation(animScale);
                suaraW.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_x);
                TampilGambar.startAnimation(animScale);
                suaraX.start();
            }
        });
        ButtonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_y);
                TampilGambar.startAnimation(animScale);
                suaraY.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_z);
                TampilGambar.startAnimation(animScale);
                suaraZ.start();
            }
        });

        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                suaraButton.start();
                // TODO Auto-generated method stub
                Intent explicit_intent = new Intent(AlphabetActivity.this,
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