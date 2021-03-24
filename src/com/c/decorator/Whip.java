package com.c.decorator;

public class Whip extends CondimentDecorator {
    // whip  搅伴器
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
