package com.sparta.simulator.controller;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ListPop {

    public static void listAdd (ArrayList<Integer> list){
        list.add(ThreadLocalRandom.current().nextInt(50, 101));
    }

}
