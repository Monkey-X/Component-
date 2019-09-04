package com.xu.myapplication;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author:xlc
 * @date:2019/9/4
 * @descirbe:
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            //必须在init之前配置
            ARouter.openLog();
            //打开调试模式，线上版本需要关闭，否则有安全问题
            ARouter.openDebug();
        }

        ARouter.init(MainApplication.this);
    }
}
