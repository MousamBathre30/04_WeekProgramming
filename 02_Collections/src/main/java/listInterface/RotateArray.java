package listInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RotateArray {


    public static List<Integer> roatatelist(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int number  = 2;
        Collections.rotate(list,number);
        return list;
    }
    public static void main(String[] args) {

        System.out.println(roatatelist());
    }
}
