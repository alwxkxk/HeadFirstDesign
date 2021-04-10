package com.h.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();// 创建火鸡
        Duck turkeyAdapter = new TurkeyAdapter(turkey);// 使用适配器将火鸡适配成鸭

        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        System.out.println("\n ------ this is a duck ----------\n");
        duck.quack();
        duck.fly();
    }
}
