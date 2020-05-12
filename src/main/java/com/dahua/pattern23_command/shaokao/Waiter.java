package com.dahua.pattern23_command.shaokao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {

    private List<Command> orders = new ArrayList<>();

    // 设置订单
    public void setOrder(Command command) {
        orders.add(command);
        Long ts = System.currentTimeMillis();
        String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        System.out.println(" 增加订单： " + command.toString() + " 时间: " + format);
    }

    public void cancel(Command command) {
        orders.remove(command);
    }

    public void barNotify() {
        for (Command order : orders) {
            order.ExecuteCommand();
        }
    }

}
