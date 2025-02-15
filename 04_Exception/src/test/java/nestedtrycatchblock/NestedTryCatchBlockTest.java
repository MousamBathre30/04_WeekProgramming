package nestedtrycatchblock;

import static org.junit.jupiter.api.Assertions.*;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class NestedTryCatchBlockTest {

    @Test
    void testNestedTryCatchBlock() {
        // Capture system output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Run main method
        NestedTryCatchBlock.main(new String[]{});

        // Restore System.out
        System.setOut(originalOut);

        // Expected output
        String expectedOutput = "Cannot divide by zero!/ by zero\n"
                + "\"Invalid array index!\" 3\n"
                + "Rest of the code executes...\n";

        // Trim to handle potential newline differences
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }
}
