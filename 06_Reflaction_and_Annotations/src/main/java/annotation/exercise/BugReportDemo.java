package annotation.exercise;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define @BugReport annotation with @Repeatable
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class) // Allows multiple BugReport annotations
@interface BugReport {
    String description();  // Bug description field
}

// Container annotation to hold multiple @BugReport annotations
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// Class with a method having multiple bug reports
class BugTracker {

    @BugReport(description = "Null pointer exception when input is null")
    @BugReport(description = "Performance issue in large data sets")
    public void processTask() {
        System.out.println("Processing task...");
    }
}

// Main class to retrieve and print annotations using Reflection
public class BugReportDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = BugTracker.class.getMethod("processTask");

        // Retrieve and print all bug reports
        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports bugReports = method.getAnnotation(BugReports.class);
            for (BugReport bug : bugReports.value()) {
                System.out.println("Bug: " + bug.description());
            }
        } else {
            System.out.println("No bug reports found.");
        }
    }
}
