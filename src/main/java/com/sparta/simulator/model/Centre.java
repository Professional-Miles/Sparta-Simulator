package com.sparta.simulator.model;

public abstract class Centre implements CentreOperations, TraineeOperation {
    public boolean isFull(int numberOfTrainees){
        return false;
    }
    public boolean lowCapacity(int numberOfTrainees){
        return false;
    }
}
