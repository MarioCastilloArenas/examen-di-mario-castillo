package com.example.mariocastillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void goMain(View view) {
        TextView cancelar = findViewById(R.id.cancelar);
        Intent intent = new Intent(Registro.this, MainActivity.class);
        startActivity(intent);
    }

}