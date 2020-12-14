package com.example.learnids;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import static android.view.KeyEvent.KEYCODE_BACK;

public class MainActivity extends AppCompatActivity {
    ImageButton pindah,keluar;
    MediaPlayer mp;
    private ImageButton btAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);
        mp = MediaPlayer.create(getBaseContext(), R.raw.backsound);
        mp.start();

        pindah = (ImageButton) findViewById(R.id.buttonsetting);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonabc);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, AlphabetActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonangka);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, AngkaActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonbangundatar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, BangunActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonhewan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, HewanActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonwarna);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, WarnaActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttontransportasi);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, TransportasiActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        btAlert = (ImageButton) findViewById(R.id.buttonexit);
        btAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
                suaraButton.start();
            }
        });
    }

    private void showDialog(){
        android.app.AlertDialog.Builder alertDialogBuilder = new android.app.AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Anda Yakin Ingin Keluar?");
        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Klik Ya untuk keluar!")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol ini diklik, akan menutup dialog
                        // dan tidak terjadi apa2
                        dialog.cancel();
                    }
                })
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        moveTaskToBack(true);
                        MainActivity.this.finish();
                        mp.stop();
                    }
                });
        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}
