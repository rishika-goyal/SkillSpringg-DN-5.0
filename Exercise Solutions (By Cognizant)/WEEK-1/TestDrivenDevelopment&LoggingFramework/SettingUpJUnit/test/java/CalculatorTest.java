import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {


    @Test
    public void testAddition() {

        Calculator calculator = new Calculator();

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }


    @Test
    public void testSubtraction() {

        Calculator calculator = new Calculator();

        int result = calculator.subtract(20, 10);

        assertEquals(10, result);
    }

}