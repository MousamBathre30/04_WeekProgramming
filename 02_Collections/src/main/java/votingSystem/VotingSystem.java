package votingSystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {

    public static void main(String[] args) {

        Map<String , String> map = new HashMap<>();
        map.put("Gourav" , "BJP");
        map.put("Mousam" , "Congress");
        map.put("Manish", "AAP");

        System.out.println(map);

        System.out.println("In sorted order");
        Map<String , String> map2 = new TreeMap<>();
        map2.putAll(map);

        System.out.println(map2);

        System.out.println("Linked Hash Set for mantainig the order ");
        Map<String , String > map3 = new LinkedHashMap<>();
        map3.putAll(map);

        System.out.println(map3);

    }
}
