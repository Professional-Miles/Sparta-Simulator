package com.sparta.simulator.view;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.util.NoSuchElementException;
import java.util.Scanner;
import static java.lang.System.in;

public class UserInput {

    private static final Logger log = Logger.getLogger("User input logger.");

    public static int getNumOfMonths(){
        int num = 0;
        boolean status = true;
        while (status) {
            System.out.print(DisplayManager.getDisplaySimTime());
            try{
                Scanner scanner = new Scanner(in);
                num = scanner.nextInt();
                if (num >= 1) {
                    System.out.println("\nSimulation will run for " + num + " months.\n");
                    status = false;
                } else {
                    System.out.println("\n\tPlease enter a value larger than 0...\n");
                }
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("\n");
                log.log(Level.ERROR, "\n[" + e.getClass().getName() + " thrown.]\n");
            }
        }
        return num;
    }

    public static void selectChoiceOfDataOutput(){
        //ToDo fetch corresponding data and print
        Scanner scanner = new Scanner(in);
        System.out.println("1: Opened centre");
        System.out.println("2: Closed centres");
        System.out.println("3: Full centres");
        System.out.println("4: Number of trainees in waiting list");
        System.out.println("5: Number of trainees currently training");

    }
}
