package setInterface;

import java.util.*;

public class FindSubset {

    static boolean findSubsetTrueOrNot(){
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> subset = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> tempSet = new HashSet<>();

        boolean bool = (set.containsAll(subset));
        return bool;
    }
    public static void main(String[] args) {
        System.out.println( findSubsetTrueOrNot());
    }
}
