package com.sparta.simulator.controller;

import com.sparta.simulator.model.Sparta;
import java.util.List;

public class TraineeMover {

    public static void moveTrainee() {

        Sparta sparta = Sparta.getInstance();
        int r = RandomGenerator.getRandomNumOfTrainees();

        while (r > 0){

            if (CentreAvailability.spaceAvailable(sparta.getCentres())){

                String rc = RandomGenerator.generateRandomCentreThree();

                if (CentreAvailability.chosenCentreExist(rc,sparta.getCentres(),0) >= 0) {

                    if (rc.equals("TechCentre")){
                        int tCIndex = CentreAvailability.techCentreType(sparta.getWaitingList().get(0).getCourseType(),sparta.getCentres())
                        if (tCIndex >= 0){
                           sparta.getCentres().get(tCIndex).decrementCapacity();
                           sparta.getTrainingList().add(sparta.getWaitingList().get(0));
                           sparta.getWaitingList().remove(0);

                        } else {
                          //  send trainee to a different centre with space
                        }
                    } else {
                        centre in List C at index CI decrement capcity.
                                remove trainee from List T at index 0.
                    }

                } else {

                    send trainee to a different centre with space

                }


            } else {
                all centres full
            }
            r--;
        }
    }

}


}
