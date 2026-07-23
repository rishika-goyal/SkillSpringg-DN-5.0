import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        Calculator calculator = new Calculator();

        // Assert equals
        assertEquals(5, calculator.add(2,3));

        // Assert true
        assertTrue(calculator.isPositive(10));

        // Assert false
        assertFalse(calculator.isPositive(-5));

        // Assert null
        String value = null;
        assertNull(value);

        // Assert not null
        Calculator c = new Calculator();
        assertNotNull(c);

    }
}