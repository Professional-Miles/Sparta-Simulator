package com.sparta.simulator.model;

import java.util.List;

public class BootcampCentre extends Centre{
    final int capacity;
    int monthCount;

    public BootcampCentre(){
        this.capacity = 500;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
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
