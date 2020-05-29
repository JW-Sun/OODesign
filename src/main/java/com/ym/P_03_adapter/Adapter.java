package com.ym.P_03_adapter;

import com.ym.P_03_adapter.entity.LogModel;

import java.util.List;

public class Adapter implements LogDbOperateApi {

    // 持有需要被适配的接口对象
    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel logModel) {
        List<LogModel> logModels = adaptee.readLogFile();
        logModels.add(logModel);
        adaptee.writeLogFile(logModels);
    }

    @Override
    public void updateLog(LogModel logModel) {
        List<LogModel> logModels = adaptee.readLogFile();
        for (int i = 0; i < logModels.size(); i++) {
            if (logModels.get(i).getLogId().equals(logModel.getLogId())) {
                logModels.set(i, logModel);
                break;
            }
        }
        adaptee.writeLogFile(logModels);
    }

    @Override
    public void removeLog(LogModel logModel) {
        List<LogModel> logModels = adaptee.readLogFile();
        logModels.remove(logModel);
        adaptee.writeLogFile(logModels);
    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
