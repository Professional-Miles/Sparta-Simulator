package com.sparta.simulator.model;

public interface CentreOperations {
    int getCapacity();

    void setCentreFull();

    boolean getCentreFull();

    String getCentreType();

    public boolean isFull();

    public boolean lowAttendance();

    void decrementCapacity();

    void incrementCapacity();

    String getCourseType();

    int getOpenTime();

    void incrementOpenTime();


}
