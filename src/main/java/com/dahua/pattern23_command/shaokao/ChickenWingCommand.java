package com.dahua.pattern23_command.shaokao;

public class ChickenWingCommand extends Command {
    public ChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExecuteCommand() {
        receiver.bakeChickenWing();
    }
}
