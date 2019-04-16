package com.akrinindia.sangli.letsauction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import helpers.ApiClient;
import interfaces.LoginApi;
import models.LoginResponse;
import models.RegisterResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class login_activity extends AppCompatActivity {
    EditText email,password;
    String email2,password2;
    Intent i;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        email = (EditText) findViewById(R.id.etxUserName);
        password = (EditText) findViewById(R.id.etxPassword);

        b = findViewById(R.id.crdBtnLogin);

    i = new Intent(login_activity.this,Landingpage.class);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email2 = email.getText().toString();
                password2 = password.getText().toString();

                LoginApi loginApi = ApiClient.getClient().create(LoginApi.class);
                Call<LoginResponse> call = loginApi.isLoggedIn(email2,password2);
                call.enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        LoginResponse registerModel = response.body();
                        String message = registerModel.getMsg();
                        if(registerModel.getState() == "fail")
                        {

                            Toast.makeText(login_activity.this, message, Toast.LENGTH_SHORT).show();

                        }else
                        {
                            startActivity(i);
                            finish();
                        }


                        // Log.i(TAG, "post submitt`ed to API." + response.body().toString());
                        //Toast.makeText(login_activity.this, message, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        Toast.makeText(login_activity.this, "unable to login", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


    }
}
