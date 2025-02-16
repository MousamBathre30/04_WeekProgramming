package advancedProblem;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value(); // Allowed role (e.g., "ADMIN")
}


class user {
    private String role;

    public user(String role, int i) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}


class SecureService {

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed!");
    }

    public void publicTask() {
        System.out.println("Public task executed!");
    }
}


class AccessController {
    public static void invokeMethod(user user, Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();
                if (!user.getRole().equals(requiredRole)) {
                    System.out.println("Access Denied! Only " + requiredRole + " can execute this method.");
                    return;
                }
            }

            method.invoke(obj); // Execute method if access is granted
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


public class RoleBasedAccessTest {
    public static void main(String[] args) {
        user admin = new user("ADMIN", 25);
        user guest = new user("GUEST", 25);

        SecureService service = new SecureService();

        System.out.println("Trying with ADMIN user:");
        AccessController.invokeMethod(admin, service, "adminTask");

        System.out.println("\nTrying with GUEST user:");
        AccessController.invokeMethod(guest, service, "adminTask");  // ❌ Access Denied!


    }
}
