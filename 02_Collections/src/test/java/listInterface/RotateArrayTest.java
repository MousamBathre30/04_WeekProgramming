package listInterface;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void checkRoatateList(){
        List<Integer> expected = new ArrayList<>();
        expected.add(40);
        expected.add(50);
        expected.add(10);
        expected.add(20);
        expected.add(30);

        List<Integer> actual = new ArrayList<>();

        actual = RotateArray.roatatelist();
        assertEquals(actual,expected);

    }
}