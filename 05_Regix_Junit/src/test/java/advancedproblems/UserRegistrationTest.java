package advancedproblems;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("JohnDoe", "johndoe@example.com", "password123"));
    }

    @Test
    public void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "johndoe@example.com", "password123"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser(null, "johndoe@example.com", "password123"));
    }

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "invalid-email", "password123"));

        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "", "password123"));
    }

    @Test
    public void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "johndoe@example.com", "123"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "johndoe@example.com", ""));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "johndoe@example.com", null));
    }
}
