package extractDates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static String extractDates(String text){
        String regex ="\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder sb = new StringBuilder();
        while(matcher.find()){
            sb.append("Date found: " + matcher.group());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String text = "Important dates: 12/15/2023, 15/08/2024, and 29/02/2020";
        System.out.println(extractDates(text));
    }
}
