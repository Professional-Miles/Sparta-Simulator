package com.sparta.simulator.model;

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

}
