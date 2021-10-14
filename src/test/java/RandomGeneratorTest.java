import com.sparta.simulator.model.RandomGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RandomGeneratorTest {

    @Test
    public void getRandomNumOfTrainees_ReturnsBetween0And50(){
        int rand = RandomGenerator.getRandomNumOfTrainees();
        assertTrue(rand>0 && rand <=50);
    }
}
