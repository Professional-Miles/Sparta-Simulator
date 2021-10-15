package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class TraineeToCamp {

    public static void addTraineeToCamp(int index){
        Sparta sparta = Sparta.getInstance();
        sparta.getCentres().get(index).decrementCapacity();
        sparta.incrementCampTrainees();
        sparta.getTrainingList().add(sparta.getWaitingList().get(0));
        sparta.getWaitingList().remove(0);
        sparta.incrementTrainingTrainees();
        sparta.decrementWaitingTrainees();
    }

}
