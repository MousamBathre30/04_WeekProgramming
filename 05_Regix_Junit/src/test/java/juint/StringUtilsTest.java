package juint;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("Testing for the reverse")
    void testReverseMEthod(){
        assertEquals("naman",StringUtils.reverse("naman"));
    }

    @Test
    @DisplayName("Testing for the isPalindreom")
    void testIsPalindrom(){
        assertTrue(StringUtils.isPalindrome("naman"));
    }

    @Test
    @DisplayName("Testing for the toUpperCase")
    void testToUpperCase(){
        assertEquals("NAMAN", StringUtils.toUppercase("naman"));
    }

}