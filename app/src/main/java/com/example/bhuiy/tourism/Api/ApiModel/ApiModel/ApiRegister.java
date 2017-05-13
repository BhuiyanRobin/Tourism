package com.example.bhuiy.tourism.Api.ApiModel.ApiModel;

import android.content.Context;

import com.example.bhuiy.tourism.Model.Register;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by bhuiy on 5/12/2017.
 */

public class ApiRegister {
    private Context context;
    private String url;
    private String json;
    private String resp;
    public ApiRegister(Context context)
    {
        Register register=new Register("bhuiyan","123","018765","dhaka","b@live.com");
       this.context=context;
        Gson gson = new Gson();
        Type type = new TypeToken<Register>() {}.getType();
         json = gson.toJson(register, type);

        url="http://localhost:41558//api/register";
    }
    public boolean SaveRegisetr()
    {
        boolean flag = false;
        OkHttpClient client = new OkHttpClient();
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder().url(url).post(body).build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                resp = response.body().string().toString();
            }
        });
        if(resp.equals("1")){
            flag = true;
        }
        return flag;
    }
}
