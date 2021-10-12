package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class MonthlyPop {
    public static void monthlyPop (){
        Sparta sparta = Sparta.getInstance();
        ListPop.listAdd(sparta.getTrainees());
        if ((sparta.getCurrentMonth()%2) == 0){
            sparta.getCentres().add(100);
        }
    }
}
