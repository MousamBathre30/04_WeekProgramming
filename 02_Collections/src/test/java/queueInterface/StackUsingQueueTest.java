package queueInterface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueueTest {

    @Test
    @DisplayName("For the push")
    void checkPushOperation(){
        StackUsingQueue s1 = new StackUsingQueue();
        int number= 5;
        s1.push(number);
        int val = 0;
        assertEquals(val+1,s1.getSize());
    }
    @Test
    @DisplayName("For the pop")
    void checkPopOperation(){
        StackUsingQueue s1 = new StackUsingQueue();
        int number= 5;
        s1.pop();
        int val = 0;
        assertEquals(val+1,s1.getSize());
    }

}