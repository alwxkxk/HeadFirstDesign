package com.d.factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "NY Dough";
    }

    @Override
    public String createSauce() {
        return "NY Sauce";
    }
}
