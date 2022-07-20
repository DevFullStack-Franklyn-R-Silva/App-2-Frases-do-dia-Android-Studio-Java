package com.hadesfranklyn.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
          "Que o dia comece bem e termine ainda melhor.",
          "Pra hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz.",
          "Às vezes as coisas demoram, mas acontecem. O importante é saber esperar e não perder a fé!",
          "Imagine uma nova história para a sua vida e acredite nela.",
          "Nem todos os dias são bons, mas há algo bom em cada dia."
        };

        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio0a5 = new Random().nextInt(5);
        texto.setText(frases[numeroAleatorio0a5]);

    }
}