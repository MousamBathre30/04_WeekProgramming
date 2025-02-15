package TestJunit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterAllExample {

    @BeforeAll
    static void initALL(){
        System.out.println("Runs once before all tests");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("Runs once after all tests");
    }

    @Test
    void test1(){
        System.out.println("Executing Test 1");
    }
    @Test
    void test2(){
        System.out.println("Executing Test 2");
    }
}
