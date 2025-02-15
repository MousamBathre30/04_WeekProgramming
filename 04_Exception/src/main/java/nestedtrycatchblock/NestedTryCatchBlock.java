package nestedtrycatchblock;


public class NestedTryCatchBlock {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};

            try {
                // Inner try block 1
                int result = numbers[1] / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!" + e.getMessage());
            }

            try {
                // Inner try block 2
                System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\"Invalid array index!\" " + e.getMessage());
            }



        }  catch (Exception e) {
            System.out.println("General Exception caught in outer try block: " + e.getMessage());
        }
        System.out.println("Rest of the code executes...");
    }
}

