package com.example.gamequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
Button valider ;
RelativeLayout r;
LinearLayout l;
loginActivity login;
TextView t;
static String nom;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        valider=findViewById(R.id.ajouter);
        l=findViewById(R.id.conteneur);

        this.login=this;
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               custumpopup popup=new custumpopup(login);
               popup.build();
               popup.getBtnvalider().setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       nom=popup.getname();
                       ajoutSession(nom);

                       popup.dismiss();

                   }
               });
               popup.getBtnAnnuler().setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       popup.dismiss();
                   }
               });
            }
        });

    }
    public void ajoutSession(String nom){
        View view=getLayoutInflater().inflate(R.layout.card,null);
 @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView nameView=view.findViewById(R.id.nomsession);
 Button delete=view.findViewById(R.id.deletebtn);
 nameView.setText(nom);
 delete.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         l.removeView(view);
     }
 });
 view.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent main=new Intent(getApplicationContext(),MainActivity.class);
         startActivity(main);
         finish();
     }
 });
 l.addView(view);
    }
}
