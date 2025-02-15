package advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {

    public static String validateSSN(){
        String text = "My SSN is 123-45-6789.";
        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            return matcher.group() + "  is Valid";
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(validateSSN());
    }
}
