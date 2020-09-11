package com.example.test;

import com.example.test.valute.Response;
import com.example.test.valute.Valute;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiCB {
    @GET("daily_json.js")
    Call<Response> getValute();
}
