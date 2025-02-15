package finalyblocked;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FinalyBlockedExecutedTest {

    @Test
    void testValidDivision() {
        String input = "10\n2\n"; // Simulate user input: 10 2
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FinalyBlockedExecuted.main(new String[]{});

        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Operation completed"));
        assertFalse(consoleOutput.contains("Divide by zero is not allow"));
    }

    @Test
    void testDivideByZero() {
        String input = "5\n0\n"; // Simulate user input: 5 0
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FinalyBlockedExecuted.main(new String[]{});

        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Divide by zero is not allow"));
        assertTrue(consoleOutput.contains("Operation completed"));
    }
}
