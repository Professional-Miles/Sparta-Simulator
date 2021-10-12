package com.Sparta.Luigi.week6;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class NumberOfTrainees {
    private ArrayList<Integer> trainees = new ArrayList<>();
    private ArrayList<Integer> waitlist=new ArrayList<>();
    public void traineeGenerator(){
        int totalApplicants=ThreadLocalRandom.current().nextInt(50, 101);
        int totalTaken=ThreadLocalRandom.current().nextInt(0, 51);
        int waiting
        trainees.add(Integer.valueOf(totalTaken));
    }

    public ArrayList<Integer> getWaitlist() {
        return waitlist;
    }

    public void setWaitlist(ArrayList<Integer> waitlist) {
        this.waitlist = waitlist;
    }


    public ArrayList<Integer> getTrainees() {
        return trainees;
    }

    public void setTrainees(ArrayList<Integer> trainees) {
        this.trainees = trainees;
    }

}
