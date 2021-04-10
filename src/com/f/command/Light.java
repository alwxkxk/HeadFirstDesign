package com.f.command;

public class Light {
    String positionName;
    public Light(String positionName){
        this.positionName = positionName;
    }
    public void on(){
        System.out.println(positionName+" light on");
    }
    public void off(){
        System.out.println(positionName+" light off");
    }
}
