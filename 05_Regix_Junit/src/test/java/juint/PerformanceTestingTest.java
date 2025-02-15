package juint;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTestingTest {

    @Test
    @Timeout(4)
    void testTimeOut() throws InterruptedException {
        PerformanceTesting.longRunningTask();
    }
}