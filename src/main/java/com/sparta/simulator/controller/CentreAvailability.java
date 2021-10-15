package com.sparta.simulator.controller;

import com.sparta.simulator.model.Centre;

import java.util.List;

public class CentreAvailability {

    // doesn't work
    public static boolean spaceAvailable(List<Centre> centreList) {

        int fullCounter = 0;
        for (Centre c : centreList) {
            if (!c.isFull()) {
                fullCounter++;
            }
        }
        return fullCounter > 0;
    }

    public static int chosenCentreExist(String centre, List<Centre> centreList, int next) {
        int index = -1;
        if (next == 0) {
            for (int i = 0; i < centreList.size(); i++) {
                if (centreList.get(i).getCentreType().equals(centre)) {
                    if (!centreList.get(i).isFull()) {
                        index = i;
                        break;
                    }
                }
            }
        } else {
            for (int i = next + 1; i < centreList.size(); i++) {
                if (centreList.get(i).getCentreType().equals(centre)) {
                    if (!centreList.get(i).isFull()) {
                        index = i;
                        break;
                    }
                }
            }
        }
        return index;
    }

    public static int chosenCentreExistsAndSpaceAvailable(String centre, List<Centre> centreList) {
        int index = -1;
        for (int i = 0; i < centreList.size(); i++){
            if (centreList.get(i).getCentreType().equals(centre)){
                if (centreList.get(i).getCapacity() > 0){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static int techCentreType(String courseType, List<Centre> centreList) {
        int index = -1;
        index = chosenCentreExistsAndSpaceAvailable("TechCentre", centreList);
        if (!centreList.get(index).getCourseType().equals(courseType)){
            index = -1;
        }
        return index;
    }



}
