package com.sparta.simulator.model;

import java.util.Random;

public class TechCentre extends Centre {
    private String centreType;
    private int capacity;
    private boolean centreFull;
    private String courseType;
    final String[] courseTypes = {"java", "cSharp", "data", "devops", "business"};
    private final int maxCapacity = 200;
    private int openTime;

    public TechCentre() {
        this.capacity = 200;
        this.centreFull = false;
        this.centreType = "TechCentre";
        Random random = new Random();
        this.courseType = courseTypes[random.nextInt(courseTypes.length)];
        this.openTime = 0;
    }

    public String getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "[ Centre type = " + centreType + '\'' +
                ", Capacity = " + capacity +
                ", Course type = " + courseType + " ]";
    }
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
    public int getOpenTime() {
        return this.openTime;
    }

    @Override
    public void incrementOpenTime() {
        this.openTime++;
    }
}
