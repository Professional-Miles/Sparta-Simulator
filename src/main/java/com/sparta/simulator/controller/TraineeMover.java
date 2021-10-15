package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class TraineeMover {

    public static void moveTrainee() {

        Sparta sparta = Sparta.getInstance();
        int r = RandomGenerator.getRandomNumOfTrainees();

        String rc = RandomGenerator.generateRandomCentreThree();

        int added = 0;
        while (r > 0) {
            switch (rc) {
                case "TrainingHub":
                    if (sparta.getTrainingHubs() > 0) {
                        int index = CentreAvailability.chosenCentreExistsAndSpaceAvailable(rc,sparta.getCentres());
                        if (index > -1){
                            TraineeToHub.addTraineeToHub(index);
                            added++;
                        }
                    }
                    break;
                case "TechCentre":
                    if (sparta.getTechCentres() > 0) {
                        int index = CentreAvailability.chosenCentreExistsAndSpaceAvailable(rc,sparta.getCentres());
                        int techIndex = CentreAvailability.techCentreType(sparta.getWaitingList().get(0).getCourseType(),sparta.getCentres());
                        if (index == techIndex && index != -1){
                            TraineeToCentre.addTraineeToCentre(index);
                            added++;
                        }
                    }
                    break;
                case "BootCamp":
                    if (sparta.getBootCamps() > 0) {
                        int index = CentreAvailability.chosenCentreExistsAndSpaceAvailable(rc,sparta.getCentres());
                        if (index > -1){
                            TraineeToCamp.addTraineeToCamp(index);
                            added++;
                        }
                    }
                    break;
            }
            if (added == 0) {
                int j = 0;
                while (sparta.getCentres().get(j).getCapacity() > 0 && sparta.getCentres().get(j).getCentreType().equals("TechCentre")) {
                    j++;
                }
                switch (sparta.getCentres().get(j).getCentreType()) {
                    case "TrainingHub":
                        int indexH = CentreAvailability.chosenCentreExistsAndSpaceAvailable(rc,sparta.getCentres());
                        if (indexH > -1){
                            TraineeToHub.addTraineeToHub(indexH);
                        }
                        break;
                    case "BootCamp":
                        int indexC = CentreAvailability.chosenCentreExistsAndSpaceAvailable(rc,sparta.getCentres());
                        if (indexC > -1){
                            TraineeToCamp.addTraineeToCamp(indexC);
                        }
                        break;
                }
            }
            r--;
        }
    }
}
