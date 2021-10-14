package com.sparta.simulator.model;

import java.util.List;

public class TrainingCentre extends Centre{
    private final int capacity;

    public TrainingCentre() {
        this.capacity = 100;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int intGetCentreCapacity() {
        return 0;
    }

    @Override
    public void setCentreFull(boolean centreFull) {

    }

    @Override
    public void addCentreCount(int centreCount) {

    }

    @Override
    public int getCentreCount() {
        return 0;
    }

    @Override
    public boolean isCentreCountFull() {
        return false;
    }

    @Override
    public List<Trainee> getTrainees() {
        return null;
    }

    @Override
    public void setTrainees(List<Trainee> trainees) {

    }

    @Override
    public void addTrainees(Trainee trainee, List<Trainee> trainees) {

    }
}
