package com.ym.P_04_abstractFactory.abstractFactory02_ext.factory;

import com.ym.P_04_abstractFactory.abstractFactory01.service.CPUApi;
import com.ym.P_04_abstractFactory.abstractFactory01.service.MainBoardApi;

public interface AbstractFactory {

    /***
     * 一个通用的创建产品对象的方法，为所有创建的一系列抽象产品定义一个公共接口
     * 1: Cpu
     * 2: 主板
     * 3: 内存
     * @return 创建的产品对象。
     */
    Object createProduct(int type);

}
