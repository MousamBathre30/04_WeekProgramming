package advancedproblems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSSNTest {

    @Test
    @DisplayName("Test for the ssn")
    void testValidateSSN(){
        assertEquals("123-45-6789  is Valid",ValidateSSN.validateSSN());
    }
}