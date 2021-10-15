import com.sparta.simulator.centreopening.BootCampCreator;
import com.sparta.simulator.centreopening.CentreGenerator;
import com.sparta.simulator.centreopening.TechCentreCreator;
import com.sparta.simulator.centreopening.TrainingHubCreator;
import com.sparta.simulator.maketrainee.TraineeGenerator;
import com.sparta.simulator.model.Sparta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CentreOpeningTest {

    @Test
    public void centreOpeningTest(){
        Sparta sparta = Sparta.getInstance();
        CentreGenerator.openCentre();
        assertTrue(sparta.getOpenCentres()> 0 );
    }

    @Test
    public void bootCampOpeningTest(){
        Sparta sparta = Sparta.getInstance();
        BootCampCreator.openBootCamp();
        assertTrue(sparta.getBootCampCount()> 0 );
    }

    @Test
    public void techCentreOpeningTest(){
        Sparta sparta = Sparta.getInstance();
        TechCentreCreator.openTechCentre();
        assertTrue( sparta.getJavaTechCentres() > 0 || sparta.getBusinessTechCentres() > 0|| sparta.getCSharpTechCentres() > 0 ||
                sparta.getDataTechCentres() > 0 || sparta.getDevopsTechCentres()>0) ;
    }

    @Test
    public void TrainingHubOpeningTest(){
        Sparta sparta = Sparta.getInstance();
        TrainingHubCreator.openTrainingHub();
        assertTrue( sparta.getTrainingHubs()>0) ;
    }
}
