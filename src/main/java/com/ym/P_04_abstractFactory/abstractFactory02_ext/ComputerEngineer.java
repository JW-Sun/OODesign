package com.ym.P_04_abstractFactory.abstractFactory02_ext;

import com.ym.P_04_abstractFactory.abstractFactory02_ext.factory.AbstractFactory;
import com.ym.P_04_abstractFactory.abstractFactory02_ext.service.CPUApi;
import com.ym.P_04_abstractFactory.abstractFactory02_ext.service.MainBoardApi;
import com.ym.P_04_abstractFactory.abstractFactory02_ext.service.MemoryApi;

public class ComputerEngineer {

    // 组装所需CPU
    private CPUApi cpuApi = null;
    // 组装所需主板
    private MainBoardApi mainBoardApi = null;
    // 组装所需内存
    private MemoryApi memoryApi = null;

    // 装机方案
    public void makeComputer(AbstractFactory abstractFactory) {
        // 准备装机具体配件
        prepareHandler(abstractFactory);

        System.out.println("=====后序操作=====");
    }

    private void prepareHandler(AbstractFactory abstractFactory) {
        // 准备具体的CPU和主板的配件选择，装机工程师是不知道具体的选择的。

        // 使用抽象工厂获取相应的接口对象
        cpuApi = (CPUApi) abstractFactory.createProduct(1);
        mainBoardApi = (MainBoardApi) abstractFactory.createProduct(2);
        memoryApi = (MemoryApi) abstractFactory.createProduct(3);

        // cpu和主板的操作。
        cpuApi.calculate();
        mainBoardApi.installCPU();
        if (memoryApi != null) {
            memoryApi.cacheData();
        }
    }

}
