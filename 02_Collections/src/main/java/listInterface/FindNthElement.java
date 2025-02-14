package listInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class FindNthElement {

    public static String findNthElement(){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n = 2;
        Iterator<String> it = list.iterator();
        int count = 0;
        for(int i=1; i<n; i++){
            list.removeLast();
        }

        return list.getLast();
    }
    public static void main(String[] args) {

        System.out.println(findNthElement());

    }
}
