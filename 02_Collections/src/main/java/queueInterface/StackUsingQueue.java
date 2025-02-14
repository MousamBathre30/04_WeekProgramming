package queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
   int size = 0;
    public void push(int n) {
        queue1.add(n);
        size++;
    }

    public int getSize(){
        return size;
    }

    public void pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        // Print the top element before removing it
        System.out.println(queue1.poll());

        // Swap queues to maintain order
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;


    }

    public void top() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        // Print the top element without removing it
        int topElement = queue1.peek();
        System.out.println(topElement);

        // Move top element back to queue2
        queue2.add(queue1.poll());

        // Swap queues to maintain order
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.top(); // Should print 3

    }
}
