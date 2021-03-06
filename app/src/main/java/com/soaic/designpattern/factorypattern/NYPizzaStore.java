package com.soaic.designpattern.factorypattern;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        return pizza;
    }
}
