package com.xu.myapplication;

/**
 * @author:xlc
 * @date:2019/9/16
 * @descirbe:双重检测机制
 */
public class SingleTon2 {


    private SingleTon2() {
    }

    private static SingleTon2 sSingleTon2 = null;

//    private static volatile  SingleTon2 sSingleTon2 = null;

    private static SingleTon2 getInstance() {
        if (sSingleTon2 == null) {
            synchronized (SingleTon2.class) {
                if (sSingleTon2 == null) {
                    sSingleTon2 = new SingleTon2();
                }
            }
            ;
        }

        return sSingleTon2;
    }
}
