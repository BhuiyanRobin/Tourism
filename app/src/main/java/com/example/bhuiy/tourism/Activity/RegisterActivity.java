package com.example.bhuiy.tourism.Activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.bhuiy.tourism.Model.Register;
import com.example.bhuiy.tourism.R;
import com.example.bhuiy.tourism.databinding.ActivityRegisterBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding registerBinding;
    DatabaseReference database;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerBinding= DataBindingUtil.setContentView(this,R.layout.activity_register);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            registerBinding.iamge.setImageBitmap(imageBitmap);
        }
    }
    public void SignUp(View view) {
        Register register=new Register();
        register.setPassword(registerBinding.password.getText().toString());
        register.setFullName(registerBinding.fullName.getText().toString());
        register.setEmail(registerBinding.email.getText().toString());
        register.setEmergencyConNo(registerBinding.emergencyNo.getText().toString());
        register.setAddress(registerBinding.address.getText().toString());
        Bitmap image=((BitmapDrawable)registerBinding.iamge.getDrawable()).getBitmap();
//create a file to write bitmap data
        File f = new File(this.getCacheDir(), register.getEmail());
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//Convert bitmap to byte array
        Bitmap bitmap = image;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0 /*ignored for PNG*/, bos);
        byte[] bitmapdata = bos.toByteArray();

//write the bytes in file
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.write(bitmapdata);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // register.setProfileImage(image);
        database= FirebaseDatabase.getInstance().getReference("Tourism");

        database.push().setValue(register);
    }

    public void dispatchTakePictureIntent(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}
