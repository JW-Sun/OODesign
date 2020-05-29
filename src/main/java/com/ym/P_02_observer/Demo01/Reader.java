package com.ym.P_02_observer.Demo01;

public class Reader implements Observer {

    private String name;

    @Override
    public void update(Subject subject) {
        // 拉消息
        System.out.println(name + " 收到报纸，内容是 " + ((NewsPaperSubject)subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
