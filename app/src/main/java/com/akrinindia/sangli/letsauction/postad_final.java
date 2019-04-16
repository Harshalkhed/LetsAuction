package com.akrinindia.sangli.letsauction;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class postad_final extends AppCompatActivity {
    TextView cat,subcat;
    Context context;
    ImageButton button;
    EditText brand_name,year_reg,km,base_price,no_of_owners,description;
    private int PICK_IMAGE_FROM_GALLERY_REQUEST_CODE = 3132;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postad_final);
        cat = findViewById(R.id.text_category);
        subcat = findViewById(R.id.text_sub_category);
        //SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        //String cat2= settings.getString("cat",null);
        //cat.setText(cat2);

        //String subcat2 = getIntent().getStringExtra("");
        cat.setText("Bikes");
        subcat.setText("Bikes");

      button=findViewById(R.id.btn_image_postad);
      button.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                                        intent.setType("image/*");
                                        intent.setAction(Intent.ACTION_GET_CONTENT);
                                        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
                                        try
                                        {
                                            startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_FROM_GALLERY_REQUEST_CODE);
                                        }
                                        catch (android.content.ActivityNotFoundException e)
                                        {
                                            Toast.makeText(postad_final.this, "Something Went Wrong", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }
      );


    }
}
