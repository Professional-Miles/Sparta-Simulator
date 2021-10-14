package com.sparta.simulator.centreopening;

import com.sparta.simulator.controller.RandomGenerator;
import com.sparta.simulator.model.*;

import java.util.Random;

public class CentreGenerator {

    public static void openCentre() {

        Sparta sparta = Sparta.getInstance();

        if ((sparta.getMonths() % 2) == 0) {

            //check if there are 2 boot camps
            if (sparta.tooManyBoots()) {
                String chosenCentre = RandomGenerator.generateRandomCentreTwo();

                if (chosenCentre.equals("TrainingHub")) {
                    Random rand = new Random();
                    int trainingHubNum = rand.nextInt(((4 - 1)) + 1) + 1;
                    while (0 < trainingHubNum) {
                        TrainingHubCreator.openTrainingHub();
                        trainingHubNum--;
                    }
                } else {
                    TechCentreCreator.openTechCentre();
                }
            } else {

                String chosenCentre = RandomGenerator.generateRandomCentreThree();

                if (chosenCentre.equals("TrainingHub")) {
                    Random rand = new Random();
                    int tHubNum = rand.nextInt(((4 - 1)) + 1) + 1;
                    while (0 < tHubNum) {
                        TrainingHubCreator.openTrainingHub();
                        tHubNum--;
                    }
                } else if (chosenCentre.equals("TechCentre")) {
                    TechCentreCreator.openTechCentre();
                } else {
                    BootCampCreator.openBootCamp();
                }
            }
        } else {
            Random rand = new Random();
            int tHubNum = rand.nextInt(((4 - 1)) + 1) + 1;
            while (0 < tHubNum) {
                TrainingHubCreator.openTrainingHub();
                tHubNum--;
            }
        }
    }
}

