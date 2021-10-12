package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListPopTest {

    @Test
    void listAddTest() {
        Sparta sparta = Sparta.getInstance();
        for (int i = 0; i < 10; i++) {
            ListPop.listAdd(sparta.getTrainees());
            System.out.println("Randomly generated number of trainees = " + sparta.getTrainees().get(0));
            assertTrue(0 <= sparta.getTrainees().get(0) && sparta.getTrainees().get(0) <= 100);
            sparta.getTrainees().remove(0);
        }
    }
}