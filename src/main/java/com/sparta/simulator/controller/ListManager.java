package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class ListManager {

    public static void monthlyActions(){
        Sparta sparta = Sparta.getInstance();
        MonthlyPop.monthlyPop();
        int thisMonth = sparta.getCurrentMonth() + 1;
        System.out.println("Month = " + thisMonth);
        System.out.println("Trainee List = " + sparta.getTrainees().toString());
        System.out.println("Centres List = " + sparta.getCentres().toString() + "\n");
    }

}
