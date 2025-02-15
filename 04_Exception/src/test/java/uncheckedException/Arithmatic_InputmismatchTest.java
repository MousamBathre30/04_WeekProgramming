package uncheckedException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arithmatic_InputmismatchTest {


    @Test
    void testArithmaticException(){
        int a = 10;
        int b = 0;
        assertEquals("Arithmatic Exception catchght :) / by zero",Arithmatic_Inputmismatch.arthmaticInputmismatchException(a,b));
    }

}