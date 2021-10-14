package com.sparta.simulator.model;

import java.util.ArrayList;
import java.util.List;

public class Sparta {

    // private List<Trainee> trainees = new ArrayList<>();
    private List<Trainee> waitingList= new ArrayList<>();
    private List<Trainee> bench = new ArrayList<>();
    private List<Centre> centres = new ArrayList<>();


    private int months;
    private int currentMonth;

    private int idCounter = 1;

    private int openCentres;
    private int closedCentres;
    private int fullCentres;

    private int trainingTrainees;
    private int waitingTrainees;

    private int cSharpTrainees;
    private int javaTrainees;
    private int dataTrainees;
    private int devopsTrainees;
    private int businessTrainees;

    private int trainingHubs;
    private int bootCamps;
    private int techCentres;

    private int cSharpTechCentres;
    private int javaTechCentres;
    private int dataTechCentres;
    private int devopsTechCentres;
    private int businessTechCentres;

    private int clients;
    private int traineesWithClients;
    private int traineesOnBench;
    private int unhappyClients;
    private int happyClients;


    private static Sparta spartaInstance = null;

    public static Sparta getInstance(){
        if(spartaInstance == null){
            spartaInstance = new Sparta();
        }
        return spartaInstance;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter){
        this.idCounter = idCounter;
    }

    public void setcSharpTrainees(int cSharpTrainees) {
        this.cSharpTrainees = cSharpTrainees;
    }

    public List<Trainee> getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(List<Trainee> waitingList) {
        this.waitingList = waitingList;
    }

    public List<Trainee> getBench() {
        return bench;
    }

    public void setBench(List<Trainee> bench) {
        this.bench = bench;
    }

    public List<Centre> getCentres() {
        return centres;
    }

    public void setCentres(List<Centre> centres) {
        this.centres = centres;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(int currentMonth) {
        this.currentMonth = currentMonth;
    }

    public int getOpenCentres() {
        return openCentres;
    }

    public void setOpenCentres(int openCentres) {
        this.openCentres = openCentres;
    }

    public int getClosedCentres() {
        return closedCentres;
    }

    public void setClosedCentres(int closedCentres) {
        this.closedCentres = closedCentres;
    }

    public int getFullCentres() {
        return fullCentres;
    }

    public void setFullCentres(int fullCentres) {
        this.fullCentres = fullCentres;
    }

    public int getTrainingTrainees() {
        return trainingTrainees;
    }

    public void setTrainingTrainees(int trainingTrainees) {
        this.trainingTrainees = trainingTrainees;
    }

    public int getWaitingTrainees() {
        return waitingTrainees;
    }

    public void setWaitingTrainees(int waitingTrainees) {
        this.waitingTrainees = waitingTrainees;
    }

    public int getCSharpTrainees() {
        return cSharpTrainees;
    }

    public void setCSharpTrainees(int cSharpTrainees) {
        this.cSharpTrainees = cSharpTrainees;
    }

    public int getJavaTrainees() {
        return javaTrainees;
    }

    public void setJavaTrainees(int javaTrainees) {
        this.javaTrainees = javaTrainees;
    }

    public int getDataTrainees() {
        return dataTrainees;
    }

    public void setDataTrainees(int dataTrainees) {
        this.dataTrainees = dataTrainees;
    }

    public int getDevopsTrainees() {
        return devopsTrainees;
    }

    public void setDevopsTrainees(int devopsTrainees) {
        this.devopsTrainees = devopsTrainees;
    }

    public int getBusinessTrainees() {
        return businessTrainees;
    }

    public void setBusinessTrainees(int businessTrainees) {
        this.businessTrainees = businessTrainees;
    }

    public int getTrainingHubs() {
        return trainingHubs;
    }

    public void setTrainingHubs(int trainingHubs) {
        this.trainingHubs = trainingHubs;
    }

    public int getBootCamps() {
        return bootCamps;
    }

    public void setBootCamps(int bootCamps) {
        this.bootCamps = bootCamps;
    }

    public int getTechCentres() {
        return techCentres;
    }

    public void setTechCentres(int techCentres) {
        this.techCentres = techCentres;
    }

    public int getCSharpTechCentres() {
        return cSharpTechCentres;
    }

    public void setCSharpTechCentres(int cSharpTechCentres) {
        this.cSharpTechCentres = cSharpTechCentres;
    }

    public int getJavaTechCentres() {
        return javaTechCentres;
    }

    public void setJavaTechCentres(int javaTechCentres) {
        this.javaTechCentres = javaTechCentres;
    }

    public int getDataTechCentres() {
        return dataTechCentres;
    }

    public void setDataTechCentres(int dataTechCentres) {
        this.dataTechCentres = dataTechCentres;
    }

    public int getDevopsTechCentres() {
        return devopsTechCentres;
    }

    public void setDevopsTechCentres(int devopsTechCentres) {
        this.devopsTechCentres = devopsTechCentres;
    }

    public int getBusinessTechCentres() {
        return businessTechCentres;
    }

    public void setBusinessTechCentres(int businessTechCentres) {
        this.businessTechCentres = businessTechCentres;
    }

    public int getClients() {
        return clients;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }

    public int getTraineesWithClients() {
        return traineesWithClients;
    }

    public void setTraineesWithClients(int traineesWithClients) {
        this.traineesWithClients = traineesWithClients;
    }

    public int getTraineesOnBench() {
        return traineesOnBench;
    }

    public void setTraineesOnBench(int traineesOnBench) {
        this.traineesOnBench = traineesOnBench;
    }

    public int getUnhappyClients() {
        return unhappyClients;
    }

    public void setUnhappyClients(int unhappyClients) {
        this.unhappyClients = unhappyClients;
    }

    public int getHappyClients() {
        return happyClients;
    }

    public void setHappyClients(int happyClients) {
        this.happyClients = happyClients;
    }
}
