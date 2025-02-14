package setInterface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.beans.Transient;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FindSubsetTest {
    @Test
    @DisplayName("Check for the subset ")
    void checkSubset(){
        assertTrue(FindSubset.findSubsetTrueOrNot());
    }
}