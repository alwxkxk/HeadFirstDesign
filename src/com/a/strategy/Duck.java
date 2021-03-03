package com.a.strategy;

public abstract class Duck {
    // 第一章 策略模式 的例子：定义不同的算法，分别封装，让它们可以相互替换，让算法的变化独立于使用算法的客户。
    // 能跑的例子是 MiniDuckSimulator.java

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        // 委托(delegate) ，使用别人实现的行为 来代替自己的行为。
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();// quack 鸭叫
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void swim(){
        System.out.println("all duck can swim.");
    }

    public void display(){
        System.out.println("duck");
    }
}
