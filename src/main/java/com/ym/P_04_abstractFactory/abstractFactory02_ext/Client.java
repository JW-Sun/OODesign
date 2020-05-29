package com.ym.P_04_abstractFactory.abstractFactory02_ext;


import com.ym.P_04_abstractFactory.abstractFactory02_ext.factory.AbstractFactory;
import com.ym.P_04_abstractFactory.abstractFactory02_ext.factory.ConcreteFactory01;

public class Client {
    public static void main(String[] args) {
        // 创建装机工程师对象
        ComputerEngineer computerEngineer = new ComputerEngineer();

        // 模拟客户创建需要的装机方案
        AbstractFactory schema1 = new ConcreteFactory01();

        // 告诉装机工程师选择的装机方案
        System.out.println("方案一");
        computerEngineer.makeComputer(schema1);

    }
}
