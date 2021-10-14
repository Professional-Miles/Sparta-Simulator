import com.sparta.simulator.model.Centre;
import com.sparta.simulator.model.RandomGenerator;
import com.sparta.simulator.model.TechCentre;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RandomGeneratorTest {

    @Test
    public void getRandomNumOfTrainees_ReturnsBetween0And50(){
        int rand = RandomGenerator.getRandomNumOfTrainees();
        assertTrue(rand>0 && rand <=50);
    }

    @Test
    public void generateRandomCentre_ReturnsACorrectCentre() {
        RandomGenerator randomGenerator = new RandomGenerator();
        Centre centre = randomGenerator.generateRandomCentre();
        Centre c = centre;

        assertEquals(c,centre);

    }
}
