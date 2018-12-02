package com.mfir.pc.taenterprise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Daftar extends AppCompatActivity {

    Button btn_daftar;
    EditText Edtnama,EdtEmail,EdtPassword;

    private void goToActivity(){
        Intent mIntent = new Intent(getApplicationContext(), Login.class);
        startActivity(mIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        btn_daftar = findViewById(R.id.ButtonDaftarDiLogin);
        Edtnama =findViewById(R.id.editDaftarNama);
        EdtEmail =findViewById(R.id.editDaftarEmail);
        EdtPassword =findViewById(R.id.editDaftarPassword);
    }
}
