package juint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListManager {


    public static ArrayList<Integer> addElement(ArrayList<Integer> list , int element){
       list.add(element);
       return list;
    }

    public static ArrayList<Integer> removeElement(ArrayList<Integer> list , int index){
      list.remove(index);
      return list;
    }

    public static int getSize(ArrayList<Integer> list){
       return list.size();
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));

        System.out.println(addElement(list , 8));
        System.out.println(addElement(list,9));

        System.out.println(removeElement(list,2));
        System.out.println(getSize(list));
        System.out.println(removeElement(list,3));
        System.out.println(getSize(list));


    }

}
