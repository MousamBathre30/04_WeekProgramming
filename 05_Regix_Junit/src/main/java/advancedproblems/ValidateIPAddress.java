package advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static String validateIPAddress(){
        String address = "1233.1233.1222.1222";
        String regex = "\\d{4}[.]\\d{4}[.]\\d{4}[.]\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);

        return "Address is " + pattern.matcher(address).matches();
    }
    public static void main(String[] args) {
        System.out.println(validateIPAddress());
    }
}
