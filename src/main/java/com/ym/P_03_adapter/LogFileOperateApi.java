package com.ym.P_03_adapter;

import com.ym.P_03_adapter.entity.LogModel;

import java.util.List;

public interface LogFileOperateApi {

    List<LogModel> readLogFile();

    void writeLogFile(List<LogModel> list);

}
