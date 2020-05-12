package com.lzu.lesson09_command02;

import java.rmi.Remote;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light room1Light = new Light("room1");
        LightOnCommand room1LightOn = new LightOnCommand(room1Light);
        LightOffCommand room1LightOff = new LightOffCommand(room1Light);

        Light room2Light = new Light("room2");
        LightOnCommand room2LightOn = new LightOnCommand(room2Light);
        LightOffCommand room2LightOff = new LightOffCommand(room2Light);

        remote.setCommand(0, room1LightOn, room1LightOff);
//        remote.setCommand(0, room2LightOn, room2LightOff);

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);

    }
}
