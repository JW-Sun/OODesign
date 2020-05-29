package com.ym.P_04_abstractFactory.abstractFactory02_ext.service.impl;

import com.ym.P_04_abstractFactory.abstractFactory02_ext.service.MainBoardApi;

public class MsiMainBoard implements MainBoardApi {

    private int cpuHoles = 0;

    public MsiMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("MsiMainBoard cpuHoles = " + cpuHoles);
    }
}
