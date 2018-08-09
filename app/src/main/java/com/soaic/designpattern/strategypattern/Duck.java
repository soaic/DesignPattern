package com.soaic.designpattern.strategypattern;

public class Duck {
    FlyBehavior  flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks  oat, even decoys!");
    }

    public void display(){

    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
