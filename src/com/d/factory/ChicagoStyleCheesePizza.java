package com.d.factory;

public class ChicagoStyleCheesePizza extends Pizza {
    public  ChicagoStyleCheesePizza(){
        name = "Chicago Style Pizza";
        dough = "Chicago Dough";
        sauce = "Chicago Sauce";

        toppings.add("Chicago Cheese");
    }

    public void cut(){
        System.out.println("Chicago cut.");
    }
}
