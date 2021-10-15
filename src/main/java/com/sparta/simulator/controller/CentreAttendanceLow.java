package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class CentreAttendanceLow {

    //  working on
    public static void lowAttendanceCheck() {
        Sparta sparta = Sparta.getInstance();

        if (sparta.getCurrentMonth() > 1) {
            int j = 0;
            for (int i = 0; i < sparta.getCentres().size(); j++) {
                if (j > i + 120) {
                    break;
                }
                if (sparta.getCentres().get(i).getOpenTime() > 0) {
                    if (sparta.getCentres().get(i).lowAttendance()) {
                        sparta.decrementOpenCentres();
                        sparta.incrementClosedCentres();
                        switch (sparta.getCentres().get(i).getCentreType()) {
                            case "TrainingHub":
                                int toMoveHub = (100 - sparta.getCentres().get(i).getCapacity());
                                for (int k = 0; k < toMoveHub; k++) {
                                    sparta.decrementHubTrainees();
                                }
                                sparta.decrementTrainingHubs();
                                sparta.getCentres().remove(i);
                                MoveCentres.centreToCentre(toMoveHub);
                                break;
                            case "TechCentre":
                                int toMoveTech = (100 - sparta.getCentres().get(i).getCapacity());
                                for (int l = 0; l < toMoveTech; l++) {
                                    sparta.decrementTechTrainees();
                                }
                                sparta.decrementTechCentres();
                                sparta.getCentres().remove(i);
                                MoveCentres.centreToCentre(toMoveTech);
                                break;
                            case "BootCamp":
                                if (sparta.getCentres().get(i).getMonthCount() == 0) {
                                    int toMoveCamp = (100 - sparta.getCentres().get(i).getCapacity());
                                    for (int m = 0; m < toMoveCamp; m++) {
                                        sparta.decrementCampTrainees();
                                    }
                                    sparta.decrementBootCamps();
                                    sparta.decrementBootCampCount();
                                    sparta.getCentres().remove(i);
                                    MoveCentres.centreToCentre(toMoveCamp);
                                } else {
                                    sparta.getCentres().get(i).decrementLAMonth();
                                }
                                break;
                        }
                    } else {
                        if (sparta.getCentres().get(i).getCentreType().equals("BootCamp"))
                            i++;
                    }
                    j++;
                }
                i++;
            }
        }
    }
}
