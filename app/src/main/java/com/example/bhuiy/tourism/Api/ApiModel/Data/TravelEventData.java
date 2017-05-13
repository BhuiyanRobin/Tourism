package com.example.bhuiy.tourism.Api.ApiModel.Data;

import android.support.annotation.Nullable;

import com.example.bhuiy.tourism.Api.ApiModel.Interface.ITravelEventApi;
import com.example.bhuiy.tourism.Api.ApiModel.ApiModel.TravelEvent;
import com.example.bhuiy.tourism.Model.Api_Url;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class TravelEventData {
    ArrayList<TravelEvent> items=new ArrayList<>();
ITravelEventApi travelApi;
    public ArrayList<TravelEvent> GetTravelEvent(@Nullable int id, String email)
    {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Api_Url.Main_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        travelApi = retrofit.create(ITravelEventApi.class);
        getTravelData();
        return items;
    }

    private void getTravelData() {
        final Call<ArrayList<TravelEvent>> travel=travelApi.getTravelEventData();
        travel.enqueue(new Callback<ArrayList<TravelEvent>>() {
            @Override
            public void onResponse(Call<ArrayList<TravelEvent>> call, Response<ArrayList<TravelEvent>> response) {
                ArrayList<TravelEvent> travelEvents=response.body();
                for(TravelEvent event:travelEvents)
                {
                    items.add(event);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<TravelEvent>> call, Throwable t) {
int a=0;
            }
        });

    }
}
