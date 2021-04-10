package com.f.command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("livingRoom");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Light kitchenRoomLight = new Light("kitchenRoom");
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);

        remoteControl.setCommand(1,livingRoomLightOn,livingRoomLightOff);

        Command[] partyOn = {livingRoomLightOn,kitchenRoomLightOn};
        Command[] partyOff = {livingRoomLightOff,kitchenRoomLightOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(0,partyOnMacro,partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        System.out.println("/n ---------- party on --------- /n");
        remoteControl.onButtonWasPushed(0);
        System.out.println("/n ---------- party off --------- /n");
        remoteControl.offButtonWasPushed(0);
    }
}
