package com.example.dicon_2019;



import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface NetRetrofitServices {

    @POST("/post/user")
    @FormUrlEncoded
    Call<loginData> register(@Field("id") String id, @Field("passwd") String pw);

    @POST("/post/login")
    @FormUrlEncoded
    Call<ResponseBody> login(@Field("id") String id,@Field("passwd")String pw);
}