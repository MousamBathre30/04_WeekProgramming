package listInterface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNthElementTest {

    @Test
    @DisplayName("Check for the D Result ")
    void checkNthElement(){
        String s = "D";
        String ans = FindNthElement.findNthElement();
        assertEquals(s,ans);
    }
}