package validateusername;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUserNameTest {

    @Test
    @DisplayName("For the username")
    void testUsername(){
        assertTrue(ValidateUserName.validateUser());
    }
}