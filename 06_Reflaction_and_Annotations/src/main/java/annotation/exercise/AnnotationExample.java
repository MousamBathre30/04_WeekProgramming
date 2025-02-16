package annotation.exercise;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


public class AnnotationExample {

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("performTask");

        // Check if the method has @TaskInfo annotation
        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            System.out.println("Task Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        } else {
            System.out.println("Task is not annotated with @TaskInfo");
        }
    }
}


@Retention(RetentionPolicy.RUNTIME) // Make annotation information available at runtime
@Target(ElementType.METHOD)
//
 @interface TaskInfo {
    int priority() default 0;
    String assignedTo() default "Unassigned";
}


 class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "John Doe")
    public void performTask() {
        // Task implementation
        System.out.println("Task is being performed.");
    }

    // Other methods...
}