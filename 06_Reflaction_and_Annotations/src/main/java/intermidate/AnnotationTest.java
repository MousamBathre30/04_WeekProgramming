package intermidate;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value(); // Maximum allowed length
}


class User {

    @MaxLength(10)  // Restrict username to 10 characters
    private String username;

    // Constructor validates the field length
    public User(String username) {
        validateMaxLength(this, username);
        this.username = username;
    }

    // Method to validate field length using Reflection
    private void validateMaxLength(Object obj, String fieldValue) {
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(MaxLength.class)) {
                    int maxLength = field.getAnnotation(MaxLength.class).value();
                    if (fieldValue.length() > maxLength) {
                        throw new IllegalArgumentException(
                                "Error: " + field.getName() + " exceeds max length of " + maxLength + " characters.");
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


public class AnnotationTest {
    public static void main(String[] args) {
        try {
            User user1 = new User("JohnDoe");  // Valid (<= 10 chars)
            System.out.println("User created: " + user1);

            User user2 = new User("LongUsername123"); // Exceeds max length, should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
