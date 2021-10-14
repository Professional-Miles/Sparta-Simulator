package com.sparta.simulator.app;

import com.sparta.simulator.controller.ListManager;
import com.sparta.simulator.model.Sparta;
import com.sparta.simulator.view.UserInput;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class SimulatorDriver {

    private static final Logger log = Logger.getLogger("Simulation Driver logger.");

    public static void main(String[] args) {
        Sparta sparta = Sparta.getInstance();
        PropertyConfigurator.configure("log4j.properties");
        UserInput.getNumOfMonths();
        sparta.setCurrentMonth(0);
        while (sparta.getCurrentMonth() < Sparta.getInstance().getMonths()) {
            ListManager.monthlyActions();
            sparta.setCurrentMonth(sparta.getCurrentMonth()+1);
        }

    }
}
