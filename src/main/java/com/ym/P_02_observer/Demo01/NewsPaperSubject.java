package com.ym.P_02_observer.Demo01;

public class NewsPaperSubject extends Subject {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }
}
