package com.dahua.pattern23_command.shaokao;

import com.dahua.pattern23_command.shaokao.Barbecuer;
import com.dahua.pattern23_command.shaokao.ChickenWingCommand;
import com.dahua.pattern23_command.shaokao.MuttonCommand;
import com.dahua.pattern23_command.shaokao.Waiter;

public class Main {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        MuttonCommand muttonCommand = new MuttonCommand(barbecuer);
        ChickenWingCommand chickenWingCommand = new ChickenWingCommand(barbecuer);
        Waiter waiter = new Waiter();

        waiter.setOrder(muttonCommand);
        waiter.setOrder(chickenWingCommand);
        waiter.barNotify();
    }
}
