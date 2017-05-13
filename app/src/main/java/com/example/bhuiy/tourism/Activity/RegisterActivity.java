package com.example.bhuiy.tourism.Activity;

import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.bhuiy.tourism.Model.Register;
import com.example.bhuiy.tourism.R;
import com.example.bhuiy.tourism.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding registerBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerBinding= DataBindingUtil.setContentView(this,R.layout.activity_log_in);
    }

    public void SignUp(View view) {
        Register register=new Register();
        register.setPassword(registerBinding.password.toString());
        register.setFullName(registerBinding.fullName.toString());
        register.setEmail(registerBinding.email.toString());
        register.setEmergencyConNo(registerBinding.emergencyNo.toString());
        register.setAddress(registerBinding.address.toString());
        Bitmap image=((BitmapDrawable)registerBinding.iamge.getDrawable()).getBitmap();
        register.setProfileImage(image);
    }
}
