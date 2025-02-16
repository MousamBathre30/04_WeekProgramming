package Reflection.basicLevel;

import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter class name: ");
        String className = new java.util.Scanner(System.in).nextLine();

        Class<?> cls = Class.forName(className);

        System.out.println("\nMethods:");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("\nFields:");
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}
