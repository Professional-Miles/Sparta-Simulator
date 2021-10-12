package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MoveTrainee {

    public static void move(ArrayList<Integer> t, ArrayList<Integer> c){

        Sparta sparta = Sparta.getInstance();
        Integer rTrainees;

        // if the number of trainees is higher than 50 the generator can get a max of 50 to be added...
        // otherwise it can only get a max of whatever number of trainees there are currently in the waiting list...
        // as index 0 of the trainee list is considered the waiting list we generate from there...
        if(sparta.getTrainees().get(0) > 50){
            rTrainees = (ThreadLocalRandom.current().nextInt(0, 51));
        } else {


            rTrainees = (ThreadLocalRandom.current().nextInt(0, sparta.getTrainees().get(0)+1));
        }


        sparta.getTrainees().set(0, sparta.getTrainees().get(0) - rTrainees);

        if (rTrainees > c.get(0))
            //check to see whether the index is 0
        c.set(0,c.get(0) - rTrainees);




    }



}
