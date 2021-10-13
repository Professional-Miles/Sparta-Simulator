package com.sparta.simulator.model;

public class Trainee {
    enum CourseType {
        JAVA, CSHARP, DEVOPS, BUSINESS
    }
    CourseType courseType;
    int id;

    public Trainee(CourseType courseType, int id) {
        this.courseType = courseType;
        this.id = id;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
