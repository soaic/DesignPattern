package com.soaic.designpattern.singlepattern;

/**
 * 静态内部类 线程安全
 */
public class SinglePattern3 {

    private SinglePattern3(){}

    /**
     * SingleLoader 在当调用getInstance()方法时才会被装载
     * 只会在第一次加载类的时候初始化 JVM保证了线程安全，在类初始化，别的线程是无法进入
     */
    private static class SingleLoader {
        private final static SinglePattern3 singlePattern = new SinglePattern3();
    }

    public static SinglePattern3 getInstance(){
        return SingleLoader.singlePattern;
    }

}
