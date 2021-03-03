package com.a.strategy;

public class MallardDuck extends Duck {
    // MallardDuck 野鸭

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck.");
    }
}
