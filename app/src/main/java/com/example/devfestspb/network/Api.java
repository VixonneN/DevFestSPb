package com.example.devfestspb.network;

import com.example.devfestspb.network.data_classes.SearchResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String HOST = "https://storage.yandexcloud.net/devfestapi";

    @GET
    Call<SearchResponse> searchResponse();

}
