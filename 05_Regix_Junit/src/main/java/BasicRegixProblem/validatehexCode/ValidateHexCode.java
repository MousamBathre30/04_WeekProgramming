package validatehexCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexCode {

    public static boolean validateHexCode(String text){
        String regex = "^#[a-fA-F0-9]{6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        return  text.matches(regex);
    }
    public static void main(String[] args) {
        String text = "#FfA500";
        System.out.println(validateHexCode(text));

    }
}
