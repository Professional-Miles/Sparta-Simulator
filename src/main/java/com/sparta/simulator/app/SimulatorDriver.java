package com.sparta.simulator.app;

import com.sparta.simulator.view.DisplayManager;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import static java.lang.System.in;

public class SimulatorDriver {

    private static final Logger log = Logger.getLogger("Simulation Driver logger.");

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        boolean status = true;

        while (status) {
            System.out.print(DisplayManager.getDisplaySimTime());
            try{
                Scanner scanner = new Scanner(in);
                int num = scanner.nextInt();
                if (num >= 1) {
                    System.out.println("\nSimulation will run for " + num + " months.");
                    status = false;
                } else {
                    System.out.println("\n\tPlease enter a value larger than 0...\n");
                }
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("\n");
                log.log(Level.ERROR, "\n[" + e.getClass().getName() + " thrown.]\n");
            }
        }
    }
}


