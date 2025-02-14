package mapInterface;

import org.junit.jupiter.api.Test;
import setInterface.FindSubset;

import static org.junit.jupiter.api.Assertions.*;

class FindHighestTest {

    @Test
    void testMaximum(){
        assertEquals(300,FindHighest.maximum());
    }
}
