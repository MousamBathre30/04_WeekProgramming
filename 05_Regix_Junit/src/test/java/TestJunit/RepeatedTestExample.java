package TestJunit;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestExample {
    @RepeatedTest(3)
    void repeatedTest(){
        System.out.println("This test runs multiple times");
    }
}
