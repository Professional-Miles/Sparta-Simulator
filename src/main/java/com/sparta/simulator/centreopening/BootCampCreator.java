package com.sparta.simulator.centreopening;

import com.sparta.simulator.model.BootCamp;
import com.sparta.simulator.model.Sparta;

public class BootCampCreator {

    public static void openBootCamp() {
        Sparta sparta = Sparta.getInstance();
        BootCamp bootCamp = new BootCamp();
        sparta.getCentres().add(bootCamp);
        sparta.incrementBootCamps();
        sparta.incrementBootCampCount();
        sparta.incrementOpenCentres();
    }

}
