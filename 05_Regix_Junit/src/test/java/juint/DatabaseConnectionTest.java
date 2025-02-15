package juint;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    @Test
    @DisplayName("Testing for Connection")
    @BeforeEach
    void testconnection(){
        assertEquals("connection Stablished",DatabaseConnection.connect());
    }

    @Test
    @DisplayName("Testing for Connection")
    @AfterEach
    void testdisconnection(){
        assertEquals("Connection closed",DatabaseConnection.disconnect());
    }


}