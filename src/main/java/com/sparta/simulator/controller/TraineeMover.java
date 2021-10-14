package com.sparta.simulator.controller;

import com.sparta.simulator.model.Centre;
import com.sparta.simulator.model.Trainee;

import java.util.List;

public class TraineeMover {

    public static void moveTrainee(int r, List<Trainee> t, List<Centre> c) {


        while (r > 0){

            if (CentreAvailability.spaceAvailable(c)){

                String rc = "Training Hub"; //will be random

                if (CentreAvailability.chosenCentreExist(rc,c) >= 0) {

                    if (RC equals techcentre){
                        if (RC course type equals Trainee at index 0 course type){
                            centre in List C at index CI decrement capcity.
                                    remove trainee from List T at index 0.
                        } else {

                            send trainee to a different centre with space ///done later

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
            R--;
        }
    }

}


}
