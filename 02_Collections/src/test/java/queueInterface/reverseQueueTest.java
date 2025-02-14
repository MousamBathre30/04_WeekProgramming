package queueInterface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class reverseQueueTest {


    @Test
    @DisplayName("Check for reverse ")
    void checkReverseQueue(){
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(5,4,3,2,1));
        Queue<Integer> actual = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        assertEquals(queue , ReverseQueue.reverseQueue(actual));
    }

}