package com.sparta.simulator.controller;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MoveTrainee {


    public static void move(ArrayList<Integer> t, ArrayList<Integer> c){

        Integer rTrainees;
        if(t.get(0) > 50){
            rTrainees = (ThreadLocalRandom.current().nextInt(0, 51));
        } else {
            rTrainees = (ThreadLocalRandom.current().nextInt(0, t.get(0)+1));
        }
        t.set(0,t.get(0) - rTrainees);
        if (rTrainees > c.get(0))
            //check to see whether the index is 0
        c.set(0,c.get(0) - rTrainees);




    }



}
