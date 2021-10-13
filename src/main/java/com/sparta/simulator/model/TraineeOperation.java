package com.sparta.simulator.model;

public interface TraineeOperation {
    public List<Trainee> getTrainees();

    public void setTrainess(List<Trainee>);

    public void addTrainees(Trainee trainee, List<Trainee> trainees);
}
