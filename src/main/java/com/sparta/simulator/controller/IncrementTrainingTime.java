package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class IncrementTrainingTime {

    public static void hasBeenTraining() {
        Sparta sparta = Sparta.getInstance();

        for (int i = 0; i < sparta.getWaitingList().size(); i++) {
            sparta.getWaitingList().get(i).incrementTrainingTime();
        }

    }

}
