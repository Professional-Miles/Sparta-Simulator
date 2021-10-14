package com.sparta.simulator.model;

public abstract class Centre implements CentreOperations, TraineeOperation {
        public boolean isFull () {
            return false;
        }
        public boolean lowCapacity ( int numOfTrainees){
            return false;
        }

}