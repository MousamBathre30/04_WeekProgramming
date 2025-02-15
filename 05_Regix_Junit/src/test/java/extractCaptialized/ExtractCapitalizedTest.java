package extractCaptialized;

import extractDates.ExtractDates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractCapitalizedTest {
    @Test
    void testextractCaptilized(){
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        assertEquals("Word found: The Word found: Eiffel Word found: Tower Word found: Paris Word found: Statue Word found: Liberty Word found: New Word found: York ", ExtractCapitalized.extractCaptilized(text));
    }
}