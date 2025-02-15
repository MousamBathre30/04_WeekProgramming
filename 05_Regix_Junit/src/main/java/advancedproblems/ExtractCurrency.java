package advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {

    public static String extractCurrency(){
        String text = "The price is $45.99, and the discount is 10.50.";
        String regex ="[$]?[0-9]+[.][0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder ans = new StringBuilder();
        while(matcher.find()){
            ans.append("Currency found: " + matcher.group() + "\n");
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(extractCurrency());
    }
}
