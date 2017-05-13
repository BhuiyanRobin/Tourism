package com.example.bhuiy.tourism.Api.ApiModel.Interface;

import com.example.bhuiy.tourism.Api.ApiModel.ApiModel.TravelEvent;
import com.example.bhuiy.tourism.Model.Api_Url;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by bhuiy on 5/10/2017.
 */

public interface ITravelEventApi {

    @GET(Api_Url.URL_GetTravelEvent)
    Call<ArrayList<TravelEvent>> getTravelEventData();
}
