package listInterface;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {

    public static Map<String , Integer> findfrequency(){
        Map<String , Integer> map = new HashMap<>();

        String[] array = {"apple", "banana", "apple", "orange"};

        for(String str : array){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        // find the frequency
        System.out.println(findfrequency());

    }
}
