package validateusername;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    public static boolean validateUser(){
        String username = "user_123";
        String regex = "^[a-zA-Z0-9_+-]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return username.matches(regex);
    }
    public static void main(String[] args) {



    }
}
