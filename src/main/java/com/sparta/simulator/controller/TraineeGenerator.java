package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;
import com.sparta.simulator.model.Trainee;
import java.util.Random;

public class TraineeGenerator {
        public static void createTrainee(){

            final String[] courseTypes = {"java", "cSharp", "data", "devops", "business"};
            Random random = new Random();
            Sparta sparta = Sparta.getInstance();
            Random rand = new Random();
            int numT = rand.nextInt(((100-50)) + 1) + 50;
            int i = 0;

            while (i < numT){
                String courseType = courseTypes[random.nextInt(courseTypes.length)];
                Trainee trainee = new Trainee(sparta.getIdCounter(),courseType);
                sparta.getWaitingList().add(trainee);
                sparta.setIdCounter(sparta.getIdCounter() +1);
                i++;
            }
        }
    }
