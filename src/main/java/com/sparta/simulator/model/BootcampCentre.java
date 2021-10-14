package com.sparta.simulator.model;

import java.util.List;

public class BootcampCentre extends Centre{

    private final String centreType = "Bootcamp";
    int capacity;
    int monthCount;

    public BootcampCentre(){
        this.capacity = 500;
        this.monthCount = 3;
    }

    public String getCentreType() {
        return centreType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void decrementMonthCount() {
        this.monthCount = monthCount-1;
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
