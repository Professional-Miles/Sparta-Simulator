package com.sparta.simulator.centreopening;

import com.sparta.simulator.model.Sparta;
import com.sparta.simulator.model.TechCentre;

public class TechCentreCreator {

    public static void openTechCentre() {
        Sparta sparta = Sparta.getInstance();

        TechCentre techCentre = new TechCentre();
        sparta.getCentres().add(techCentre);
        sparta.incrementTechCentres();
        sparta.incrementOpenCentres();

        switch (techCentre.getCourseType()) {
            case "java":
                sparta.incrementJavaTechCentres();
                break;
            case "cSharp":
                sparta.incrementCSharpTechCentres();
                break;
            case "data":
                sparta.incrementDataTechCentres();
                break;
            case "devops":
                sparta.incrementDevopsTechCentres();
                break;
            case "business":
                sparta.incrementBusinessTechCentres();
                break;
        }

    }


}
