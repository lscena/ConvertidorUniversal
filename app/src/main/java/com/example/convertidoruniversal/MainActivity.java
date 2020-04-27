package com.example.convertidoruniversal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goMasaActivity(View view) {
        Intent intent = new Intent(MainActivity.this,MasaActivity.class);
        startActivity(intent);
    }

    public void goDistanciaActivity(View view) {
        Intent intent = new Intent(MainActivity.this,DistanciaActivity.class);
        startActivity(intent);
    }

    public void goVolumenActivity(View view) {
        Intent intent = new Intent(MainActivity.this,VolumenActivity.class);
        startActivity(intent);
    }

    public void goCocinaActivity(View view) {
        Intent intent = new Intent(MainActivity.this,CocinaActivity.class);
        startActivity(intent);
    }

    public void goTemperaturaActivity(View view) {
        Intent intent = new Intent(MainActivity.this,TemperaturaActivity.class);
        startActivity(intent);
    }

    public void goPresionActivity(View view) {
        Intent intent = new Intent(MainActivity.this,PresionActivity.class);
        startActivity(intent);
    }
}
