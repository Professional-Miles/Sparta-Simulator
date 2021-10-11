package com.sparta.simulator.view;

import com.sparta.simulator.DisplayManager;

import java.util.Scanner;

import static java.lang.System.in;

public class SimulatorDriver {

    public static void main(String[] args) {
        DisplayManager displayManager = new DisplayManager();
        boolean status = true;

        while (status) {
            System.out.println(displayManager.getDisplaySimTime());
            try {
                Scanner scanner = new Scanner(in);
                int num = Integer.parseInt(scanner.next());
                switch(num) {

                    case 1:
                        System.out.println("case1");
                        // ADD ALL CALL STATEMENTS
                        status = false;
                        break;


                    default:
                        System.err.println("Incorrect");

                }
            } catch (NumberFormatException e) {
                //add logger
                e.printStackTrace();
            }

        }

    }
}


