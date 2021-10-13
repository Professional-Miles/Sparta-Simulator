package com.sparta.simulator.model;

import java.util.List;

public interface TraineeOperation {
     List<Trainee> getTrainees();
     void setTrainees(List<Trainee> trainees);
     void addTrainees(Trainee trainee, List<Trainee> trainees);
}