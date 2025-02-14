package setInterface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UnionandIntersectionTest {

    @Test
    @DisplayName("Check for Union")
    void checkSetUnion(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        set2.addAll(set1); // Union
        Set<Integer> ansset = new HashSet<>(Arrays.asList(1,2,3,4,5));
        assertEquals(ansset , set2);

    }
    @Test
    @DisplayName("Check for Intersection")
    void checkSetIntersection(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        set2.retainAll(set1); // Union
        Set<Integer> ansset = new HashSet<>(Arrays.asList(3));
        assertEquals(ansset , set2);

    }


}