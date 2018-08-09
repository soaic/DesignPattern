package com.soaic.designpattern.singlepattern;

/**
 * 懒汉式
 */
public class SinglePattern2 {
    private static SinglePattern2 singlePattern;

    private SinglePattern2(){}

    /**
     * 线程不安全
     * @return
     */
    public static SinglePattern2 getInstance(){
        if(singlePattern == null){
            singlePattern = new SinglePattern2();
        }
        return singlePattern;
    }

    /**
     * 线程安全
     * 其实只有第一次才需要真正同步，一旦singlePattern赋值后，就不需要同步了，之后每次调用这个方法都是一个累赘
     * @return
     */
    public static synchronized SinglePattern2 getInstance1(){
        if(singlePattern == null){
            singlePattern = new SinglePattern2();
        }
        return singlePattern;
    }

    /**
     * 线程安全 解决第一次才需要线程同步，之后都不用同步了
     * @return
     */
    public static SinglePattern2 getInstance2(){
        if(singlePattern == null){
            synchronized (SinglePattern2.class) {
                if(singlePattern == null) {
                    singlePattern = new SinglePattern2();
                }
            }
        }
        return singlePattern;
    }
}
