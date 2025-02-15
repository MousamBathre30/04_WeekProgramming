package TestJunit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledExample {

    @Test
    @Disabled("Not Implemented yet")
    void testFeatureX(){
        System.out.println("This won't run");
    }
}
