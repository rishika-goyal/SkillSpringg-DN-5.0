import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    Calculator calculator;


    // Setup method
    @Before
    public void setUp() {

        calculator = new Calculator();

        System.out.println("Setup completed");
    }


    @Test
    public void testAddition() {


        // Arrange
        int a = 10;
        int b = 20;


        // Act
        int result = calculator.add(a, b);


        // Assert
        assertEquals(30, result);

    }


    @Test
    public void testMultiplication() {


        // Arrange
        int a = 5;
        int b = 4;


        // Act
        int result = calculator.multiply(a, b);


        // Assert
        assertEquals(20, result);

    }



    // Teardown method
    @After
    public void tearDown() {

        calculator = null;

        System.out.println("Cleanup completed");
    }
  }