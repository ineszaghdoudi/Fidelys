package com.example.fidelyss;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    public EditText email;
    public EditText nom;
    public EditText prenom;
    public EditText sexe;
    public EditText datetype;
    public RadioButton radioButton;
    private RadioGroup radioGroup;

    public Date datenaissance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = (EditText) findViewById(R.id.Email);
        nom = (EditText) findViewById(R.id.Nom);
        prenom = (EditText)findViewById(R.id.Prenom);
        radioGroup = (RadioGroup) findViewById(R.id.sexe);
        datetype = (EditText) findViewById(R.id.Date);

        ((Button)findViewById(R.id.button)).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;




                sendInfo();



    }

    private void sendInfo() {



        String emailadd = email.getText().toString().trim();
        String nomadd = nom.getText().toString().trim();
        String prenomadd = prenom.getText().toString().trim();
       String dateadd =  datetype.getText().toString().trim();
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(selectedId);
        String sexeadd = radioButton.getText().toString().trim();

        if(emailadd.isEmpty()){
            email.setError("Please enter your email");
        }else if(nomadd.isEmpty()){
            nom.setError("Please enter your name");
        }else if(prenomadd.isEmpty()){
            prenom.setError("Please enter your lastname");
        }else if(sexeadd.isEmpty()){
            sexe.setError("Please choose your gender");
        }
        else{
            Toast.makeText(RegisterActivity.this, dateadd, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, RegisterActivity2.class);
            intent.putExtra("email", emailadd);
            intent.putExtra("nom", nomadd);
            intent.putExtra("prenom", prenomadd);
            intent.putExtra("sexe", sexeadd);
            intent.putExtra("date", dateadd);
            startActivity(intent);



        }
    }

}