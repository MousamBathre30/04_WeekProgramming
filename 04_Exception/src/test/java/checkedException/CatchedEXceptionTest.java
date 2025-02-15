package checkedException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatchedEXceptionTest {

    @Test
    void testCheckException(){
        String ans = "File was not present :)";
        assertEquals(ans , CatchedEXception.checkExecption());
    }

}