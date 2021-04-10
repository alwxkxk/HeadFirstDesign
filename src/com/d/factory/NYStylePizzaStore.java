package com.d.factory;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else{
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
