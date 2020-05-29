package com.ym.P_04_abstractFactory.abstractFactory02_ext.factory;

import com.ym.P_04_abstractFactory.abstractFactory01.service.CPUApi;
import com.ym.P_04_abstractFactory.abstractFactory01.service.MainBoardApi;
import com.ym.P_04_abstractFactory.abstractFactory02_ext.service.impl.GiJiaMainBoard;
import com.ym.P_04_abstractFactory.abstractFactory02_ext.service.impl.IntelCPU;
import com.ym.P_04_abstractFactory.abstractFactory02_ext.service.impl.SamMemory;


public class ConcreteFactory01 implements AbstractFactory {

    @Override
    public Object createProduct(int type) {
        Object object = null;

        if (type == 1) {
            object = new IntelCPU(123);
        } else if (type == 2) {
            object = new GiJiaMainBoard(456);
        } else if (type == 3) {
            object = new SamMemory(64);
        }
        return object;
    }
}
