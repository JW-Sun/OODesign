package com.dahua.pattern23_command.shaokao;

public abstract class Command {

    public Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    abstract public void ExecuteCommand();
}
