package shoppingCartSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductPriceSystemTest {

    @Test
    void testHashMap() {
        Map<String, Double> priceMap = new HashMap<>();
        priceMap.put("Apple", 1.5);
        priceMap.put("Banana", 0.8);
        priceMap.put("Cherry", 2.0);
        priceMap.put("Date", 3.0);

        // Test HashMap contains expected size and price for specific products
        assertEquals(4, priceMap.size());
        assertEquals(1.5, priceMap.get("Apple"));
        assertEquals(0.8, priceMap.get("Banana"));
        assertEquals(2.0, priceMap.get("Cherry"));
        assertEquals(3.0, priceMap.get("Date"));
    }

    @Test
    void testLinkedHashMapOrder() {
        Map<String, Double> priceMap = new HashMap<>();
        priceMap.put("Apple", 1.5);
        priceMap.put("Banana", 0.8);
        priceMap.put("Cherry", 2.0);
        priceMap.put("Date", 3.0);

        Map<String, Double> orderedMap = new LinkedHashMap<>();
        orderedMap.putAll(priceMap);

        // Test if the LinkedHashMap maintains insertion order
        List<String> expectedOrder = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        List<String> actualOrder = new ArrayList<>(orderedMap.keySet());
        assertEquals(expectedOrder, actualOrder);
    }

    @Test
    void testTreeMapSorting() {
        Map<String, Double> priceMap = new HashMap<>();
        priceMap.put("Apple", 1.5);
        priceMap.put("Banana", 0.8);
        priceMap.put("Cherry", 2.0);
        priceMap.put("Date", 3.0);

        Map<String, Double> sortedMap = new TreeMap<>(Comparator.comparing(priceMap::get));
        sortedMap.putAll(priceMap);

        // Test if the TreeMap sorts by price
        List<String> expectedSortedOrder = Arrays.asList("Banana", "Apple", "Cherry", "Date");
        List<String> actualSortedOrder = new ArrayList<>(sortedMap.keySet());
        assertEquals(expectedSortedOrder, actualSortedOrder);
    }
}
