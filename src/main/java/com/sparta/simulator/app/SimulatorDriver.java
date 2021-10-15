package com.sparta.simulator.app;

import com.sparta.simulator.centreopening.CentreGenerator;
import com.sparta.simulator.controller.*;
import com.sparta.simulator.maketrainee.TraineeGenerator;
import com.sparta.simulator.model.Sparta;
import com.sparta.simulator.view.UserInput;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class SimulatorDriver {

    private static final Logger log = Logger.getLogger("Simulation Driver logger.");

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");


        try {
            Sparta sparta = Sparta.getInstance();
            sparta.setMonths(UserInput.getNumOfMonths());
            for (int i = 0; i < sparta.getMonths(); i++) {

                System.out.println("\n-------------------------------------------------------------------------\nCurrent month = " + sparta.getCurrentMonth());


                CentreGenerator.openCentre();
                TraineeGenerator.createTrainee();

                System.out.println("Trainees generated = " + sparta.getIdCounter());
                System.out.println("\nCentre pre-allocation =" + sparta.getCentres());
                System.out.println("\nNumber of Training Hubs = " + sparta.getTrainingHubs());
                System.out.println("Number of Tech Centres = " + sparta.getTechCentres());
                System.out.println("Number of Boot Camps = " + sparta.getBootCamps());
                System.out.println("Trainees in Waiting List = " + sparta.getWaitingList().size());

                TraineeMover.moveTrainee();
                CentreAttendanceLow.lowAttendanceCheck();

                System.out.println("\nAfter trainee allocation = " + sparta.getCentres());
                System.out.println("\nTrainees in training centres = " + sparta.getTrainingList().size());
                System.out.println("Number of currently open training centres = " + sparta.getCentres().size());
                System.out.println("Number of closed Training centres = " + sparta.getClosedCentres());

                IncrementOpenTime.hasBeenOpen();
                IncrementTrainingTime.hasBeenTraining();
                sparta.incrementCurrentMonth();

            }
        } catch (Exception e) {
            log.error("\n\n Exception thrown. \n");
        }
    }
}


