package beginnerLevel;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// 1️ Define the @LogExecutionTime annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

// 2️ Apply @LogExecutionTime to methods
class PerformanceTester {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++); // Simulate a quick operation
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1000000; i++); // Simulate a slow operation
    }
}

// 3️ Use Reflection API to measure execution time
public class ExecutionTimeLogger {
    public static void main(String[] args) throws Exception {
        PerformanceTester tester = new PerformanceTester();
        Method[] methods = PerformanceTester.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(tester);  // Invoke the method
                long endTime = System.nanoTime();
                System.out.println("Method: " + method.getName() + " | Execution Time: " + (endTime - startTime) + " ns");
            }
        }
    }
}

