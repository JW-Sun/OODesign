package com.lzu.lesson09_command;
/*开灯的命令*/
public class LightOnCommand implements Command {

    Light light = null;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
