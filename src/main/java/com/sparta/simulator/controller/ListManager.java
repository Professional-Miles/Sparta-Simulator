package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class ListManager {

    public static void monthlyActions(int j){
        Sparta stest = Sparta.getInstance();
        MonthlyPop.monthlyPop(stest.getTrainees(), stest.getCentres(), j);
        System.out.println("Month = " + j);
        System.out.println("Trainee List = " + stest.getTrainees().toString());
        System.out.println("Centres List = " + stest.getCentres().toString());

    }




}
