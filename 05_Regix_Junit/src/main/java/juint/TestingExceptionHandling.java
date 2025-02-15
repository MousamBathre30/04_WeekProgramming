package juint;

public class TestingExceptionHandling {

    public static int divide(int a, int b){
        int diff = 0;
        try{
            diff= a/b;
        } catch (ArithmeticException e){
            e.getMessage();
        }
        return diff;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(divide(a,b));
    }
}
