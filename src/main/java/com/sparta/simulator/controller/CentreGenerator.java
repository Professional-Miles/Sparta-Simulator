package com.sparta.simulator.controller;

import com.sparta.simulator.model.*;

import java.util.Random;

public class CentreGenerator {

    public static void openCentre(){

        Sparta sparta = Sparta.getInstance();

        if ((sparta.getMonths()%2) == 0){

            //check if there are 2 boot camps
            if (sparta.tooManyBoots()){
                String chosenCentre = RandomGenerator.generateRandomCentreTwo();

                if (chosenCentre.equals("TrainingHub")) {
                     Random rand = new Random();
                     int tHubNum = rand.nextInt(((4-1)) + 1) + 1;
                    while (0 < tHubNum) {
                        TrainingHub trainingHub = new TrainingHub();
                        sparta.getCentres().add(trainingHub);
                        tHubNum--;
                    }
                } else {
                    TechCentre techCentre = new TechCentre();
                    sparta.getCentres().add(techCentre);
                }
            } else {

                String chosenCentre = RandomGenerator.generateRandomCentreThree();

                if (chosenCentre.equals("TrainingHub")) {
                    Random rand = new Random();
                    int tHubNum = rand.nextInt(((4-1)) + 1) + 1;
                    while (0 < tHubNum) {
                        TrainingHub trainingHub = new TrainingHub();
                        sparta.getCentres().add(trainingHub);
                        tHubNum--;
                    }
                } else if (chosenCentre.equals("TechCentre")) {
                    TechCentre techCentre = new TechCentre();
                    sparta.getCentres().add(techCentre);
                } else {
                    BootCamp bootCamp = new BootCamp();
                    sparta.getCentres().add(bootCamp);
                }
            }
        } else {
            Random rand = new Random();
            int tHubNum = rand.nextInt(((4-1)) + 1) + 1;
            while (0 < tHubNum) {
                TrainingHub trainingHub = new TrainingHub();
                sparta.getCentres().add(trainingHub);
                tHubNum--;
            }
        }
    }
}

