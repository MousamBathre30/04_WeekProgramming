package Reflection.advanced;

import java.lang.reflect.Method;

class Calculator {
    public void compute() {
        try {
            Thread.sleep(500); // Simulate time-consuming task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExecutionTimeMeasurement {
    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) / 1_000_000 + " ms");
    }

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        measureExecutionTime(calc, "compute");
    }
}
