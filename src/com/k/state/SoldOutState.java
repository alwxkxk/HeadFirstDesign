package com.k.state;

public class SoldOutState implements State{
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("SoldOutState not support...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("SoldOutState not support...");
    }

    @Override
    public void turnCrank() {
        System.out.println("SoldOutState not support...");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
}
