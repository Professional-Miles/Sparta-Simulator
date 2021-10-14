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

}
