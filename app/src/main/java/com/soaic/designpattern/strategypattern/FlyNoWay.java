package com.soaic.designpattern.strategypattern;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I’m can't fly!!");
    }
}
