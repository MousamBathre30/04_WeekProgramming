package setInterface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceSetTest {


    @Test
    @DisplayName("Check for symattric")
    void checkForSymmatric(){
        Set<Integer> set = new HashSet<>();
        set = SymmetricDifferenceSet.symattricDifference();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,4,5));
        assertEquals(set1,set);
    }
}