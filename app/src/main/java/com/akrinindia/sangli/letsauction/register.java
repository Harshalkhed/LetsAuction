package com.akrinindia.sangli.letsauction;

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
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class register extends AppCompatActivity {
    EditText name,email,phone,address,password;
    String name2,email2,phone2,address2,password2;
    Button button;
    private static final String TAG = "register";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.input_name);
        email = findViewById(R.id.input_email);
        phone = findViewById(R.id.input_phone);
        address = findViewById(R.id.input_Address);
        password= findViewById(R.id.input_password);

        button = findViewById(R.id.btn_signup);


        name2 = name.getText().toString();
        email2 = name.getText().toString();
        phone2 = name.getText().toString();
        address2 = name.getText().toString();
        password2 = name.getText().toString();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterModel rr = new RegisterModel();
                rr.setFullname(name2);
                rr.setEmail(email2);
                rr.setPhone(phone2);
                rr.setAddress(address2);
                rr.setPassword(password2);


                RegisterApi registerApi = ApiClient.getClient().create(RegisterApi.class);
                Call<RegisterModel> call = registerApi.createUser(rr);
                call.enqueue(new Callback<RegisterModel>() {
                    @Override
                    public void onResponse(Call<RegisterModel> call, Response<RegisterModel> response) {
                       // Log.i(TAG, "post submitted to API." + response.body().toString());
                        Toast.makeText(register.this, "asas", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<RegisterModel> call, Throwable t) {
                        Toast.makeText(register.this, "chya aaila error ahetch ", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


    }
}
