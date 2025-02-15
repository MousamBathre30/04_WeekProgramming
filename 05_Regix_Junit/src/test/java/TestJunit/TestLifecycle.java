package TestJunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifecycle {

    @BeforeEach
    void setUP(){
        System.out.println("Before each test");

    }

    @AfterEach
    void tearDown(){
        System.out.println("After each test");
    }

    @Test
    void testMethod1(){
        System.out.println("Executing test 1");
    }

    @Test
    void testMethod2(){
        System.out.println("Executing Test 2");
    }
}
