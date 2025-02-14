package queueInterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryTest {


    @Test
    void checkBinaryConversion(){

            assertEquals("1", GenerateBinary.generatebinary(1));
            assertEquals("10", GenerateBinary.generatebinary(2));
            assertEquals("11", GenerateBinary.generatebinary(3));
            assertEquals("100", GenerateBinary.generatebinary(4));
            assertEquals("101", GenerateBinary.generatebinary(5));

    }
}