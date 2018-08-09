package com.soaic.designpattern.factorypattern;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
