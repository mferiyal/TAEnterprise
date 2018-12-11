package com.mfir.pc.taenterprise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mfir.pc.taenterprise.Rest.ApiClient;
import com.mfir.pc.taenterprise.Rest.ApiInterface;

import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {


    EditText edtLoginEmail, edtLoginPassword;
    Button buttonLogin, buttondaftar;
    SessionManagement sessionManagement;
    ApiInterface mApiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtLoginEmail = findViewById(R.id.editLoginEmail);
        edtLoginPassword = findViewById(R.id.editLoginPassword);
        buttondaftar = findViewById(R.id.ButtonDaftarDiLogin);
        buttonLogin = findViewById(R.id.buttonLogin);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<User> getLogin = mApiInterface.getLogin(edtLoginEmail.getText().toString(), edtLoginPassword.getText().toString());
                getLogin.enqueue(new Callback<User>(){
                    @Override
                    public void onResponse(retrofit2.Call<User> call, Response<User> response) {
                        String status = response.body().getEmail();
                        if (status.equals("okee")){
                            User user = response.body().getPassword();
//                            create sesion
                            sessionManagement.createLoginSession(User.getEmail(), User.getPass());
                            Intent i = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i);
                            finish();

                        }

                    @Override
                    public void onFailure(retrofit2.Call<ModelUser> call, Throwable t) {

                    }

                    }
                }
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

}
