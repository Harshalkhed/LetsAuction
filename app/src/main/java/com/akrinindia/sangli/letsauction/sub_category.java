package com.akrinindia.sangli.letsauction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import helpers.ApiClient;
import helpers.SubCatApiClient;
import helpers.SubcategoryViewAdapter;
import interfaces.GetSubCategoriesApi;
import interfaces.RegisterApi;
import models.GetSubCategoriesResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class sub_category extends AppCompatActivity {

    private LinearLayoutManager linearLayoutManager;
    private List<GetSubCategoriesResponse> list = null;
    RecyclerView recyclerView ;
    SubcategoryViewAdapter subcategoryViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);

        getCategories();

    }
    private void getCategories()
    {
        String cat = getIntent().getStringExtra("cat");
        GetSubCategoriesApi getSubCategoriesApi = SubCatApiClient.getClient().create(GetSubCategoriesApi.class);
        Call<List<GetSubCategoriesResponse>> call = getSubCategoriesApi.getSubTypes(cat);
        call.enqueue(new Callback<List<GetSubCategoriesResponse>>() {
            @Override
            public void onResponse(Call<List<GetSubCategoriesResponse>> call, Response<List<GetSubCategoriesResponse>> response) {
                list =response.body();
                recyclerView = findViewById(R.id.list_view_sub_category);
                linearLayoutManager = new LinearLayoutManager(sub_category.this);
                recyclerView.setLayoutManager(linearLayoutManager);

                subcategoryViewAdapter = new SubcategoryViewAdapter(list,getApplicationContext());
                recyclerView.setAdapter(subcategoryViewAdapter);

            }

            @Override
            public void onFailure(Call<List<GetSubCategoriesResponse>> call, Throwable t) {

            }
        });
    }


}
