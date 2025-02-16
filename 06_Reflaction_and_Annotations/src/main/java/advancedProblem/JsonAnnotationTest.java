package advancedProblem;

import java.lang.annotation.*;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}


class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}


class JsonSerializer {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{ ");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                String key = field.getAnnotation(JsonField.class).name();
                Object value = field.get(obj);
                json.append("\"").append(key).append("\": \"").append(value).append("\", ");
            }
        }
        return json.substring(0, json.length() - 2) + " }"; // Remove last comma and close JSON
    }
}


public class JsonAnnotationTest {
    public static void main(String[] args) throws IllegalAccessException {
        user user = new user("JohnDoe", 25);
        System.out.println(JsonSerializer.toJson(user));
    }
}
