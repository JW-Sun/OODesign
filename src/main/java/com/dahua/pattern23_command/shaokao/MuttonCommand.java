package com.dahua.pattern23_command.shaokao;

public class MuttonCommand extends Command {
    public MuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExecuteCommand() {
        receiver.bakeMutton();
    }
}
