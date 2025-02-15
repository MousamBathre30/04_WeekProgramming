package multipletryblock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class
MultipleCatchBlockTest {

    @Test
    void testArrayindexOutOfboundException(){
        int[] numbers = {1,2,3,4,5};
        int index = 6;
        assertEquals("Invalid index" , MultipleCatchBlock.message(numbers,index));
    }


}