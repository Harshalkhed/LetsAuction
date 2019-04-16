package models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GetSubCategoriesResponse {
    //@SerializedName("subtype_name")
    private String subtype_name;

    public GetSubCategoriesResponse() {
    }

    public GetSubCategoriesResponse(String subtype_name) {
        this.subtype_name = subtype_name;
    }

    public String getSubtype_name() {
        return subtype_name;
    }

    public void setSubtype_name(String subtype_name) {
        this.subtype_name = subtype_name;
    }
}
