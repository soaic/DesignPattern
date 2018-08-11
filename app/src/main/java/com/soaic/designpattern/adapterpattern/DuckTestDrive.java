package com.soaic.designpattern.adapterpattern;

public class DuckTestDrive {
    public static void main(String[] args){
        Duck adapterDuck = new TurkeyAdapter(new WildTurkey());

        adapterDuck.fly();
        adapterDuck.quack();
    }
}
