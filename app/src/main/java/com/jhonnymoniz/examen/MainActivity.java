package com.jhonnymoniz.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements DataBetween {

    SecondFragment secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstFragment firstFragment = (FirstFragment) getSupportFragmentManager().findFragmentById(R.id.primerFragment);
        firstFragment.dataBetween = this;

        secondFragment = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.segundoFragment);
    }

    @Override
    public void fontData(String texto, int font) {
        secondFragment.createText(texto,font);
    }
}