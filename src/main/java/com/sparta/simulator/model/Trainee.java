package com.sparta.simulator.model;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return courseType == trainee.courseType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseType);
    }
}
