package com.xu.myapplication.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author:xlc
 * @date:2019/9/26
 * @descirbe:使用SQLiteOpenHelper创建数据库
 */
public class PetDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "shelter.db";//数据库的名字

    private static final int DATABASE_VERSION = 1;//数据库的版本号

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetContract.PetEntry.TABLE_NAME +
                " (" + PetContract.PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + PetContract.PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL,"
                + PetContract.PetEntry.COLUMN_PET_BREED + " TEXT,"
                + PetContract.PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL,"
                + PetContract.PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //数据更新的时候会调用该方法
    }
}
