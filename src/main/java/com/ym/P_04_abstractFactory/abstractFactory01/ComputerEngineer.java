package com.ym.P_04_abstractFactory.abstractFactory01;

import com.ym.P_04_abstractFactory.abstractFactory01.factory.AbstractFactory;
import com.ym.P_04_abstractFactory.abstractFactory01.service.CPUApi;
import com.ym.P_04_abstractFactory.abstractFactory01.service.MainBoardApi;

public class ComputerEngineer {

    // 组装所需CPU
    private CPUApi cpuApi = null;

    // 组装所需主板
    private MainBoardApi mainBoardApi = null;

    // 装机方案
    public void makeComputer(AbstractFactory abstractFactory) {
        // 准备装机具体配件
        prepareHandler(abstractFactory);

        System.out.println("=====后序操作=====");
    }

    private void prepareHandler(AbstractFactory abstractFactory) {
        // 准备具体的CPU和主板的配件选择，装机工程师是不知道具体的选择的。

        // 使用抽象工厂获取相应的接口对象
        cpuApi = abstractFactory.createCpuApi();
        mainBoardApi = abstractFactory.createMainBoardApi();

        // cpu和主板的操作。
        cpuApi.calculate();
        mainBoardApi.installCPU();
    }

}
