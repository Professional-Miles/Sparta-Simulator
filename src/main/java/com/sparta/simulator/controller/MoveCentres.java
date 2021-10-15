package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class MoveCentres {

    public static void centreToCentre(int traineesToMove) {
        Sparta sparta = Sparta.getInstance();

        int j = 0;
        while (sparta.getCentres().get(j).getCapacity() > 0 && sparta.getCentres().get(j).getCentreType().equals("TechCentre")) {
            j++;
        }
        switch (sparta.getCentres().get(j).getCentreType()) {
            case "TrainingHub":
                int indexH = CentreAvailability.chosenCentreExistsAndSpaceAvailable("TrainingHub", sparta.getCentres());
                if (indexH > -1) {
                    for (int i = 0; i < traineesToMove; i++) {
                        sparta.getCentres().get(indexH).decrementCapacity();
                        sparta.incrementHubTrainees();
                    }
                }
                break;
            case "BootCamp":
                int indexC = CentreAvailability.chosenCentreExistsAndSpaceAvailable("BootCamp", sparta.getCentres());
                if (indexC > -1) {
                    for (int i = 0; i < traineesToMove; i++) {
                        sparta.getCentres().get(indexC).decrementCapacity();
                        sparta.incrementCampTrainees();
                    }
                }
                break;

        }
    }
}
