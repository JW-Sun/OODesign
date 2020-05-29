package com.ym.P_04_abstractFactory.abstractFactory01.factory;

import com.ym.P_04_abstractFactory.abstractFactory01.service.CPUApi;
import com.ym.P_04_abstractFactory.abstractFactory01.service.MainBoardApi;
import com.ym.P_04_abstractFactory.abstractFactory01.service.impl.GiJiaMainBoard;
import com.ym.P_04_abstractFactory.abstractFactory01.service.impl.IntelCPU;

public class ConcreteFactory01 implements AbstractFactory {
    @Override
    public CPUApi createCpuApi() {
        return new IntelCPU(123);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new GiJiaMainBoard(456);
    }
}
