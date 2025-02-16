package Reflection.basicLevel;

import java.lang.reflect.*;

class Person {
    private int age = 25;
}

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true); // Allow access to private field

        System.out.println("Original Age: " + field.get(person));

        field.set(person, 30); // Modify value
        System.out.println("Modified Age: " + field.get(person));
    }
}
