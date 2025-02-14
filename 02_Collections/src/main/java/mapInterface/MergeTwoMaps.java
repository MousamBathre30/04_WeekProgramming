package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {

   static Map<String , Integer> mergeTwomap(){
       Map<String , Integer> map1 = new HashMap<>();
       map1.put("A",4);
       map1.put("B",3);

       Map<String , Integer> map2 = new HashMap<>();
       map2.put("C",4);
       map2.put("D",3);

       map2.putAll(map1);
      return  map2;
    }
    public static void main(String[] args) {
        System.out.println(mergeTwomap());

    }
}
