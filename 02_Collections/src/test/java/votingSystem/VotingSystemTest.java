package votingSystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {

    @Test
    void testHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Gourav", "BJP");
        map.put("Mousam", "Congress");
        map.put("Manish", "AAP");

        assertEquals(3, map.size());
        assertEquals("BJP", map.get("Gourav"));
        assertEquals("Congress", map.get("Mousam"));
        assertEquals("AAP", map.get("Manish"));
    }

    @Test
    void testTreeMapSorting() {
        Map<String, String> map = new HashMap<>();
        map.put("Gourav", "BJP");
        map.put("Mousam", "Congress");
        map.put("Manish", "AAP");

        Map<String, String> map2 = new TreeMap<>();
        map2.putAll(map);

        // Verify the TreeMap is sorted by keys (alphabetical order)
        List<String> sortedKeys = new ArrayList<>(map2.keySet());
        assertEquals(Arrays.asList("Gourav", "Manish", "Mousam"), sortedKeys);
    }

    @Test
    void testLinkedHashMapOrder() {
        Map<String, String> map = new HashMap<>();
        map.put("Gourav", "BJP");
        map.put("Mousam", "Congress");
        map.put("Manish", "AAP");

        Map<String, String> map3 = new LinkedHashMap<>();
        map3.putAll(map);

        // Verify that the order is maintained as per insertion
        List<String> orderOfKeys = new ArrayList<>(map3.keySet());
        assertEquals(Arrays.asList("Gourav", "Mousam", "Manish"), orderOfKeys);
    }
}
