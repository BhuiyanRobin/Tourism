package com.example.bhuiy.tourism.Context;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bhuiy on 4/25/2017.
 */

public class SecurityQuesContext extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String SECURITY_QUES_TBALE = "tbl_sec_ques";
    public static final String TABLE_ID = "tbl_id";
    public static final String QUESTION = "tbl_QUESTION";

    public static final String CREATE_SECURITY_QUES = "create table "+SECURITY_QUES_TBALE+"("+
            TABLE_ID+" integer primary key, "+
            QUESTION+" text);";
    public SecurityQuesContext(Context context) {
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
