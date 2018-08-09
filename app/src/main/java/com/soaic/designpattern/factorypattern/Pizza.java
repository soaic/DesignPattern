package com.soaic.designpattern.factorypattern;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){

    }

    void cut(){

    }

    void bake(){

    }

    void box(){

    }

    public String getName(){
        return name;
    }
}

