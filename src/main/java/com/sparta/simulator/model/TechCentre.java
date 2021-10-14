package com.sparta.simulator.model;

import java.util.List;

public class TechCentre extends Centre{
    private String centreType = "TechCentre";
    private int capacity;

    public TechCentre(){
        this.capacity = 200;
    }

    public String getCentreType() {
        return centreType;
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
