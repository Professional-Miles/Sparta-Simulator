package com.sparta.simulator.model;

import java.util.Random;

public class RandomGenerator {
    Random rand = new Random();
    Centre centre;

    public Centre generateRandomCentre() {

        int x = rand.nextInt(4);
        if (x == 1)  {
            centre = new TechCentre();
        } else if (x == 2) {
            centre = new TrainingCentre();
        } else if (x == 3) {
            centre = new BootcampCentre();
        }

        return null;
    }

    public static int getRandomNumOfTrainees() {
        Random rand=new Random();
        int numOfTraineesToBeAddedEveryMonth = rand.nextInt(51);
        return numOfTraineesToBeAddedEveryMonth;
    }

}
