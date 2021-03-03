package com.a.strategy;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("fly with rocket.");
    }
}
