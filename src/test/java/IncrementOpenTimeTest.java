import com.sparta.simulator.centreopening.CentreGenerator;
import com.sparta.simulator.controller.IncrementOpenTime;
import com.sparta.simulator.model.Sparta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementOpenTimeTest {

    Sparta sparta = Sparta.getInstance();

    @Test
    public void incrementOpenTimeTest(){
        CentreGenerator.openCentre();
        IncrementOpenTime.hasBeenOpen();
        assertEquals(1,sparta.getCentres().get(0).getOpenTime());
    }
}