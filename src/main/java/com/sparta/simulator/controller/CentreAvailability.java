package com.sparta.simulator.controller;

import com.sparta.simulator.model.Centre;
import java.util.List;

public class CentreAvailability {

    public static boolean spaceAvailable(List<Centre> centreList) {

        int fullCounter = 0;
        for (Centre c : centreList) {
                if(!c.isFull()){
                    fullCounter++;
                }
        }
        return fullCounter > 0;
    }

    public static int chosenCentreExist(String centre, List<Centre> centreList, int next) {
        int index = -1;
        if (next > 0) {
            for (int i = 0; i < centreList.size(); i++) {
                if (centreList.get(i).getCentreType().equals(centre)) {
                    if (!centreList.get(i).isFull()) {
                        index = i;
                        break;
                    }
                }
            }
        } else {
            for (int i = next+1; i < centreList.size(); i++) {
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

    // Based on implementation and current requirements centre will most likely never fill up
    public static int chosenCentreExistsAndSpaceAvailable(String centre ,List<Centre> centreList){

        int index = -1;
        if (chosenCentreExist(centre, centreList, 0) > -1 || spaceAvailable(centreList)){
            return chosenCentreExist(centre, centreList, 0);
        }
        return index;
    }

    public static int techCentreType(String courseType, List<Centre> centreList) {
        int index;
        index = chosenCentreExist("TechCentre", centreList, 0);
        if (!centreList.get(index).getCentreType().equals(courseType)) {
            index = chosenCentreExist("TechCentre", centreList, index);
            if (centreList.get(index).getCentreType().equals(courseType)) {
                return index;
            }
        }
        return index;
    }
}
