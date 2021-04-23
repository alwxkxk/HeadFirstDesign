package com.k.state;

public class NoQuarterState implements State{
    GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you insert a quarter.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("NoQuarterState not support...");
    }

    @Override
    public void turnCrank() {
        System.out.println("NoQuarterState not support...");
    }

    @Override
    public void dispense() {
        System.out.println("NoQuarterState not support...");
    }
}