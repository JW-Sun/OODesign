package com.lzu.lesson09_command;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lighton = new LightOnCommand(light);

        remote.setCommand(lighton);
        remote.button();
    }
}
