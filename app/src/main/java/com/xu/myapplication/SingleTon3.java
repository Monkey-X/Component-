package com.xu.myapplication;

/**
 * @author:xlc
 * @date:2019/9/16
 * @descirbe: 静态内部类
 */
public class SingleTon3 {

    private SingleTon3(){}


    public static class LazyHolder{
        private static final SingleTon3 SINGLE_TON_3 = new SingleTon3();
    }

    public static SingleTon3 getInstance(){
        return LazyHolder.SINGLE_TON_3;
    }
}
