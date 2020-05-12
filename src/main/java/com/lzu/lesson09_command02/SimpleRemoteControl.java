package com.lzu.lesson09_command02;

public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void button() {
        slot.execute();
    }
}
