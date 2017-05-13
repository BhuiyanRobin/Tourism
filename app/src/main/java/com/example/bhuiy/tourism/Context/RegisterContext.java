package com.example.bhuiy.tourism.Context;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bhuiy on 4/25/2017.
 */

public class RegisterContext extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String Table_Register = "tbl_sec_ques";
    public static final String Col_Id = "tbl_id";
    public static final String Col_Full_Name = "tbl_Full_Name";
    public static final String Col_User_Name = "tbl_User_Name";
    public static final String Col_Password = "tbl_Password";
    public static final String Col_EmergencyConNo = "tbl_emergencyConNo";
    public static final String Col_Address = "tbl_address";
    public static final String Col_SecurityQuestionId = "tbl_SecurityQuestionId";
    public static final String Col_RoleId = "tbl_RoleId";

    public static final String CREATE_SECURITY_QUES = "create table "+Table_Register+"("+
            Col_Id+" integer primary key, "+
            Col_Full_Name+" text, "+
            Col_User_Name+" text, "+
            Col_Password+" text, "+
            Col_RoleId+" integer, "+
            Col_EmergencyConNo+" text, "+
            Col_Address+"text primary key, "+
            Col_SecurityQuestionId+" integer);";
    public RegisterContext(Context context) {
        super(context, DatabaseInfo.DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_SECURITY_QUES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+CREATE_SECURITY_QUES);
        onCreate(db);
    }
}
