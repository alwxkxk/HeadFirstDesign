package com.i.template;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){// recipe食谱
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();// condiments佐料
        }
    }

    abstract void brew();
    abstract  void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){ // 可由子类覆盖，使其改变要不要添加佐料。
        return true;
    }
}
