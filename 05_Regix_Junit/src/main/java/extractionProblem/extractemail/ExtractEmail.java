package extractemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static String validateExtractEmail(String text){
        String regex = "[a-zA-Z]+@[a-zA-Z0-9]+.[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        StringBuilder sb = new StringBuilder();

        while(matcher.find()){
            sb.append("Emails:  "+ matcher.group());

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String text = " Contact us at mousambathre@gmail.com support@example.com and info@company.org";
        System.out.println(validateExtractEmail(text));
    }
}
