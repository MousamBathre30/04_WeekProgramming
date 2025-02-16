package Reflection.basicLevel;

import java.lang.reflect.*;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class PrivateMethodInvoke {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true); // Allow access to private method

        int result = (int) method.invoke(calc, 5, 4);
        System.out.println("Multiplication Result: " + result);
    }
}
