package setInterface;

import java.util.*;

public class SymmetricDifferenceSet {

    public static Set<Integer> symattricDifference(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Create a copy of set1
        Set<Integer> ansSet = new HashSet<>(set1);

        // Remove common elements
        ansSet.removeAll(set2);

        // Create another copy of set2
        Set<Integer> tempSet = new HashSet<>(set2);

        // Remove common elements
        tempSet.removeAll(set1);

        // Union of both results
        ansSet.addAll(tempSet);

       return ansSet;// Expected output: [1, 2, 4, 5]
    }
    public static void main(String[] args) {
        System.out.println(symattricDifference());
    }
}
