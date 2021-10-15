package com.sparta.simulator.model;

public class TrainingHub extends Centre {

    private String centreType;
    private int capacity;
    private boolean centreFull;

    public TrainingHub() {
        this.capacity = 100;
        this.centreFull = false;
        this.centreType = "TrainingHub";
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
