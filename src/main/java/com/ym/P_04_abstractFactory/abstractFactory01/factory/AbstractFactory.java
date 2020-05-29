package com.ym.P_04_abstractFactory.abstractFactory01.factory;

import com.ym.P_04_abstractFactory.abstractFactory01.service.CPUApi;
import com.ym.P_04_abstractFactory.abstractFactory01.service.MainBoardApi;

public interface AbstractFactory {

    /***
     * 创建CPU对象
     * @return CPU对象
     */
    CPUApi createCpuApi();

    /***
     * 创建主板的对象
     * @return 主板对象
     */
    MainBoardApi createMainBoardApi();

}
