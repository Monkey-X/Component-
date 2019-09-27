package com.xu.myapplication.sqlite;

import android.provider.BaseColumns;

/**
 * @author:xlc
 * @date:2019/9/26
 * @descirbe:创建契约类，定义了数据库表明，字段名
 */
public final class PetContract {

    private PetContract() {
    }


    public static final class PetEntry implements BaseColumns {

        public final static String TABLE_NAME = "pets";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_PET_NAME = "name";

        public final static String COLUMN_PET_BREED = "breed";

        public final static String COLUMN_PET_GENDER = "gender";

        public final static String COLUMN_PET_WEIGHT = "weight";


        public final static int GENDER_UNKOWN = 0;
        public final static int GENDER_MALE = 1;
        public final static int GENDER_FORMALE = 2;
    }
}
