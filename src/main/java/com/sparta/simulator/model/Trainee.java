package com.sparta.simulator.model;



public class Trainee implements TraineeOperations {

    private int id;
    private String courseType;
    private int trainingTime;
    private boolean isWaiting;
    private boolean isTraining;
    private boolean isBenched;
    private boolean isWorking;

    public Trainee(int id, String courseType){
        this.id = id;
        this.courseType = courseType;
        this.trainingTime = 1;
        this.isWaiting = true;
        this.isTraining = false;
        this.isBenched = false;
        this.isWorking = false;
    }


    @Override
    public boolean isTraining() {
        return isTraining;
    }

    @Override
    public boolean isWaiting() {
        return isWaiting;
    }

    @Override
    public boolean isBenched() {
        return isBenched;
    }

    @Override
    public boolean isWorking() {
        return isWorking;
    }

    @Override
    public void setTraining() {
        this.isWaiting = false;
        this.isTraining = true;
    }

    @Override
    public void setWaiting() {
        this.isTraining = false;
        this.isWaiting = true;
    }

    @Override
    public void setBenched() {
        this.isTraining = false;
        this.isBenched = true;
    }

    @Override
    public void setWorking() {
        this.isWorking = true;
        this.isBenched = false;
    }

    @Override
    public String getCourseType() {
        return courseType;
    }

    @Override
    public int getTrainingTime() {
        return trainingTime;
    }

    @Override
    public void incrementTrainingTime() {
        trainingTime = trainingTime +1;
    }

    @Override
    public int getId() {
        return id;
    }
}