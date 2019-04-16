package com.akrinindia.sangli.letsauction;

import android.content.Intent;
import android.location.Address;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import helpers.ApiClient;
import interfaces.RegisterApi;
import models.RegisterModel;
import models.RegisterResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class register extends AppCompatActivity {
    EditText name,email,phone,address,password;
    String name2,email2,phone2,address2,password2;
    Button button;
    Intent i;
    private static final String TAG = "register";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (EditText) findViewById(R.id.input_name);
        email = (EditText)findViewById(R.id.input_email);
        phone = (EditText)findViewById(R.id.input_phone);
        address = (EditText)findViewById(R.id.input_Address);
        password=(EditText) findViewById(R.id.input_password);

        button = (Button)findViewById(R.id.btn_signup);

        i = new Intent(register.this,login_activity.class);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name2 = name.getText().toString();
                email2 = email.getText().toString();
                phone2 = phone.getText().toString();
                address2 = address.getText().toString();
                password2 = password.getText().toString();

                //RegisterModel rr = new RegisterModel(name2,email2,phone2,address2,password2);
                //Toast.makeText(register.this, name2.toString(), Toast.LENGTH_SHORT).show();

                RegisterApi registerApi = ApiClient.getClient().create(RegisterApi.class);
                Call<RegisterResponse> call = registerApi.createUser(name2,email2,phone2,address2,password2);
                call.enqueue(new Callback<RegisterResponse>() {
                    @Override
                    public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                        RegisterResponse registerModel = response.body();
                        String message = registerModel.getMsg();
                        if(registerModel.getState() == "fail")
                        {
                            Toast.makeText(register.this, message, Toast.LENGTH_SHORT).show();
                            return;
                        }

                        startActivity(i);
                       // Log.i(TAG, "post submitt`ed to API." + response.body().toString());

                    }

                    @Override
                    public void onFailure(Call<RegisterResponse> call, Throwable t) {
                        Toast.makeText(register.this, "chya aaila error ahetch ", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


    }
}
