package throwsandthrow;

import static org.junit.jupiter.api.Assertions.*;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculateInterestTest {

    @Test
    void testValidInterestCalculation() {
        assertEquals("", CalculateInterest.calculateInterest(1000, 5, 2)); // Valid case, returns empty string
    }

    @Test
    void testNegativeAmount() {
        assertEquals("Invalid input: Amount and rate must be positive", CalculateInterest.calculateInterest(-1000, 5, 2));
    }

    @Test
    void testNegativeRate() {
        assertEquals("Invalid input: Amount and rate must be positive", CalculateInterest.calculateInterest(1000, -5, 2));
    }

    @Test
    void testMethodWithThrows() {
        assertThrows(IllegalArgumentException.class, CalculateInterest::methodWithThrows);
    }
}
