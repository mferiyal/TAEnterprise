package com.mfir.pc.taenterprise;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
public class Login extends AppCompatActivity {


    EditText edtLoginEmail, edtLoginPassword;
    Button buttonLogin, buttondaftar;
    SessionManagement sessionManagement;

    private void goToActivity(){
        Intent mIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtLoginEmail = findViewById(R.id.editLoginEmail);
        edtLoginPassword = findViewById(R.id.editLoginPassword);
        buttondaftar = findViewById(R.id.ButtonDaftarDiLogin);
        buttonLogin = findViewById(R.id.buttonLogin);
        sessionManagement = new SessionManagement(this);
        if(sessionManagement.isLoggedIn()){
            HashMap<String,String> ses = sessionManagement.getUserInformation();
            edtLoginEmail.setText(ses.get(SessionManagement.KEY_EMAIL));
            edtLoginPassword.setText(ses.get(SessionManagement.KEY_PASSWOrD));
            goToActivity();
        }
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //       sessionManagement.createLoginSession(edtLoginEmail.getText().toString(), edtLoginPassword.getText().toString());
                String nama = edtLoginEmail.getText().toString();
                String password = edtLoginPassword.getText().toString();
                /*Boolean chklogin = db.cekLogin(nama,password);
                if (chklogin==true){
                    sessionManagement.createLoginSession(edtLoginEmail.getText().toString(), edtLoginPassword.getText().toString());
                    Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    i.putExtra("username",nama);
                    startActivity(i);
                }else {
                    Toast.makeText(getApplicationContext(),"Anda belum terdaftar",Toast.LENGTH_SHORT).show();
                }*/
            }
        });
        buttondaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Daftar.class);
                startActivity(i);
            }
        });

    }
    private boolean CekValidasi(){
        if (edtLoginPassword.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Masukkan Email Anda !!!", Toast.LENGTH_SHORT).show();
            return false;
        }else if (edtLoginPassword.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Masukkan Password Anda !!!", Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }
}
