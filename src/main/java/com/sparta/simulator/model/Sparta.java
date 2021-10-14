package com.sparta.simulator.model;

import java.util.ArrayList;
import java.util.List;

public class Sparta {

    private int bootCampCount = 0;

    /* / */

    private List<Trainee> waitingList = new ArrayList<>();
    private List<Trainee> trainingList = new ArrayList<>();
    private List<Trainee> bench = new ArrayList<>();
    private List<Centre> centres = new ArrayList<>();

    /* / */

    private int months;
    private int currentMonth = 1;

    private int idCounter = 1;

    /* / */

    private int openCentres = 0;
    private int closedCentres = 0;
    private int fullCentres = 0;

    /* / */

    private int trainingTrainees = 0;
    private int waitingTrainees = 0;

    /* / */

    private int cSharpTrainees = 0;
    private int javaTrainees = 0;
    private int dataTrainees = 0;
    private int devopsTrainees = 0;
    private int businessTrainees = 0;

    /* / */

    private int trainingHubs = 0;
    private int bootCamps = 0;
    private int techCentres = 0;

    /* / */

    private int cSharpTechCentres = 0;
    private int javaTechCentres = 0;
    private int dataTechCentres = 0;
    private int devopsTechCentres = 0;
    private int businessTechCentres = 0;

    /* / */

    private int clients = 0;
    private int traineesWithClients = 0;
    private int traineesOnBench = 0;
    private int unhappyClients = 0;
    private int happyClients = 0;

    /* / */

    private static Sparta spartaInstance = null;

    public static Sparta getInstance(){
        if(spartaInstance == null){
            spartaInstance = new Sparta();
        }
        return spartaInstance;
    }

    /* / */

    public void incrementBootCampCount() {
        this.bootCampCount++;
    }

    public void decrementBootCampCount() {
        this.bootCampCount = bootCampCount - 1;
    }

    public boolean tooManyBoots(){
        return bootCampCount == 2;
    }

    public int getBootCampCount() {
        return bootCampCount;
    }

    /* / */

    public List<Trainee> getWaitingList() {
        return waitingList;
    }

    public List<Trainee> getTrainingList() {
        return trainingList;
    }

    public List<Trainee> getBench() {
        return bench;
    }

    public List<Centre> getCentres() {
        return centres;
    }

    /* / */

    public void setMonths(int months) {
        this.months = months;
    }

    public int getMonths() {
        return months;
    }

    public int getCurrentMonth() {
        return currentMonth;
    }

    public void incrementCurrentMonth() {
        this.currentMonth++;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void incrementIdCounter(){
        this.idCounter += 1;
    }

    /* / */

    public int getOpenCentres() {
        return openCentres;
    }

    public void incrementOpenCentres(){
        this.openCentres++;
    }

    public void decrementOpenCentres(){
        this.openCentres--;
    }

    /* / */

    public int getClosedCentres() {
        return closedCentres;
    }

    public void incrementClosedCentres(){
        this.closedCentres++;
    }

    public void decrementClosedCentres(){
        this.closedCentres--;
    }

    /* / */

    public int getFullCentres() {
        return fullCentres;
    }

    public void incrementFullCentres(){
        this.fullCentres++;
    }

    public void decrementFullCentres(){
        this.fullCentres--;
    }

    /* / */

    public int getTrainingTrainees() {
        return trainingTrainees;
    }

    public void incrementTrainingTrainees() {
        this.trainingTrainees++;
    }

    public void decrementTrainingTrainees() {
        this.trainingTrainees--;
    }

    /* / */

    public int getWaitingTrainees() {
        return waitingTrainees;
    }

    public void incrementWaitingTrainees() {
        this.waitingTrainees++;
    }

    public void decrementWaitingTrainees() {
        this.waitingTrainees--;
    }

    /* / */

    public int getCSharpTrainees() {
        return cSharpTrainees;
    }

    public void incrementCSharpTrainees() {
        this.cSharpTrainees++;
    }

    public void decrementCSharpTrainees() {
        this.cSharpTrainees--;
    }


    /* / */

    public int getJavaTrainees() {
        return javaTrainees;
    }

    public void incrementJavaTrainees() {
        this.javaTrainees++;
    }

    public void decrementJavaTrainees() {
        this.javaTrainees--;
    }

    /* / */

    public int getDataTrainees() {
        return dataTrainees;
    }

    public void incrementDataTrainees() {
        this.dataTrainees++;
    }

    public void decrementDataTrainees() {
        this.dataTrainees--;
    }

    /* / */

    public int getDevopsTrainees() {
        return devopsTrainees;
    }

    public void incrementDevopsTrainees() {
        this.devopsTrainees++;
    }

    public void decrementDevopsTrainees() {
        this.devopsTrainees--;
    }

    /* / */

    public int getBusinessTrainees() {
        return businessTrainees;
    }

    public void incrementBusinessTrainees() {
        this.businessTrainees++;
    }

    public void decrementBusinessTrainees() {
        this.businessTrainees--;
    }

    /* / */

    public int getTrainingHubs() {
        return trainingHubs;
    }

    public void incrementTrainingHubs() {
        this.trainingHubs++;
    }

    public void decrementTrainingHubs() {
        this.trainingHubs--;
    }

    /* / */

    public int getBootCamps() {
        return bootCamps;
    }

    public void incrementBootCamps() {
        this.bootCamps++;
    }

    public void decrementBootCamps() {
        this.bootCamps--;
    }

    /* / */

    public int getTechCentres() {
        return techCentres;
    }

    public void incrementTechCentres() {
        this.techCentres++;
    }

    public void decrementTechCentres() {
        this.techCentres--;
    }

    /* / */

    public int getCSharpTechCentres() {
        return cSharpTechCentres;
    }

    public void incrementCSharpTechCentres() {
        this.cSharpTechCentres++;
    }

    public void decrementCSharpTechCentres() {
        this.cSharpTechCentres--;
    }

    /* / */

    public int getJavaTechCentres() {
        return javaTechCentres;
    }

    public void incrementJavaTechCentres() {
        this.javaTechCentres++;
    }

    public void decrementJavaTechCentres() {
        this.javaTechCentres--;
    }

    /* / */

    public int getDataTechCentres() {
        return dataTechCentres;
    }

    public void incrementDataTechCentres() {
        this.dataTechCentres++;
    }

    public void decrementDataTechCentres() {
        this.dataTechCentres--;
    }

    /* / */

    public int getDevopsTechCentres() {
        return devopsTechCentres;
    }

    public void incrementDevopsTechCentres() {
         this.devopsTechCentres++;
    }

    public void decrementDevopsTechCentres() {
        this.devopsTechCentres--;
    }

    /* / */

    public int getBusinessTechCentres() {
        return businessTechCentres;
    }

    public void incrementBusinessTechCentres() {
        this.businessTechCentres++;
    }

    public void decrementBusinessTechCentres() {
        this.businessTechCentres--;
    }

    /* / */

    public int getClients() {
        return clients;
    }

    /* / */

    public int getTraineesWithClients() {
        return traineesWithClients;
    }

    /* / */

    public int getTraineesOnBench() {
        return traineesOnBench;
    }

    /* / */

    public int getUnhappyClients() {
        return unhappyClients;
    }

    /* / */

    public int getHappyClients() {
        return happyClients;
    }
}
