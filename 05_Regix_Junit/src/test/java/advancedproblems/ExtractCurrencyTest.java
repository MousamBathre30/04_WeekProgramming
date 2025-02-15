package advancedproblems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractCurrencyTest {

    @Test
    @DisplayName("Test for the currency")
    void testCurrencyextracter(){
        assertEquals("Currency found: $45.99\n" +
                "Currency found: 10.50\n",ExtractCurrency.extractCurrency());
    }
}