package exceptionPropagation;

public class ExceptionPropagation {

    private static void method2() {
        method1();
    }

    private static void method1() throws ArithmeticException{
        int a=10;
        int b=0;
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        try {
            method2();
        }catch (ArithmeticException e){
            System.out.println("Exception caught in the main "+e.getMessage());
        }


    }


}
