package com.xu.myapplication;

/**
 * @author:xlc
 * @date:2019/9/16
 * @descirbe: 懒汉式
 */
public class SingleTon1 {


    private SingleTon1(){}


    private static SingleTon1 sSingleTon1 = null;
    public static SingleTon1 getInstance(){
        if (sSingleTon1 ==null) {
            sSingleTon1 = new SingleTon1();
        }
        return sSingleTon1;
    }
}
