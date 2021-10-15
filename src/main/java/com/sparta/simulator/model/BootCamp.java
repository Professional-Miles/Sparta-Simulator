package com.sparta.simulator.model;


public class BootCamp extends Centre {

    private String centreType;
    int capacity;
    int monthCount;
    private boolean centreFull;
    private final int maxCapacity = 500;
    private int openTime;

    public BootCamp() {
        this.capacity = 500;
        this.monthCount = 3;
        this.centreFull = false;
        this.centreType = "BootCamp";
        this.openTime = 0;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void decrementMonthCount() {
        this.monthCount = monthCount - 1;
    }

    @Override
    public String toString() {
        return "[ Centre type = " + centreType + '\'' +
                ", Capacity = " + capacity + " ]";
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCentreFull() {
        centreFull = true;
    }

    @Override
    public boolean getCentreFull() {
        return centreFull;
    }

    public String getCentreType() {
        return centreType;
    }

    public boolean isFull() {
        return this.capacity == 0;
    }

    @Override
    public boolean lowAttendance() {
        return maxCapacity - 25 < this.capacity;
    }

    @Override
    public void decrementCapacity() {
        capacity = capacity - 1;
    }

    @Override
    public void incrementCapacity() {
        capacity = capacity + 1;
    }

    @Override
    public int getOpenTime() {
        return this.openTime;
    }

    @Override
    public void incrementOpenTime() {
        this.openTime++;
    }

    public void incrementLAMonth(){
        this.monthCount++;
    }

    public void decrementLAMonth(){
        this.monthCount--;
    }
}
