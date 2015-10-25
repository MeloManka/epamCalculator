import com.golovchik.simpleCalculator.Calculator;
import org.junit.Test;
import static junit.framework.Assert.*;

public class CalculatorTest {
    @Test
    public void testCalculatorAdd() throws Exception {
        Calculator c = new Calculator();

        assertEquals(9.0, c.add(5.0, 4.0));
    }
    @Test
    public void testCalculatorSub() throws Exception {
        Calculator c = new Calculator();

        assertEquals(1.0, c.sub(5.0, 4.0));
    }
    @Test
    public void testCalculatorMul() throws Exception {
        Calculator c = new Calculator();

        assertEquals(8.0, c.mul(2.0, 4.0));
    }
    @Test
    public void testCalculatorDiv() throws Exception {
        Calculator c = new Calculator();

        assertEquals(3.0, c.div(6.0, 2.0));
    }
}
