package com.k.state;

public class SoldState implements State {
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("SoldState not support insertQuarter...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("SoldState not support ejectQuarter...");
    }

    @Override
    public void turnCrank() {
        System.out.println("SoldState not support turnCrank...");
    }

    @Override
    public void dispense() {
        System.out.println("SoldState not support dispense...");
    }
}
