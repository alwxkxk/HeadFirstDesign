package com.d.factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;// 生面团
    String sauce;//酱油


    ArrayList toppings = new ArrayList(); // 佐料
    public void prepare(){
        System.out.println("prepare");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("add topping:"+toppings.get(i));
        }
    };
    public void bake(){
        System.out.println("bake");
    };
    public void cut(){
        System.out.println("cut");
    };
    public void box(){
        System.out.println("box");
    };
}
