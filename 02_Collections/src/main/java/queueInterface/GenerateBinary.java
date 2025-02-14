package queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {

    public static String  generatebinary(int n){
        StringBuilder  str = new StringBuilder();

        while(n > 0) {
            if (n % 2 == 0) {
                str.append("0");
                n = n / 2;
            } else {
                str.append("1");
                n = n / 2;
            }
        }
        str.reverse();
        return str.toString();
    }
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        int n = 5;
        String str = "";
        for(int i=1; i<=5; i++) {
            str =  generatebinary(i);
            queue.add(str);
        }

        System.out.println(queue);
    }
}
