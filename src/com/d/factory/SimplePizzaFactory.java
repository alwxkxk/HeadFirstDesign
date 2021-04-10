package com.d.factory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        // 简单工厂
        Pizza pizza = null;
        if(type.equals("cheese")){
//            pizza = new CheesePizza();
        }else{
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
