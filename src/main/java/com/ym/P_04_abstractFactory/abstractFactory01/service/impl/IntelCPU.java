package com.ym.P_04_abstractFactory.abstractFactory01.service.impl;

import com.ym.P_04_abstractFactory.abstractFactory01.service.CPUApi;

public class IntelCPU implements CPUApi {

    // CPU的脚针数目。
    private int pins = 0;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("IntelCPU, pins num is " + pins);
    }
}
