package com.xu.myapplication;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.xu.myapplication.sqlite.PetContract;
import com.xu.myapplication.sqlite.PetDbHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ARouter.getInstance().build("/test/activity").navigation();
        ARouter.getInstance().inject(this);


        createDatabase();


    }

    private void createDatabase() {
        /**
         *petDbHelper会先检查是否存在一个数据库，
         * 1.不存在，使用oncreate方法创建一个数据库，然后创建SQLiteDatabase的实例对象返回给activity
         * 2.数据库已经存在的话，不调用oncreate方法，直接返回一个关联数据库的SQLiteDatabase对象返回
         */
        PetDbHelper petDbHelper = new PetDbHelper(this);
        SQLiteDatabase db = petDbHelper.getReadableDatabase();
        SQLiteDatabase wdb = petDbHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(PetContract.PetEntry.COLUMN_PET_NAME,"Garfield");
        contentValues.put(PetContract.PetEntry.COLUMN_PET_BREED,"Tabby");
        wdb.insert(PetContract.PetEntry.TABLE_NAME,null,contentValues);
    }
}
