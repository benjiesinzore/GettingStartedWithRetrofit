package com.example.getingstartedwithretrofit;

import static com.example.getingstartedwithretrofit.retrofit.MyApiService.retrofit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.getingstartedwithretrofit.data.ResData;
import com.example.getingstartedwithretrofit.data.User;
import com.example.getingstartedwithretrofit.retrofit.MyApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setDeviceID("4d7ea77ea53c8e4b");

        MyApiService service = retrofit.create(MyApiService.class);

        Call<ResData> call = service.getDeviceStatus(user);
        call.enqueue(new Callback<ResData>() {
            @Override
            public void onResponse(@NonNull Call<ResData> call, @NonNull Response<ResData> response) {
                ResData user = response.body();
                assert user != null;
                String getStatus = user.getMsg();

                Log.i("GetMyStatusRe", getStatus);
            }

            @Override
            public void onFailure(@NonNull Call<ResData> call, @NonNull Throwable t) {

                Log.i("GetMyStatusRes-Error", t.getMessage());
            }
        });
    }
}