package com.sparta.simulator.model;

public interface TraineeOperation {
     List<Trainee> getTrainees();
     void setTrainess(List<Trainee>);
     void addTrainees(Trainee trainee, List<Trainee> trainees);
}
