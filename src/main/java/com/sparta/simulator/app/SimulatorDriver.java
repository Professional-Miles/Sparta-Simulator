package com.sparta.simulator.app;

import com.sparta.simulator.model.Sparta;
import com.sparta.simulator.view.UserInput;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class SimulatorDriver {

    private static final Logger log = Logger.getLogger("Simulation Driver logger.");

    public static void main(String[] args) {
        Sparta sparta = Sparta.getInstance();
        PropertyConfigurator.configure("log4j.properties");

        sparta.setMonths(UserInput.getNumOfMonths());

        for (int i = 0; i < sparta.getMonths(); i++) {

            //ToDo

        }
    }
}


