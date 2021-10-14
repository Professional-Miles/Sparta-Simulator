package com.sparta.simulator.model;

public class TrackingVariables {
    private int centresOpen;
    private int centresClosed;
    private int fullCentres;
    private int currentTrainees;
    private int waitingList;

    public int getCentresOpen() {
        return centresOpen;
    }

    public void setCentresOpen(int centresOpen) {
        this.centresOpen = centresOpen;
    }

    public int getCentresClosed() {
        return centresClosed;
    }

    public void setCentresClosed(int centresClosed) {
        this.centresClosed = centresClosed;
    }

    public int getFullCentres() {
        return fullCentres;
    }

    public void setFullCentres(int fullCentres) {
        this.fullCentres = fullCentres;
    }

    public int getCurrentTrainees() {
        return currentTrainees;
    }

    public void setCurrentTrainees(int currentTrainees) {
        this.currentTrainees = currentTrainees;
    }

    public int getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(int waitingList) {
        this.waitingList = waitingList;
    }
}
