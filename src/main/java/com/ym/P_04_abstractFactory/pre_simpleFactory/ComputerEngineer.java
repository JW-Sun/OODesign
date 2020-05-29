package com.ym.P_04_abstractFactory.pre_simpleFactory;

import com.ym.P_04_abstractFactory.pre_simpleFactory.factory.CPUFactory;
import com.ym.P_04_abstractFactory.pre_simpleFactory.factory.MainBoardFactory;
import com.ym.P_04_abstractFactory.pre_simpleFactory.service.CPUApi;
import com.ym.P_04_abstractFactory.pre_simpleFactory.service.MainBoardApi;

public class ComputerEngineer {

    private CPUApi cpu = null;
    private MainBoardApi mainBoard = null;

    public void makeComputer(int cpuType, int mainBoardType) {
        // 准备配件
        prepare(cpuType, mainBoardType);

        // 后序操作省略
        System.out.println("准备配件后序.......");
    }

    private void prepare(int cpuType, int mainBoardType) {

        cpu = CPUFactory.createCpuApi(cpuType);
        mainBoard = MainBoardFactory.createMainBoardApi(mainBoardType);

        cpu.calculate();
        mainBoard.installCPU();
    }

}
