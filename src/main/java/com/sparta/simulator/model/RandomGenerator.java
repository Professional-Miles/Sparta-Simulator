package com.sparta.simulator.model;

import java.util.Random;

public class RandomGenerator {

    public static String generateRandomCentreTwo() {
        final String[] centreTypes = {"TechCentre","TrainingHub"};
        Random random = new Random();
        return centreTypes[random.nextInt(centreTypes.length)];
    }

    public static String generateRandomCentreThree() {
        final String[] centreTypes = {"TechCentre","TrainingHub","BootCamp"};
        Random random = new Random();
        return centreTypes[random.nextInt(centreTypes.length)];
    }

    public static int getRandomNumOfTrainees() {
        Random rand = new Random();
        int numOfTraineesToBeAddedEveryMonth = rand.nextInt(51);
        return numOfTraineesToBeAddedEveryMonth;
    }

}
