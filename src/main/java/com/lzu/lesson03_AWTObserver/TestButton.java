package com.lzu.lesson03_AWTObserver;

import java.util.ArrayList;
import java.util.List;

class ActionEvent {
    private long when;
    private Object source;

    public ActionEvent(long when, Object source) {
        this.when = when;
        this.source = source;
    }

    public long getWhen() {
        return when;
    }

    public void setWhen(long when) {
        this.when = when;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}

interface ActionListener {
    void actionPerformed(ActionEvent e);
}

class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button");
    }
}

class Button {
    private List<ActionListener> actionListeners = new ArrayList<>();

    public void buttonPressed() {
        ActionEvent e = new ActionEvent(System.currentTimeMillis(), this);
        for (int i = 0; i < actionListeners.size(); i++) {
            ActionListener actionListener = actionListeners.get(i);
            actionListener.actionPerformed(e);
        }
    }

    public void addActionListener(ActionListener actionListener) {
        actionListeners.add(actionListener);
    }
}

public class TestButton {
    public static void main(String[] args) {
        Button b = new Button();
        b.addActionListener(new MyActionListener());
        b.buttonPressed();
    }
}
