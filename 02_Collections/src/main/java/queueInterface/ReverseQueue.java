package queueInterface;

import java.lang.reflect.Array;
import java.util.*;

public class ReverseQueue {

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Queue<Integer> reversedQueue = new LinkedList<>();
        List<Integer> tempList = new ArrayList<>();

        // Step 1: Dequeue elements and store them in a list
        while (!queue.isEmpty()) {
            tempList.add(queue.poll());
        }

        // Step 2: Enqueue elements back in reverse order
        for (int i = tempList.size() - 1; i >= 0; i--) {
            reversedQueue.add(tempList.get(i));
        }

        return reversedQueue;
    }
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverseQueue(queue));
    }
}
