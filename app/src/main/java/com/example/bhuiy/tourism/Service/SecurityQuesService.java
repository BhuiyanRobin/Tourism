package com.example.bhuiy.tourism.Service;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.bhuiy.tourism.Context.SecurityQuesContext;
import com.example.bhuiy.tourism.Model.SecurityQuestion;

import java.util.ArrayList;

/**
 * Created by bhuiy on 4/25/2017.
 */

public class SecurityQuesService {
    private SecurityQuesContext securityQuesContext;
    private SQLiteDatabase sqLiteDatabase;

    public SecurityQuesService(Context context) {
        securityQuesContext = new SecurityQuesContext(context);
    }
    public void open(){
        sqLiteDatabase = securityQuesContext.getWritableDatabase();
    }
    public void close(){
        securityQuesContext.close();
    }


    public ArrayList<SecurityQuestion> GetAll()
    {
        ArrayList<SecurityQuestion> securityQuestions=new ArrayList<SecurityQuestion>();
        this.open();
        Cursor cursor = sqLiteDatabase.query(securityQuesContext.SECURITY_QUES_TBALE,null,null,null,null,null,null,null);
        cursor.moveToFirst();
        if (cursor!=null&&cursor.getCount()>0)
        {
            for(int i = 0; i < cursor.getCount(); i++){

                SecurityQuestion healthCenter=new SecurityQuestion();

                healthCenter.setId(cursor.getInt(cursor.getColumnIndex(securityQuesContext.TABLE_ID)));
                healthCenter.setSecurityQuestion(cursor.getString(cursor.getColumnIndex(securityQuesContext.QUESTION)));
                securityQuestions.add(healthCenter);
                cursor.moveToNext();
            }
        }
        this.close();
        return securityQuestions;
    }
    public boolean Add()
    {
        this.open();
        ContentValues values = new ContentValues();


       ArrayList<SecurityQuestion> securityQuestions=new ArrayList<SecurityQuestion>();
        SecurityQuestion securityQuestion1=new SecurityQuestion(1,"What is first pet name?");
        securityQuestions.add(securityQuestion1);
        securityQuestion1=new SecurityQuestion(2,"What is your high school name?");
        securityQuestions.add(securityQuestion1);
        securityQuestion1=new SecurityQuestion(3,"What is your best friend name?");
        securityQuestions.add(securityQuestion1);
        for (SecurityQuestion s:securityQuestions) {
            values.put(securityQuesContext.TABLE_ID,s.getId());
            values.put(securityQuesContext.QUESTION,s.getSecurityQuestion());
            long id = sqLiteDatabase.insert(securityQuesContext.SECURITY_QUES_TBALE,null,values);
        }
return true;
    }

    public SecurityQuestion Find(int id)
    {
        SecurityQuestion healthCenter=new SecurityQuestion();
        this.open();
        Cursor cursor = sqLiteDatabase.query(securityQuesContext.SECURITY_QUES_TBALE,null,securityQuesContext.TABLE_ID+" = "+Integer.toString(id),null,null,null,null);
        while (cursor.moveToNext())
        {
            healthCenter.setId(cursor.getInt(cursor.getColumnIndex(securityQuesContext.TABLE_ID)));
            healthCenter.setSecurityQuestion(cursor.getString(cursor.getColumnIndex(securityQuesContext.QUESTION)));
        }
        this.close();
        return healthCenter;
    }

}
