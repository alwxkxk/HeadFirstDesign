package com.k.state;

public interface State {
    public void insertQuarter();// quarter 四分之一，25美分
    public void ejectQuarter();
    public void turnCrank();// crank 曲柄
    public void dispense();// dispense 免除
}
