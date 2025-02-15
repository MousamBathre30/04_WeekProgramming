package finalyblocked;

import java.util.Scanner;

public class FinalyBlockedExecuted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the number");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int division = a / b ;

        }catch (ArithmeticException e){
            System.out.println("Divide by zero is not allow");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\"Operation completed\"");
        }
    }
}
