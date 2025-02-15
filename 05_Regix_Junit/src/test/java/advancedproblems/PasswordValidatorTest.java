package advancedproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testPasswordValidate(){
        String password = "Mousambathre@123";
        assertEquals("Valid true", PasswordValidator.validatePassword(password));
    }
    @Test
    void testPasswordValidateForFalse(){
        String password = "Mo@123";
        assertEquals("Not Valid", PasswordValidator.validatePassword(password));
    }
}