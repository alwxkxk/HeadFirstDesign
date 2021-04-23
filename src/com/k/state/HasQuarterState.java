package com.k.state;

public class HasQuarterState implements State{
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(" HasQuarterState not support...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter return.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turn.");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("HasQuarterState not support...");
    }
}

