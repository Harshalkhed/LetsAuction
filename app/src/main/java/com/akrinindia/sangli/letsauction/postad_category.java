package com.akrinindia.sangli.letsauction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class postad_category extends AppCompatActivity {
    ImageButton bikes;
    SharedPreferences.Editor editor;
    SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(postad_category.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postad_category);
        bikes = findViewById(R.id.bikes);
        bikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), sub_category.class);

                editor.putString("cat","Bikes");
                //intent.putExtra("cat", "Bikes");
                startActivity(intent);
            }
        });
    }
}
