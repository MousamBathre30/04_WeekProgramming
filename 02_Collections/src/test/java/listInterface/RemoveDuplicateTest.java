package listInterface;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {

    @Test
    void checkRemoveDuplicate(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(3,1,2,4));
        List<Integer> anslist = new ArrayList<>();
        anslist = RemoveDuplicate.removeDuplicate();
        assertEquals(anslist,expected);

    }
}