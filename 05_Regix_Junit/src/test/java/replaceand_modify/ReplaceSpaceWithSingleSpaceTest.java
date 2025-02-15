package replaceand_modify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceSpaceWithSingleSpaceTest {

    @Test
    void checkRelpaceMultipleSpace(){
        assertEquals("Formatted :- This is an example with multiple spaces. ",ReplaceSpaceWithSingleSpace.replaceExtraSpace());
    }

}