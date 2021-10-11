package com.sparta.simulator.controller;

import com.sparta.simulator.controller.ListPop;

import java.util.ArrayList;

public class MonthlyPop {

    public static void monthlyPop (ArrayList<Integer> t, ArrayList<Integer> c, int month){
        ListPop.listAdd(t);
        if ((month%2) == 0){
            c.add(100);
        }
    }

}
