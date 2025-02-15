package TestJunit;

import juint.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }
    @Test
    @DisplayName("Test addition")
    void testAdd(){
        assertEquals(5,calculator.add(2,3));
    }
    @Test
    @DisplayName("Test divide by zero")
    void testDividebyZero(){
        assertThrows(ArithmeticException.class,()->calculator.divide(10,0));
    }
    @Test
    void testAssertions(){
        // Basic Asssertion
        assertEquals(4,calculator.add(2,2));
        // Boolean Condition
        assertTrue(calculator.isEven(4));
        // Grounped assertions (all are checked)
        assertAll(
                ()->assertEquals(6,calculator.add(3,3)),
                ()->assertThrows(ArithmeticException.class,()->calculator.divide(10,0))
        );
    }

    @Test
    void testException(){
        // Verify exception is thrown

        Exception exception = assertThrows(
                ArithmeticException.class,()->calculator.divide(10,0)
        );
        assertEquals("/ by zero",exception.getMessage());
    }

}