package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class CheckFinishedTraining {

    public static void finishedTraining() {
        Sparta sparta = Sparta.getInstance();

        int j = 0;
        for (int i = 0; i < sparta.getWaitingList().size(); j++) {
            if (j > i + 120) {
                break;
            }
            int tTime = sparta.getWaitingList().get(i).getTrainingTime();
            if (tTime > 11){
                sparta.getBench().add(sparta.getTrainingList().get(i));
                sparta.decrementTrainingTrainees();
                sparta.incrementTraineesOnBench();
                sparta.getTrainingList().remove(i);
            } else {
                i++;
            }
            j++;
        }

    }

}
