package com.soaic.designpattern.strategypattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I’m  flying!!");
    }
}
