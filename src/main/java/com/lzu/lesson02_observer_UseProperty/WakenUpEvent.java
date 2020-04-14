package com.lzu.lesson02_observer_UseProperty;


public class WakenUpEvent {

    private long time;
    private String loc;
    private Child source;

    public WakenUpEvent(long time, String loc, Child source) {
        this.time = time;
        this.loc = loc;
        this.source = source;
    }


}
