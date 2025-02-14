package listInterface;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

    public static List<Integer> removeDuplicate(){
           List<Integer> list = new ArrayList<>();
           list.add(3);
           list.add(1);
           list.add(2);
           list.add(2);
           list.add(3);
           list.add(4);
          List<Integer>ansList = new ArrayList<>();
        for (Integer integer : list) {
            if (!ansList.contains(integer)) {
                ansList.add(integer);
            }
        }
           return ansList;
    }
    public static void main(String[] args) {

        System.out.println(removeDuplicate());
    }
}
