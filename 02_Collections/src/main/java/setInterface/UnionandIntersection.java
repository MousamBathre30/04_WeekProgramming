package setInterface;

import java.util.*;

public class UnionandIntersection {

    public static void unionSet(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        set2.addAll(set1); // Union
        System.out.println(set2);
    }
    public static void interSectionSet(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
        set1.retainAll(set2);
        System.out.println(set1); // intersection
    }
    public static void main(String[] args) {

        unionSet();
        interSectionSet();

    }
}
