package setInterface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class twoSetAreEqualTest {

    @Test
    @DisplayName("Check for the set ")
    void checkForSet(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));

        assertTrue(set1.equals(set2));
    }
}