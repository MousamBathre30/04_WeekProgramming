package validateLicenceplate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidatePlateNumberTest {

    @Test
    public void testValidPlates() {
        assertTrue(ValidatePlateNumber.isValidPlate("AB1234"));
        assertTrue(ValidatePlateNumber.isValidPlate("BA5678"));
    }

    @Test
    public void testInvalidPlates() {
        assertFalse(ValidatePlateNumber.isValidPlate("C1234"));  // Invalid first letters
        assertFalse(ValidatePlateNumber.isValidPlate("AB12A4")); // Contains a letter in the number part
        assertFalse(ValidatePlateNumber.isValidPlate("A1234"));  // Only one letter at the start
        assertFalse(ValidatePlateNumber.isValidPlate("AB123"));  // Only three digits
        assertFalse(ValidatePlateNumber.isValidPlate("1234AB")); // Wrong order
        assertFalse(ValidatePlateNumber.isValidPlate("AB12345")); // Extra digit
    }
}
