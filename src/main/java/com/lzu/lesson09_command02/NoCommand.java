package com.lzu.lesson09_command02;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no do");
    }

    @Override
    public void undo() {
        System.out.println("no do");
    }
}
