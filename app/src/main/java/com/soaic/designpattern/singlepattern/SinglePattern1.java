package com.soaic.designpattern.singlepattern;

/**
 * 饿汉式 线程安全 有可能浪费资源
 */
public class SinglePattern1 {
    private static SinglePattern1 singlePattern = new SinglePattern1();

    private SinglePattern1(){}

    public static SinglePattern1 getInstance(){
        return singlePattern;
    }
}
