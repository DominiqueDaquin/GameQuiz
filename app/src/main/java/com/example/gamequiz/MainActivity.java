/*
**  Created by Dakitech on 28/01/23
 */
package com.example.gamequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView solo;
    private TextView equipe;
    private TextView ligne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.solo= (TextView) findViewById(R.id.solo);
        this.equipe= (TextView) findViewById(R.id.equipe);
        this.ligne= (TextView) findViewById(R.id.ligne);

        solo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jeusolo=new Intent(getApplicationContext(),loginActivity.class);
                startActivity(jeusolo);
                finish();
            }
        });
        equipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jeuequipe=new Intent(getApplicationContext(),equipeActivity.class);
                startActivity(jeuequipe);
                finish();
            }
        });
        ligne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jeuligne=new Intent(getApplicationContext(),ligneActivity.class);
                startActivity(jeuligne);
                finish();
            }
        });
    }
}