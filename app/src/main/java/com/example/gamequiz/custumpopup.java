/**
 * Created by Daki-tech on 02/02/2023 at 10:25
 * */
package com.example.gamequiz;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;

public class custumpopup extends Dialog{
    /**
     * ici on renseigne les differents elements de la popup
     * */
private EditText textPopup;
private Button btnvalider;
private Button btnAnnuler;
    //constructeur
    public custumpopup(Activity activity) {
        super(activity, androidx.appcompat.R.style.Theme_AppCompat_Dialog);
        setContentView(R.layout.ppopup);
        this.textPopup=findViewById(R.id.editpopup);
        this.btnvalider= findViewById(R.id.btnvalider);
        this.btnAnnuler=findViewById(R.id.btnannuler);


    }
    public String getname(){
        return this.textPopup.getText().toString();
    }
/**
 * ici on definis les getteurs des buttons de la popup
 * */
    public Button getBtnvalider() {
        return btnvalider;
    }

    public Button getBtnAnnuler() {
        return btnAnnuler;
    }

    public void build(){
        show();
    }


}