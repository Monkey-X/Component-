package com.xu.myapplication;

/**
 * @author:xlc
 * @date:2019/9/16
 * @descirbe:饿汉式
 */
public class SingleTon {

    private SingleTon(){}


    private static SingleTon sSingleTon = new SingleTon();


    public static SingleTon getInstance(){
        return getInstance();
    }
}
