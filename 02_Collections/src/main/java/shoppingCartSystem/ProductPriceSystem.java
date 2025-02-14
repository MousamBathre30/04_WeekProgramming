package shoppingCartSystem;

import java.util.*;

public class ProductPriceSystem {

    public static void main(String[] args) {
        // HashMap to store product prices
        Map<String, Double> priceMap = new HashMap<>();
        priceMap.put("Apple", 1.5);
        priceMap.put("Banana", 0.8);
        priceMap.put("Cherry", 2.0);
        priceMap.put("Date", 3.0);

        // LinkedHashMap to maintain the order of items added
        Map<String, Double> orderedMap = new LinkedHashMap<>();
        orderedMap.putAll(priceMap);

        // TreeMap to display items sorted by price
        // We use a custom comparator to sort by value (price)
        Map<String, Double> sortedMap = new TreeMap<>(Comparator.comparing(priceMap::get));
        sortedMap.putAll(priceMap);

        // Display results
        System.out.println("Original Product Prices (using HashMap):");
        System.out.println(priceMap);

        System.out.println("\nOrdered Products (using LinkedHashMap):");
        System.out.println(orderedMap);

        System.out.println("\nProducts Sorted by Price (using TreeMap):");
        System.out.println(sortedMap);
    }
}
