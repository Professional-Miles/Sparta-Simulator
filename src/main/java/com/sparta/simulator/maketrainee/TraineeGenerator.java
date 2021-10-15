package com.sparta.simulator.maketrainee;

import java.util.Random;

public class TraineeGenerator {
    public static void createTrainee() {
        Random rand = new Random();
        int numT = rand.nextInt(((100 - 50)) + 1) + 50;
        int i = 0;
        while (i < numT) {
            TraineeCreator.traineeCreatedCount();
            i++;
        }
    }
}
