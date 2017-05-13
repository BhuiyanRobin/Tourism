package com.example.bhuiy.tourism.Activity;

import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.bhuiy.tourism.R;
import com.example.bhuiy.tourism.databinding.ActivityTravelMomentBinding;

public class TravelMoment extends AppCompatActivity {

    ActivityTravelMomentBinding binding;
    String travelId="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_travel_moment);
    }

    public void TakePic(View view) {

    }

    public void Save(View view) {
        com.example.bhuiy.tourism.Model.TravelMoment moment=new com.example.bhuiy.tourism.Model.TravelMoment();
        moment.setMomentDetails(binding.momentDetails.toString());
        Bitmap image=((BitmapDrawable)binding.pic.getDrawable()).getBitmap();
        moment.setMomentPic(image);
        moment.setTravelId(travelId);
    }
}
