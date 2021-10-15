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
        this.centreType = "BootCamp";
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
    public boolean lowCapacity() {
        return this.capacity < 25;

    }

    @Override
    public void decrementCapacity() {
        capacity = capacity - 1;
    }

    @Override
    public void incrementCapacity() {
        capacity = capacity + 1;
    }
}
