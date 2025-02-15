package advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static String validatePassword(String password) {

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(password);

        while (matcher.find()) {
            return "Valid " + matcher.matches();
        }
        return "Not Valid";
    }


    public static void main(String[] args) {
        String password = "Mousambathre@123";
        System.out.println(validatePassword(password));

    }
}

