package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.test.valute.AllInfo;
import com.example.test.valute.Response;
import com.example.test.valute.Valute;

import java.util.ArrayList;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit = new Retrofit.Builder().baseUrl("https://www.cbr-xml-daily.ru/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiCB apiCB = retrofit.create(ApiCB.class);
        Call<Response> responseCall = apiCB.getValute();
        responseCall.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Map<String, AllInfo> allInfoMap = response.body().getValuteInfo();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.addAll(allInfoMap.keySet());
                for (int i = 0; i < arrayList.size(); i++) {
                    Toast.makeText(getApplicationContext(), allInfoMap.get(arrayList.get(i)).getName(),Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }
}