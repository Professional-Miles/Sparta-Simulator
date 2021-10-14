package com.sparta.simulator.model;

public interface CentreOperations {
    int intGetCentreCapacity();
    void setCentreFull(boolean centreFull);
    void addCentreCount(int centreCount);
    int getCentreCount();
    boolean isCentreCountFull();
}
