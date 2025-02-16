package annotation.exercise;

import java.util.ArrayList;

public class PracticeSuppressUnchekedWarning {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList arr = new ArrayList();
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
    }
}
