package com.lzu.lesson09_command02;

public class RemoteControl {
    private Command[] commandsOn;

    private Command[] commandsOff;

    private Command pre;

    public RemoteControl() {
        Command noCommand = new NoCommand();
        commandsOn = new Command[7];
        commandsOff = new Command[7];
        for (int i = 0; i < commandsOn.length; i++) {
            commandsOn[i] = noCommand;
            commandsOff[i] = noCommand;
        }
        pre = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        commandsOn[slot] = onCommand;
        commandsOff[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        // 执行空命令对象
        commandsOn[slot].execute();
        pre = commandsOn[slot];
    }

    public void offButtonWasPressed(int slot) {
        commandsOff[slot].execute();
        pre = commandsOff[slot];
    }

    public void undoButtonWasPresses() {
        pre.undo();
    }

}
