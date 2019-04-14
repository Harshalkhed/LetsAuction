package interfaces;

import models.RegisterModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.HTTP;
import retrofit2.http.POST;

public  interface RegisterApi {
    @FormUrlEncoded
    @POST("signup")
    Call<RegisterModel> createUser(@Body RegisterModel registerModel);

}
