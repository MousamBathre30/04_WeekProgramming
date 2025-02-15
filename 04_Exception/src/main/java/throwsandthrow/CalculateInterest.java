package throwsandthrow;

public class CalculateInterest {
    public static String calculateInterest(double amount , double rate , int year) throws IllegalArgumentException {

        try{
            if(amount < 0 || rate < 0){
                throw new IllegalArgumentException("Invalid input:  and rate must be positive");
            }

            double interest = (amount * rate * year)/100;
            System.out.println(interest);
        } catch(IllegalArgumentException e){
            return "Invalid input: Amount and rate must be positive";
        }
        return "";
    }
    static void methodWithThrows() throws IllegalArgumentException {
        throw new IllegalArgumentException("Invalid input:  and rate must be positive");
    }


    public static void main(String[] args) throws  IllegalArgumentException{

        double amount = 1000;
        double rate = 1;
        int year = 3;
        System.out.println(calculateInterest(amount , rate , year));
    }
}
