package com.example.gamequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class soloActivity extends AppCompatActivity {
    private EditText textsolo;
    private Button btnvalider;
    private TextView t;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo);
        this.textsolo=(EditText) findViewById(R.id.textsolo);
        this.btnvalider=(Button) findViewById(R.id.buttonValider);


        btnvalider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            t.setText("yo");
            }
        });
    }
}