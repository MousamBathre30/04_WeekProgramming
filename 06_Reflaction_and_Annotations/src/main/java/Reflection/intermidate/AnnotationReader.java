package Reflection.intermidate;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Define Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

// Apply Annotation to a Class
@Author(name = "Mousam Bathre")
class MyClass {}

public class AnnotationReader {
    public static void main(String[] args) {
        Class<MyClass> cls = MyClass.class;

        if (cls.isAnnotationPresent(Author.class)) {
            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("No annotation found.");
        }
    }
}
