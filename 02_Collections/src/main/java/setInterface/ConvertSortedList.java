package setInterface;

import java.util.*;

public class ConvertSortedList {

    static Set<Integer> convertSortedList(){
        Set<Integer> set = new HashSet<>(Arrays.asList(1,5,2,3));
        Set<Integer> set1 = new TreeSet<>();

        set1.addAll(set);
        return set1;
    }
    public static void main(String[] args) {
       convertSortedList();

    }
}
