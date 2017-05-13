package com.example.bhuiy.tourism.Api.ApiModel.Data;

import com.example.bhuiy.tourism.Api.ApiModel.Interface.ILogInStatusApi;
import com.example.bhuiy.tourism.Api.ApiModel.ApiModel.LogInStatus;
import com.example.bhuiy.tourism.Model.Api_Url;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bhuiy on 5/12/2017.
 */

public class LogInStatusData {
    private ArrayList<LogInStatus> logInStatuses=new ArrayList<>();
    ILogInStatusApi api;
    int a=0;

public boolean CanBeLog(String email,String password)
{
    Retrofit retrofit=new Retrofit.Builder()
            .baseUrl(Api_Url.Main_Url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    api=retrofit.create(ILogInStatusApi.class);
    checkLogIn();
    //logInStatuses.get(0).getStatusCode();
    return true;
}

    private void checkLogIn() {
        final Call<ArrayList<LogInStatus>> logIn=api.isLogedIn();
        logIn.enqueue(new Callback<ArrayList<LogInStatus>>() {
            @Override
            public void onResponse(Call<ArrayList<LogInStatus>> call, Response<ArrayList<LogInStatus>> response) {

                for (LogInStatus log:response.body()
                     ) {
                    logInStatuses.add(log);
                }

            }

            @Override
            public void onFailure(Call<ArrayList<LogInStatus>> call, Throwable t) {
                    a=2;
            }
        });

    }

}
