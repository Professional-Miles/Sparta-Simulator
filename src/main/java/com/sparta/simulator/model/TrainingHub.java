package com.sparta.simulator.model;

public class TrainingHub extends Centre {

    private String centreType;
    private int capacity;
    private boolean centreFull;
    private final int maxCapacity = 100;
    private int openTime;

    public TrainingHub() {
        this.capacity = 100;
        this.centreFull = false;
        this.centreType = "TrainingHub";
        this.openTime = 0;
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
}
