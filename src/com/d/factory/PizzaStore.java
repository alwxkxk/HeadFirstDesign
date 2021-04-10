package com.d.factory;

public abstract class PizzaStore {
//    public class PizzaStore {
//    SimplePizzaFactory factory;// 简单工厂的例子
//
//    public PizzaStore(SimplePizzaFactory factory){
//        this.factory = factory;
//    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        // 将创建pizza 具体对象的过程，抽到简单工厂对象中。
        //pizza = factory.createPizza(type);

        pizza = createPizza(type);// 使用将会由子类实现的接口

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);// 工厂模式所对应的接口
}
