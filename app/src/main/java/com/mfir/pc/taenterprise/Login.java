package com.mfir.pc.taenterprise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.mfir.pc.taenterprise.Model.ModelUser;
import com.mfir.pc.taenterprise.Model.ResultUser;
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


                ApiInterface mApiInterface = ApiClient.getClient().create(ApiInterface.class);

//                RequestBody reqUsername = MultipartBody.create(MediaType.parse("multipart/form-data"),
//                        txt_username.getText().toString());
//                RequestBody resPassword = MultipartBody.create(MediaType.parse("multipart/form-data"),
//                        txt_password.getText().toString());


                ApiInterface mApiInterface = ApiClient.getClient().create(ApiInterface.class);

                retrofit2.Call<ResultUser> mLogin =  mApiInterface.loginRequest(edtLoginEmail.getText().toString());
                mLogin.enqueue(new Callback<ResultUser>() {
                    @Override
                    public void onResponse(retrofit2.Call<ResultUser> call, Response<ResultUser> response) {
                        String status = response.body().getStatus();
                        if (status.equals("success"))
                        {

                            User user = response.body().getUser();
                            Intent i = new Intent(Login.this, MainActivity.class);
                            i.putExtra("username", user.getUsername());
                            i.putExtra("nama_user", user.getNama_user());

                            ModelUser user = response.body().getUser();
                            Intent i = new Intent(Login.this, MainActivity.class);
                            i.putExtra("Nama", user.getNama());
                            i.putExtra("Email", user.getEmail());


                            startActivity(i);

                        }

//                        Log.d("Status", response.body().getStatus());
//                        List<UserModel> mUser = response.body().getData();




                    }

                    @Override
                    public void onFailure(retrofit2.Call<ResultUser> call, Throwable t) {

//                        Log.d("Status", t.getMessage());

                        Log.d("Status", t.getMessage());

                        Toast.makeText(getApplicationContext(),"fail login", Toast.LENGTH_SHORT).show();

                    }
                });
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
