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

import java.sql.Date;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class RegisterActivity2 extends AppCompatActivity implements View.OnClickListener{
    public EditText cin;
    public EditText adr;
    public EditText teld;
    public EditText telp;
    public EditText telm;
    public EditText ville;
    public EditText pays;
    public EditText cp;
    public EditText nationalite;
    public EditText fonction;
    public EditText societe;
    public EditText fax;
    public EditText langue;
    public RadioButton radioButton;
    private RadioGroup radioGroup;
    String email = "";
    String nom = "";
    String prenom = "";
    String sexe = "";
    public Date date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        adr = (EditText) findViewById(R.id.adresse);
        teld = (EditText) findViewById(R.id.teldomicile);
        telm = (EditText) findViewById(R.id.telmobile);
        telp = (EditText) findViewById(R.id.telpro);
        ville = (EditText) findViewById(R.id.ville);
        pays = (EditText) findViewById(R.id.pays);
        cp = (EditText) findViewById(R.id.codepostal);
        nationalite = (EditText) findViewById(R.id.nationality);
        fonction = (EditText) findViewById(R.id.fonction);
        societe = (EditText) findViewById(R.id.societe);
        fax = (EditText) findViewById(R.id.fax);
        cin = (EditText) findViewById(R.id.cin);
        radioGroup = (RadioGroup) findViewById(R.id.langue);
        ((Button)findViewById(R.id.envoyer)).setOnClickListener(this);
        Intent intent = getIntent();
        if (intent != null){



            if (intent.hasExtra("email")){
                email = intent.getStringExtra("email");
            }
            if (intent.hasExtra("nom")){
                nom = intent.getStringExtra("nom");
            }
            if (intent.hasExtra("prenom")){
                prenom = intent.getStringExtra("prenom");
            }
            if (intent.hasExtra("sexe")){
                sexe = intent.getStringExtra("sexe");
            }
            if (intent.hasExtra("date")){
                 date=Date.valueOf(intent.getStringExtra("date"));

            }
        }
        System.out.println(date);
    }
    @Override
    public void onClick(View v) {
        ajouter();

                         }

        private void ajouter() {

            String cinadd = cin.getText().toString().trim();
            String adradd = adr.getText().toString().trim();
            String teldadd = teld.getText().toString().trim();
            String telmadd = telm.getText().toString().trim();
            String telpadd = telp.getText().toString().trim();
            String villeadd = ville.getText().toString().trim();
            String paysadd = pays.getText().toString().trim();
            String cpadd = cp.getText().toString().trim();
            String nationaliteadd = nationalite.getText().toString().trim();
            String fonctionadd = fonction.getText().toString().trim();
            String societeadd = societe.getText().toString().trim();
            String faxadd = fax.getText().toString().trim();



            int selectedId = radioGroup.getCheckedRadioButtonId();
            radioButton = (RadioButton) findViewById(selectedId);
            String langueadd = radioButton.getText().toString().trim();

            if (adradd.isEmpty()) {
                adr.setError("Please enter your adress");
            } else if (teldadd.isEmpty()) {
                teld.setError("Please enter your teld");
            } else if (telmadd.isEmpty()) {
                telm.setError("Please enter your telp");
            } else if (telpadd.isEmpty()) {
                telp.setError("Please enter your telp");
            } else if (cinadd.isEmpty()) {
                telp.setError("Please enter your cin");
            }else if (villeadd.isEmpty()) {
                ville.setError("Please enter your ville");
            } else if (paysadd.isEmpty()) {
                pays.setError("Please enter your pays");
            } else if (cpadd.isEmpty()) {
                cp.setError("Please enter your zip code");
            } else if (nationaliteadd.isEmpty()) {
                nationalite.setError("Please enter your nationality");
            } else if (fonctionadd.isEmpty()) {
                fonction.setError("Please enter your fonction");
            } else if (societeadd.isEmpty()) {
                societe.setError("Please enter your societe");
            } else if (faxadd.isEmpty()) {
                fax.setError("Please enter your fax");
            } else if (langueadd.isEmpty()) {
                langue.setError("Please enter your langue");
            } else {


                Retrofit Rf = new Retrofit.Builder().baseUrl("http://192.168.43.74:80/").addConverterFactory(GsonConverterFactory.create()).build();
                ApiHandler api = (ApiHandler) Rf.create(ApiHandler.class);
                Call<user> addUser = api.insertUser(cinadd, sexe, nom, prenom,date , email, nationaliteadd, adradd, villeadd, cpadd, paysadd, teldadd, telmadd, societeadd, fonctionadd, telpadd,faxadd, langueadd);
                addUser.enqueue(new Callback<user>() {
                    public void onResponse(Response<user> response, Retrofit retrofit) {
                        Toast.makeText(RegisterActivity2.this, "user successfully registred ", Toast.LENGTH_LONG).show();
                        finish();
                    }

                    public void onFailure(Throwable t) {
                        Toast.makeText(RegisterActivity2.this, "failed" + t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            }
        }
    }
