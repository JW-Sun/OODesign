package com.ym.P_04_abstractFactory.abstractFactory02_ext.service.impl;

import com.ym.P_04_abstractFactory.abstractFactory02_ext.service.CPUApi;

public class AmdCPU implements CPUApi {

    private int pins = 0;

    public AmdCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD, pins num is " + pins);
    }
}
