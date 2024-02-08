import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {
    public MathUtils mu;

    @Before
    public void setUp() {
        mu = new MathUtils();
    }

    @After
    public void tearDown() {
        mu = null;
    }

    @Test
    public void testAdd() {
        int result = mu.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = mu.subtract(11, 4);
        assertEquals(7, result);
    }

    @Test
    public void testMultiply() {
        int result = mu.multiply(7, 2);
        assertEquals(14, result);
    }

    @Test
    public void testDivideByNonZero() {
        double result = mu.divide(8, 2);
        assertEquals(4.0, result, 0.001); // 3rd argument is delta for double comparison
    }

    @Test
    public void testDivideByZero() {
        double result = mu.divide(8, 0);
        assertEquals(-1.0, result, 0.001);
    }
}
