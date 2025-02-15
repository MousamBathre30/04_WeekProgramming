package extractDates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractDatesTest {

    @Test
    void testExtractDatesTest(){
        String text = "Important dates: 12/15/2023, 15/08/2024, and 29/02/2020";
        assertEquals("Date found: 12/15/2023Date found: 15/08/2024Date found: 29/02/2020",ExtractDates.extractDates(text));
    }
}