package customException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomExceptionTest {

    @Test
    void testValidAge() {
        assertEquals("\"Access granted!\"", CustomException.customexception());
    }

    @Test
    void testInvalidAge() {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            CustomException.validateage(16);
        });

        assertEquals("Age is not valid", exception.getMessage());
    }
}
