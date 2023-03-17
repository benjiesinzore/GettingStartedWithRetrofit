package com.example.getingstartedwithretrofit.retrofit;

import com.example.getingstartedwithretrofit.data.ResData;
import com.example.getingstartedwithretrofit.data.User;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MyApiService {

    @POST("Security/CheckRegistration")
    Call<ResData> getDeviceStatus(@Body User user);


    OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.1.4:1677/api/")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
