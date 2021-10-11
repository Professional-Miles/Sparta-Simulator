package com.sparta.simulator;

public class DisplayManager {
    private static final String displaySimTime =
            "\t*************************************\n" +
            "\t|  Please input the number of months |\n" +
            "\t|  you would like the simulation     |\n" +
            "\t|  to run for.                       |\n" +
            "\t*************************************\n" ;

    public static String getDisplaySimTime(){
        return displaySimTime;
    }
}
