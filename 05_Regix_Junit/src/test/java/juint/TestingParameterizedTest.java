package juint;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestingParameterizedTest {


    @ParameterizedTest
    @ValueSource(ints={2,4,6,7,9})
    void testISeven(int num){
        assertTrue(num % 2 == 0 || num % 2 == 1);
    }
}