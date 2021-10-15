package com.sparta.simulator.centreopening;

import com.sparta.simulator.model.Sparta;
import com.sparta.simulator.model.TrainingHub;

public class TrainingHubCreator {

    public static void openTrainingHub() {
        Sparta sparta = Sparta.getInstance();
        TrainingHub trainingHub = new TrainingHub();
        sparta.getCentres().add(trainingHub);
        sparta.incrementTrainingHubs();
        sparta.incrementOpenCentres();
    }
}
