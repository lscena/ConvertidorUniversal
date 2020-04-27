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
        Intent goMasaIntentFromMain = new Intent(MainActivity.this,MasaActivity.class);
        startActivity(goMasaIntentFromMain);
    }
}
