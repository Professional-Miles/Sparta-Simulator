package com.sparta.simulator.model;

public abstract class Centre implements CentreOperations, TraineeOperation {
    public String centreType;

    public boolean isFull() {
        return false;
    }
    public boolean lowCapacity(int numOfTrainees) {
        return false;
    }

    public String getCentreType() {
        return centreType;
    }

    public void setCentreType(String centreType) {
        this.centreType = centreType;
    }
}
