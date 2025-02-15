package juint;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingExceptionHandlingTest {

    @Test
    @DisplayName("Test divide by zero")
    void testDividebyZero() throws ArithmeticException{
        assertThrows(ArithmeticException.class,()->{
            int result = 10/0;
        });
    }
}