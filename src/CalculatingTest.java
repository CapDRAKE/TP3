import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;

public class CalculatingTest {

	//en premier lieu un test d'addition
    @Test
    public void testAddition() {
        Calculating calc = new Calculating();
        assertEquals("+ of 1, 2, 4 should be 7", 7, (int) calc.calcul(Arrays.asList(1, 2, 4), '+').get(calc.calcul(Arrays.asList(1, 2, 4), '+').size() - 1));
    }

    //ensuite un test de multiplication
    @Test
    public void testMultiplication() {
        Calculating calc = new Calculating();
        assertEquals("* of 1, 2, 5 should be 10", 10, (int) calc.calcul(Arrays.asList(1, 2, 5), '*').get(calc.calcul(Arrays.asList(1, 2, 5), '*').size() - 1));
    }

    //on test la sortie du list vide
    @Test
    public void testEmptyList() {
        Calculating calc = new Calculating();
        assertTrue("empty list should return empty results list", calc.calcul(Collections.emptyList(), '+').isEmpty());
    }

    //on test l'ajout d'input null qui devrait sortie une list vide 
    @Test
    public void testNullInput() {
        Calculating calc = new Calculating();
        assertTrue("Null input should return empty results list", calc.calcul(null, '+').isEmpty());
    }
}
