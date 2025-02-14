package queueInterface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class CircularBufferTest {

    @Test
    void testInsertAndRetrieve() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, buffer.getBufferContents(), "Buffer should contain [1, 2, 3]");
    }

    @Test
    void testOverwriteOldestElement() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4); // Overwrites oldest (1)

        int[] expected = {2, 3, 4};
        assertArrayEquals(expected, buffer.getBufferContents(), "Buffer should contain [2, 3, 4]");
    }

    @Test
    void testInsertLessThanCapacity() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);

        int[] expected = {1, 2};
        assertArrayEquals(expected, buffer.getBufferContents(), "Buffer should contain [1, 2]");
    }

    @Test
    void testInsertMoreThanCapacity() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4);
        buffer.insert(5);

        int[] expected = {3, 4, 5}; // Last 3 elements should remain
        assertArrayEquals(expected, buffer.getBufferContents(), "Buffer should contain [3, 4, 5]");
    }
}
