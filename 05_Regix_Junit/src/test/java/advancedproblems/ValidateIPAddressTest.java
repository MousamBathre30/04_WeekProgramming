package advancedproblems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateIPAddressTest {

    @Test
    @DisplayName("Test for the IPAddress")
    void testIPAddress(){
        assertEquals("Address is true",ValidateIPAddress.validateIPAddress());
    }

}