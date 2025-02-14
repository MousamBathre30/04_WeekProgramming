package mapInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindHighest {

    static int maximum(){
        Map<String , Integer> map = new HashMap<>();
        map.put("A",200);
        map.put("B",100);
        map.put("C",300);

        return Collections.max(map.values());

    }
    public static void main(String[] args) {
        System.out.println(maximum());
    }
}
