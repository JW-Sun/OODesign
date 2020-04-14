package com.lzu.lesson03_AWTObserver;

import java.awt.*;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyActionListenerButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed");
    }
}

public class TestFrame extends Frame {

    public void launch() {
        Button b = new Button();

        //TODO 添加监听器
        b.addActionListener(new MyActionListenerButton());

        this.add(b);
        this.pack();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }


        });
    }

    public static void main(String[] args) {
        TestFrame testFrame = new TestFrame();
        testFrame.launch();
    }
}
