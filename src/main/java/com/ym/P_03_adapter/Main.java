package com.ym.P_03_adapter;

import com.ym.P_03_adapter.entity.LogModel;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        LogModel logModel = new LogModel();

        /*=====*/
        // 需要适配的方法与接口
        LogFileOperateApi api = new LogFileOperate();

        LogDbOperateApi dbOperateApi = new Adapter(api);

        // 可以通过适配器这种设计模式来进行加上一层适配器保留原有接口的功能的前提下
        // 新增功能成为新的接口。
        List<LogModel> allLog = dbOperateApi.getAllLog();
        /*=====*/
    }
}
