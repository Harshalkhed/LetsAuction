package interfaces;

import models.RegisterModel;
import models.RegisterResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.HTTP;
import retrofit2.http.POST;

public  interface RegisterApi {
    @FormUrlEncoded
    @POST("signup")
    Call<RegisterResponse> createUser(@Field("fullname") String fullname, @Field("email") String email,
                                      @Field("phone") String phone, @Field("address")
                                           String address, @Field("password") String password);

}
