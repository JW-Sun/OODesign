package com.lzu.lesson01_simulator;

public class Child implements Runnable {

    private boolean isWake;

    private Person parent;
    private Person grandParent;


    public Child(Person parent, Person grandParent) {
        this.parent = parent;
        this.grandParent = grandParent;
    }

    public void run() {
        try {
            System.out.println("睡5秒");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wakeUp();
    }

    public boolean isWake() {
        return isWake;
    }

    public void setWake(boolean wake) {
        isWake = wake;
    }

    public void wakeUp() {
//        isWake = true;
//        parent.feed();

        //唤醒小孩
        parent.actionToWakenUpEvent(new WakenUpEvent(System.currentTimeMillis(), "bed", this));

        //祖父开电视
        grandParent.actionToWakenUpEvent(new WakenUpEvent(System.currentTimeMillis(), "bed", this));
    }


}
