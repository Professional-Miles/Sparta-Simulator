package com.sparta.simulator.model;


public class BootCamp extends Centre {

    private String centreType;
    int capacity;
    int monthCount;
    private boolean centreFull;

    public BootCamp() {
        this.capacity = 500;
        this.monthCount = 3;
        this.centreFull = false;
        this.centreType = "Bootcamp";
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void decrementMonthCount() {
        this.monthCount = monthCount - 1;
    }


}
