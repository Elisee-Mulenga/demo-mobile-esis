package org.esissalama.mobile.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static Button button;
    public static ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reliant le bouton de roulement de son id..
        button = findViewById(R.id.btnjouer);
        //liant à la fois l'imageView des images de dés de son id..
        picture = findViewById(R.id.image);

        // tableau pour stocker les images des dés
        final int dice[] = {R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3,
                R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6};

        // on appelle la fonction OnClick
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on genere un nombre aleatoire avec random
                Random random = new Random();
                int chiffre = random.nextInt(6);
                picture.setImageResource(dice[chiffre]);
            }
        })

        ;}
}