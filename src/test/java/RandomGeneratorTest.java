import com.sparta.simulator.controller.RandomGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RandomGeneratorTest {

    @Test
    public void getRandomNumOfTrainees_ReturnsBetween0And50(){
        int rand = RandomGenerator.getRandomNumOfTrainees();
        assertTrue(rand>0 && rand <=50);
    }

    @Test
    public void generateRandomCentreThree_ReturnsACorrectCentreString() {
        String generatedRandomCentre = RandomGenerator.generateRandomCentreThree();
        String matchedString = "";

        if ("TechCentre".equals(generatedRandomCentre) || "TrainingHub".equals(generatedRandomCentre) || "BootCamp".equals(generatedRandomCentre)) {
            matchedString = generatedRandomCentre;
        }

        assertEquals(matchedString,generatedRandomCentre);
    }

    @Test
    public void generateRandomCentreTwo_ReturnsACorrectCentreString() {
        String generatedRandomCentre = RandomGenerator.generateRandomCentreThree();
        String matchedString = "";

        if ("TechCentre".equals(generatedRandomCentre) || "TrainingHub".equals(generatedRandomCentre)) {
            matchedString = generatedRandomCentre;
        }

        assertEquals(matchedString,generatedRandomCentre);

    }

    @Test
    public void generateRandomCentreTwo_DoesNotReturnAnIncorrectString() {
        String generatedRandomCentre = RandomGenerator.generateRandomCentreTwo();
        String expectedWrongString = "randomstring";

        assertNotEquals(expectedWrongString,generatedRandomCentre);
    }

    @Test
    public void generateRandomCentreThree_DoesNotReturnAnIncorrectString() {
        String generatedRandomCentre = RandomGenerator.generateRandomCentreThree();
        String expectedWrongString = "beststringever";

        assertNotEquals(expectedWrongString,generatedRandomCentre);
    }

}
