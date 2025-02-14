package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class WordCountFrequency {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String str = "Hello java, hello java";
        StringBuilder word = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                map.put(word.toString().toLowerCase(),map.getOrDefault(word.toString().toLowerCase(),0)+1);
                word = new StringBuilder();
            }else if(str.charAt(i) != '!' && str.charAt(i) != '@' && str.charAt(i) != ','){
                word.append(str.charAt(i));
            }
        }
        System.out.println(map);
        System.out.println(str.length());


    }
}
