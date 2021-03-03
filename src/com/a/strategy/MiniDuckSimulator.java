package com.a.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        // 野鸭
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        // 模型鸭 更换成火箭式飞行
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
