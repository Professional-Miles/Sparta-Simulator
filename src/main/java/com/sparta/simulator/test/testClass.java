package com.sparta.simulator.test;

import com.sparta.simulator.model.RandomGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testClass {

    @Test
    public void testRand(){
        int rand = RandomGenerator.getRandomNumOfTrainees();
        assertTrue(rand>0 && rand <=50);
    }
}
