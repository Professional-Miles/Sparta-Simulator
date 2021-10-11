package com.sparta.simulator.model;

import java.util.ArrayList;

public class Sparta {

    private ArrayList<Integer> trainees = new ArrayList<>();
    private ArrayList<Integer> centres = new ArrayList<>();
    private static Sparta spartaInstance = null;

    public static Sparta getInstance(){
        if(spartaInstance == null){
            spartaInstance = new Sparta();
        }
        return spartaInstance;
    }

    public ArrayList<Integer> getTrainees() {
        return trainees;
    }

    public void setTrainees(ArrayList<Integer> trainees) {
        this.trainees = trainees;
    }

    public ArrayList<Integer> getCentres() {
        return centres;
    }

    public void setCentres(ArrayList<Integer> centres) {
        this.centres = centres;
    }
}
