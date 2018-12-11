package com.mfir.pc.taenterprise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mfir.pc.taenterprise.Model.ResultDaftar;
import com.mfir.pc.taenterprise.Model.ResultUser;
import com.mfir.pc.taenterprise.Rest.ApiClient;
import com.mfir.pc.taenterprise.Rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
        Edtnama = findViewById(R.id.editDaftarNama);
        EdtEmail = findViewById(R.id.editDaftarEmail);
        EdtPassword = findViewById(R.id.editDaftarPassword);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = Edtnama.getText().toString();
                String email = EdtEmail.getText().toString();
                String password = EdtPassword.getText().toString();
                /*Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
*/
                ApiInterface mApiInterface = ApiClient.getClient().create(ApiInterface.class);
                retrofit2.Call<ResultDaftar> mLogin = mApiInterface.daftar(nama, email, password);
                mLogin.enqueue(new Callback<ResultDaftar>() {


                    @Override
                    public void onResponse(Call<ResultDaftar> call, Response<ResultDaftar> response) {
                        String resultdaftar = response.body().getStatus();
                        String message = response.body().getMessage();
                        if (resultdaftar.equals("Berhasil")) {
                            Toast.makeText(Daftar.this, message, Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Daftar.this, message, Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResultDaftar> call, Throwable t) {
                        Toast.makeText(Daftar.this, "Jaringan Error!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
