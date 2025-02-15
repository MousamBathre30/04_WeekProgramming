package customException;

public class CustomException {
    public static void validateage(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age is not valid");
        }
    }

    public static String customexception() {
        try{
            validateage(21);
        } catch (InvalidAgeException e){
            return "Cought exception " + e.getMessage();
        }
      return "\"Access granted!\"";
    }
    public static void main(String[] args) throws InvalidAgeException {

        System.out.println(customexception());
    }
}
