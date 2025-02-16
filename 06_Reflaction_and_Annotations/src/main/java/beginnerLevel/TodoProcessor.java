package beginnerLevel;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();                  // Description of the task
    String assignedTo();            // Developer responsible
    String priority() default "MEDIUM";  // Default priority is MEDIUM
}


class Project {

    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void loginFeature() {
        System.out.println("Login feature development...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDatabase() {
        System.out.println("Database optimization...");
    }

    @Todo(task = "Improve UI design", assignedTo = "Charlie", priority = "LOW")
    public void improveUI() {
        System.out.println("UI improvements...");
    }
}


public class TodoProcessor {
    public static void main(String[] args) {
        Method[] methods = Project.class.getDeclaredMethods();

        System.out.println("Pending Tasks:");
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Task: " + todo.task());
                System.out.println("  Assigned To: " + todo.assignedTo());
                System.out.println("  Priority: " + todo.priority());
                System.out.println("----------------------");
            }
        }
    }
}
