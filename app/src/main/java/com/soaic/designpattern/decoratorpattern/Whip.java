package com.soaic.designpattern.decoratorpattern;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 1.30 + beverage.cost();
    }
}
