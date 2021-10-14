package com.sparta.simulator.maketrainee;

import com.sparta.simulator.model.Sparta;
import com.sparta.simulator.model.Trainee;

import java.util.Random;

public class TraineeCreator {

    public static void traineeCreatedCount() {
        Sparta sparta = Sparta.getInstance();
        final String[] courseTypes = {"java", "cSharp", "data", "devops", "business"};
        Random random = new Random();
        sparta.incrementWaitingTrainees();
        sparta.incrementIdCounter();

        String courseType = courseTypes[random.nextInt(courseTypes.length)];
        Trainee trainee = new Trainee(sparta.getIdCounter(), courseType);
        sparta.getWaitingList().add(trainee);

        switch (trainee.getCourseType()) {
            case "java":
                sparta.incrementJavaTrainees();
                break;
            case "cSharp":
                sparta.incrementCSharpTrainees();
                break;
            case "data":
                sparta.incrementDataTrainees();
                break;
            case "devops":
                sparta.incrementDevopsTrainees();
                break;
            case "business":
                sparta.incrementBusinessTrainees();
                break;
        }
    }
}
