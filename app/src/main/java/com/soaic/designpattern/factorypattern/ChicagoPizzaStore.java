package com.soaic.designpattern.factorypattern;

/**
 * 工厂方法 由子类决定要创建的具体类是哪一个
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
