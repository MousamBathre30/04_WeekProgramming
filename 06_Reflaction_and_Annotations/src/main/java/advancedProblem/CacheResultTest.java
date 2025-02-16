package advancedProblem;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// 1️ Define the @CacheResult annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

// 2️ Implement a caching mechanism
class CacheHandler {
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invokeWithCache(Object obj, String methodName, Object... args) throws Exception {
        Method method = obj.getClass().getMethod(methodName, int.class);

        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = methodName + "(" + args[0] + ")"; // Unique cache key

            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for " + key);
                return cache.get(key);
            }

            Object result = method.invoke(obj, args); // Compute result
            cache.put(key, result); // Store in cache
            return result;
        }

        return method.invoke(obj, args); // Execute normally if no annotation
    }
}


class MathOperations {

    @CacheResult
    public int expensiveComputation(int num) {
        System.out.println("Computing factorial of " + num);
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}


public class CacheResultTest {
    public static void main(String[] args) throws Exception {
        MathOperations mathOps = new MathOperations();

        System.out.println(CacheHandler.invokeWithCache(mathOps, "expensiveComputation", 5)); // Computed
        System.out.println(CacheHandler.invokeWithCache(mathOps, "expensiveComputation", 5)); // Cached

    }
}
