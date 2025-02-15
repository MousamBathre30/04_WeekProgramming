package extractlinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractLinkes {

    public static String extractLinks(String text){
        String regex = "https?://(www\\.)?([a-zA-Z0-9.-]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            return "Domains:  "+ matcher.group();
        }
        return "";
    }
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        System.out.println(extractLinks(text));
    }
}
