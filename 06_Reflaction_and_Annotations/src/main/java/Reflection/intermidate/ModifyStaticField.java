package Reflection.intermidate;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "ORIGINAL_KEY";
}

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Configuration.class;

        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true); // Allow access to private static field

        System.out.println("Original API_KEY: " + field.get(null));

        field.set(null, "NEW_SECRET_KEY");
        System.out.println("Modified API_KEY: " + field.get(null));
    }
}
