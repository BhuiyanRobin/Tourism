package com.example.bhuiy.tourism.Activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.bhuiy.tourism.Api.ApiModel.ApiModel.ApiRegister;
import com.example.bhuiy.tourism.Api.ApiModel.Data.LogInStatusData;
import com.example.bhuiy.tourism.R;
import com.example.bhuiy.tourism.databinding.ActivityLogInBinding;

public class LogInActivity extends AppCompatActivity {

    ActivityLogInBinding binding;
    LogInStatusData logInStatusData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_log_in);
        logInStatusData=new LogInStatusData();
    }

    public void LogIn(View view) {

        boolean isLogIn=logInStatusData.CanBeLog(binding.inputEmail.getText().toString(),binding.inputPassword.getText().toString());
        if (isLogIn==true)
        {
            Intent intent=new Intent(this,AfterLogIn.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"User Name or Password is incorrect",Toast.LENGTH_SHORT).show();
        }
        ApiRegister register=new ApiRegister(this);
        register.SaveRegisetr();
int a=0;

    }
}
