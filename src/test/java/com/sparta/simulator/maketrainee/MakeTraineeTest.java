package com.sparta.simulator.maketrainee;

import com.sparta.simulator.model.Sparta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeTraineeTest {

    // Checks if the waiting list is between 50 and 100
    @Test
    public void TraineeCreatorWaitingListTest(){
        Sparta sparta = Sparta.getInstance();
        TraineeGenerator.createTrainee();
        assertTrue(sparta.getWaitingList().size() > 49 && sparta.getWaitingList().size() < 101 );
    }


}