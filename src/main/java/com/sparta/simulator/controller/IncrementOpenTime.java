package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;

public class IncrementOpenTime {

    public static void hasBeenOpen() {
        Sparta sparta = Sparta.getInstance();
        for (int i = 0; i < sparta.getCentres().size(); i++) {
            sparta.getCentres().get(i).incrementOpenTime();
        }
    }
}
