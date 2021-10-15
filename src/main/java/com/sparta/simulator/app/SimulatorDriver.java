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

                System.out.println("\nCurrent month = " + sparta.getCurrentMonth());


                CentreGenerator.openCentre();
                TraineeGenerator.createTrainee();

                System.out.println("Trainees generated = " + sparta.getIdCounter());
                System.out.println("Before moving =" + sparta.getCentres());
                System.out.println("Hubs = " + sparta.getTrainingHubs());
                System.out.println("Centres = " + sparta.getTechCentres());
                System.out.println("Camps = " + sparta.getBootCamps());
                System.out.println("Waiting Trainees = " + sparta.getWaitingList().size());

                TraineeMover.moveTrainee();
                CentreAttendanceLow.lowAttendanceCheck();

                System.out.println("After moving = " + sparta.getCentres());
                System.out.println("Training Trainees = " + sparta.getTrainingList().size());
                System.out.println("Open centres = " + sparta.getCentres().size());
                System.out.println("Closed Centres = " + sparta.getClosedCentres());

                IncrementOpenTime.hasBeenOpen();
                IncrementTrainingTime.hasBeenTraining();
                sparta.incrementCurrentMonth();

            }
        } catch (Exception e) {
            log.error("\n\n Exception thrown. \n");
        }
    }
}


