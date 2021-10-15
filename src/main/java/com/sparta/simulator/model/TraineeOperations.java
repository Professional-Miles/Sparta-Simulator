package com.sparta.simulator.model;

public interface TraineeOperations {

    boolean isWaiting();

    boolean isTraining();

    boolean isBenched();

    boolean isWorking();

    void setWaiting();

    void setTraining();

    void setBenched();

    void setWorking();

    String getCourseType();

    int getTrainingTime();

    void incrementTrainingTime();

    int getId();

}