package com.ym.P_03_adapter;

import com.ym.P_03_adapter.entity.LogModel;

import java.util.List;

public interface LogDbOperateApi {

    void createLog(LogModel logModel);

    void updateLog(LogModel logModel);

    void removeLog(LogModel logModel);

    List<LogModel> getAllLog();

}
