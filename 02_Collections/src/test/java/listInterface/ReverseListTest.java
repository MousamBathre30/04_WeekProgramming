package listInterface;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

     @Test
     void checkRevereListUsingArrayList(){

         //actual
         List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         List<Integer> reversedList = ReverseList.reverseListUsingArrayList(list);
         // expected
         List<Integer> expected = new ArrayList<>();

         expected.add(5);
         expected.add(4);
         expected.add(3);
         expected.add(2);
         expected.add(1);

         assertEquals(expected,reversedList);
     }
    @Test
    public void testReverseListUsingLinkedList() {
        List<Integer> list = new LinkedList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

       List<Integer>reverseLinkedList =  ReverseList.reverseListUsingLinkedList(list);

        List<Integer> expected = new LinkedList<>();
        expected.add(10);
        expected.add(9);
        expected.add(8);
        expected.add(7);
        expected.add(6);

        assertEquals(expected, reverseLinkedList);
    }
}