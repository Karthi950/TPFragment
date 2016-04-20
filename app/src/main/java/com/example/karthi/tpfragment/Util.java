package com.example.karthi.tpfragment;

/**
 * Created by Karthi on 30/03/2016.
 */
public class Util {

    public static  String getMethodName () {

        return  Thread.currentThread().getStackTrace();

    }
}
