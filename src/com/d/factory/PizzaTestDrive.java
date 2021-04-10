package com.d.factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        System.out.println("order NYStylePizza");
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("order ChicagoStylePizza");
        pizza = chicagoStore.orderPizza("cheese");
    }
}
