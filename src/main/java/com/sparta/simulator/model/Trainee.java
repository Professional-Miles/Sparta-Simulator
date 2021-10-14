package com.sparta.simulator.model;

import java.util.List;

public class Trainee implements TraineeOperation{
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
