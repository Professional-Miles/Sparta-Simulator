package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class CentreAttendanceLow {

    //  working on
    public static void lowAttendanceCheck() {
        Sparta sparta = Sparta.getInstance();

        if (sparta.getCurrentMonth() > 1) {
        int j = 0;
            for (int i = 0; i < sparta.getCentres().size(); j++) {
                if (j > i +10){
                    break;
                }
                if (sparta.getCentres().get(i).getOpenTime() > 0) {
                    if (sparta.getCentres().get(i).lowAttendance()) {
                        sparta.decrementOpenCentres();
                        sparta.incrementClosedCentres();
                        switch (sparta.getCentres().get(i).getCentreType()) {
                            case "TrainingHub":
                                sparta.decrementTrainingHubs();
                                break;
                            case "TechCentre":
                                sparta.decrementTechCentres();
                                break;
                            case "BootCamp":
                                sparta.decrementBootCamps();
                                break;
                        }
                        sparta.getCentres().remove(i);
                    } else {
                        i++;
                    }
                    j++;
                }
            }
        }
    }
}
