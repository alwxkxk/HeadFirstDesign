package com.d.factory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        // 使用 抽象工厂模式 创建相关对象
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
