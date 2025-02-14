package mapInterface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapInverterTest {

    @Test
    void testInvertMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(1, Arrays.asList("A", "C"));
        expectedOutput.put(2, Collections.singletonList("B"));

        assertEquals(expectedOutput, MapInverter.invertMap(inputMap));
    }

    @Test
    void testInvertMapWithEmptyInput() {
        Map<String, Integer> inputMap = new HashMap<>();
        Map<Integer, List<String>> expectedOutput = new HashMap<>();

        assertEquals(expectedOutput, MapInverter.invertMap(inputMap));
    }

    @Test
    void testInvertMapWithUniqueValues() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("X", 10);
        inputMap.put("Y", 20);
        inputMap.put("Z", 30);

        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(10, Collections.singletonList("X"));
        expectedOutput.put(20, Collections.singletonList("Y"));
        expectedOutput.put(30, Collections.singletonList("Z"));

        assertEquals(expectedOutput, MapInverter.invertMap(inputMap));
    }

    @Test
    void testInvertMapWithAllSameValues() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("M", 5);
        inputMap.put("N", 5);
        inputMap.put("O", 5);

        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(5, Arrays.asList("M", "N", "O"));

        assertEquals(expectedOutput, MapInverter.invertMap(inputMap));
    }
}
