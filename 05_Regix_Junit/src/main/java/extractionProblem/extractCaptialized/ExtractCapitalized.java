package extractCaptialized;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalized {
    public static String extractCaptilized(String text){
        String regex = "[A-Z][a-z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append("Word found: " + matcher.group() + " ");
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println(extractCaptilized(text));
    }
}
