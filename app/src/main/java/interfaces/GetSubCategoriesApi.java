package interfaces;

import java.util.ArrayList;
import java.util.List;

import models.GetSubCategoriesResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GetSubCategoriesApi {
    @FormUrlEncoded
    @POST("get_subtypes")
    Call<List<GetSubCategoriesResponse>> getSubTypes(@Field("type") String type);

}
