package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class TraineeToCentre {

    public static void addTraineeToCentre(int index){
        Sparta sparta = Sparta.getInstance();
        sparta.getCentres().get(index).decrementCapacity();
        sparta.incrementTechTrainees();
        sparta.getTrainingList().add(sparta.getWaitingList().get(0));
        sparta.getWaitingList().remove(0);
        sparta.incrementTrainingTrainees();
        sparta.decrementWaitingTrainees();
    }

}
