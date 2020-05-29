package com.ym.P_04_abstractFactory.abstractFactory02_ext.service.impl;

import com.ym.P_04_abstractFactory.abstractFactory02_ext.service.MemoryApi;

public class SamMemory implements MemoryApi {

    private int num;

    public SamMemory(int num) {
        this.num = num;
    }

    @Override
    public void cacheData() {
        System.out.println("SumMemory 内存大小为 " + num);
    }
}
