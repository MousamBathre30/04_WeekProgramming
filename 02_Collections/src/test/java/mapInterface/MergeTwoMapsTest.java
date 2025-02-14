package mapInterface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoMapsTest {

    @Test
    @DisplayName("For the merge map")
    void CheckMergeTwoMapsTest(){
        Map<String , Integer> map = new HashMap<>();
        map.put("A",4);
        map.put("B",3);
        map.put("C",4);
        map.put("D",3);

        assertEquals(map , MergeTwoMaps.mergeTwomap());


    }
}