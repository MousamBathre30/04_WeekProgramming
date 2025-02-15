package advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {

    public static  String checkForMasterCard(String address){
        String regex2 = "^4[0-9]{15}";
        Pattern pattern = Pattern.compile(regex2);

        Matcher matcher = pattern.matcher(address);

        return  "Cradit card is from MasterCard is " + pattern.matcher(address).matches();

    }
    public static String checkForVisaCard(String address){
        String regex2 = "^5[0-9]{15}";
        Pattern pattern = Pattern.compile(regex2);

        Matcher matcher = pattern.matcher(address);

        return "Cradit card is from Visa is " + pattern.matcher(address).matches();
    }
    public static void main(String[] args) {

        String address = "4123456789076543";
        System.out.println(checkForMasterCard(address));
        System.out.println(checkForVisaCard(address));



    }
}
