package com.sparta.simulator.model;

import java.util.Arrays;
import java.util.Random;

public class TechCentre extends Centre {
    private String centreType;
    private int capacity;
    private boolean centreFull;
    private String courseType;
    final String[] courseTypes = {"java", "cSharp", "data", "devops", "business"};

    public TechCentre() {
        this.capacity = 200;
        this.centreFull = false;
        this.centreType = "TechCentre";
        Random random = new Random();
        this.courseType = courseTypes[random.nextInt(courseTypes.length)];
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
    public boolean lowCapacity() {
        return this.capacity < 25;

    }

    @Override
    public void decrementCapacity() {
        capacity = capacity - 1;
    }

    @Override
    public void incrementCapacity() {
        capacity = capacity + 1;
    }
}
