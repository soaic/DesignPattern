package com.soaic.designpattern.factorypattern;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String createDough() {
        return "dough";
    }


}
