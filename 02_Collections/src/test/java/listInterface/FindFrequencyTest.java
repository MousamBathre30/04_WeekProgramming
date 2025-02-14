package listInterface;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindFrequencyTest {

    @Test
    void checkFrquency(){
        Map<String , Integer> expectedMap = new HashMap<>();
        Map<String , Integer> actualMap = new HashMap<>();
        actualMap.put("banana" , 1);
        actualMap.put("apple" , 2);
        actualMap.put("orange" , 1);
        expectedMap = FindFrequency.findfrequency();
        assertEquals(actualMap,expectedMap);
    }
}