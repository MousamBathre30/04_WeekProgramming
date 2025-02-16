package Reflection.advanced;

import java.lang.reflect.Field;

class Person {
    private String name = "Alice";
    private int age = 30;
}

public class ObjectToJson {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            json.append("\"").append(fields[i].getName()).append("\":\"").append(fields[i].get(obj)).append("\"");
            if (i < fields.length - 1) {
                json.append(", ");
            }
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person();
        System.out.println(toJson(person));
    }
}
