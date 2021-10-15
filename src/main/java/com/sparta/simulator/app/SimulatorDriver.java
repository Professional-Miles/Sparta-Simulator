package com.sparta.simulator.app;

import com.sparta.simulator.centreopening.CentreGenerator;
import com.sparta.simulator.controller.CentreAttendanceLow;
import com.sparta.simulator.controller.IncrementOpenTime;
import com.sparta.simulator.controller.TraineeMover;
import com.sparta.simulator.maketrainee.TraineeGenerator;
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

            System.out.println("\nCurrent month = " + sparta.getCurrentMonth());
            CentreGenerator.openCentre();
            TraineeGenerator.createTrainee();
            System.out.println("Before moving =" + sparta.getCentres());
            System.out.println("Hubs = "+ sparta.getTrainingHubs());
            System.out.println("Centres = "+ sparta.getTechCentres());
            System.out.println("Camps = " + sparta.getBootCamps());
            System.out.println("Waiting Trainees = " + sparta.getWaitingTrainees());
            TraineeMover.moveTrainee();
            CentreAttendanceLow.lowAttendanceCheck();
            System.out.println("After moving = "+sparta.getCentres());
            System.out.println("Training Trainees = "+ sparta.getTrainingTrainees());
            System.out.println("Open centres = " + sparta.getOpenCentres());
            System.out.println("Closed Centres = " + sparta.getClosedCentres());
            IncrementOpenTime.hasBeenOpen();
            sparta.incrementCurrentMonth();

        }
    }
}


