package beginnerLevel;

import java.lang.annotation.*;
import java.lang.reflect.Method;

//  Define the @ImportantMethod annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";  // Optional level parameter (default: HIGH)
}

// Apply the annotation to some methods
class TaskManager {

    @ImportantMethod
    public void criticalTask() {
        System.out.println("Executing critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void importantTask() {
        System.out.println("Executing important task...");
    }

    public void normalTask() {
        System.out.println("Executing normal task...");
    }
}

// Use Reflection API to retrieve and print annotated methods
public class AnnotationProcessor {
    public static void main(String[] args) {
        Method[] methods = TaskManager.class.getDeclaredMethods();

        System.out.println("Important Methods:");
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}
