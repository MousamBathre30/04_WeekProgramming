package advancedproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    public void testValidDate() {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }

    @Test
    public void testInvalidDate() {
        assertEquals("Invalid Date", DateFormatter.formatDate("2023-13-25")); // Invalid month
        assertEquals("Invalid Date", DateFormatter.formatDate("abcd-ef-gh")); // Nonsense input
        assertEquals("Invalid Date", DateFormatter.formatDate("2023/12/25")); // Wrong format
        assertEquals("Invalid Date", DateFormatter.formatDate("")); // Empty input
       // assertEquals("Invalid Date", DateFormatter.formatDate(null)); // Null input
    }
}
