package com.ym.P_04_abstractFactory.pre_simpleFactory.service.impl;

import com.ym.P_04_abstractFactory.pre_simpleFactory.service.MainBoardApi;

public class GiJiaMainBoard implements MainBoardApi {

    // CPU插槽的孔数
    private int cpuHoles = 0;

    public GiJiaMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("GiJiaMainBoard cpuHoles = " + cpuHoles);
    }
}
