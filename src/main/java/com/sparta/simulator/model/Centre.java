package com.sparta.simulator.model;

public class Centre implements CentreOperations {

    private String centreType;
    private boolean centreFull;
    private int capacity;
    private int maxCapacity;
    private String courseType;
    private int openTime;
    private int monthCount;

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCentreFull() {
        centreFull = true;
    }

    @Override
    public boolean getCentreFull() {
        return centreFull;
    }

    public String getCentreType() {
        return centreType;
    }

    public boolean isFull() {
        return this.capacity == 0;
    }

    @Override
    public boolean lowAttendance() {
        return maxCapacity - 25 < this.capacity;
    }

    @Override
    public void decrementCapacity() {
        capacity = capacity - 1;
    }

    @Override
    public void incrementCapacity() {
        capacity = capacity + 1;
    }

    @Override
    public String getCourseType() {
        return this.courseType;
    }

    @Override
    public int getOpenTime() {
        return this.openTime;
    }

    @Override
    public void incrementOpenTime() {
        this.openTime++;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void incrementLAMonth(){
        this.monthCount++;
    }

    public void decrementLAMonth(){
        this.monthCount--;
    }


}
