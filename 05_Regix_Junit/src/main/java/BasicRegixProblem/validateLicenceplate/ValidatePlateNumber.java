package validateLicenceplate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePlateNumber {
    public static boolean isValidPlate(String plateNumber) {
        String regex = "^[A-B]{2}\\d{4}$";
        return Pattern.matches(regex, plateNumber);
    }
    public static void main(String[] args) {
        String text = "AB1234";

        System.out.println(isValidPlate(text));
    }
}
