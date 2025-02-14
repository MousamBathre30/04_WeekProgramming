package setInterface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedListTest {

    @Test
    @DisplayName("Check for the sorted list ")
    void CheckfortheSortedList(){
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,5));
        assertEquals(set,ConvertSortedList.convertSortedList());
    }

}