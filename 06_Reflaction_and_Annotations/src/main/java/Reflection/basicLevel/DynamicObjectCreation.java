package Reflection.basicLevel;
class Student {
    public Student() {
        System.out.println("Student object created!");
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Student");

        Object obj = cls.getDeclaredConstructor().newInstance();
        System.out.println("Instance created: " + obj.getClass().getSimpleName());
    }
}
