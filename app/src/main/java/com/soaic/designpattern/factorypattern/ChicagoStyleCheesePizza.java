package com.soaic.designpattern.factorypattern;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style DeepDish Cheese Pizza";
        dough = "Extra Think Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void prepare() {

    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
