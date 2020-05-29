package com.ym.P_04_abstractFactory.pre_simpleFactory.factory;

import com.ym.P_04_abstractFactory.pre_simpleFactory.service.CPUApi;
import com.ym.P_04_abstractFactory.pre_simpleFactory.service.impl.AmdCPU;
import com.ym.P_04_abstractFactory.pre_simpleFactory.service.impl.IntelCPU;

public class CPUFactory {

    public static CPUApi createCpuApi(int type) {
        CPUApi res = null;
        if (type == 1) {
            res = new IntelCPU(1111);
        } else if (type == 2) {
            res = new AmdCPU(2222);
        }
        return res;
    }

}
