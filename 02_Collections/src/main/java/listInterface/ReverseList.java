package listInterface;

import java.util.*;

public class ReverseList {

    public static List<Integer>  reverseListUsingArrayList(List<Integer> list){
        // create the new list
        List<Integer> list2 = new ArrayList<>();
        for(int i=list.size()-1; i>=0; i--){
            int val = list.get(i);
            list2.add(val);
        }

       return  list2;

    }

    public static List<Integer> reverseListUsingLinkedList(List<Integer> list3){
        List<Integer> list4 = new ArrayList<>();
        for(int i=list3.size()-1; i>=0; i--){
            int val = list3.get(i);
            list4.add(val);
        }

       return list4;
    }
    public static void main(String[] args) {
        // reverse the list without using reverse method
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // we have to reverse the list
        System.out.println(list);
        // [1,2,3,4,5]
        System.out.println(reverseListUsingArrayList(list));

        List<Integer> list3 = new LinkedList<>();
        list3.add(6);
        list3.add(7);
        list3.add(8);
        list3.add(9);
        list3.add(10);

        System.out.println(list3);
        // [6,7,8,9,10]

        System.out.println(reverseListUsingLinkedList(list3));
    }
}
