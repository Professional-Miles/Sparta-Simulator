package com.sparta.simulator.app;

import com.sparta.simulator.view.UserInput;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class SimulatorDriver {

    private static final Logger log = Logger.getLogger("Simulation Driver logger.");

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        int numOfMonths = UserInput.getNumOfMonths();

        for (int i = 0; i < numOfMonths; i++) {

            //ToDo

        }
    }
}


