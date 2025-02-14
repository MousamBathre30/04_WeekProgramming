package readUserInput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class ReadFormUserTest {
    private static final String FILE_NAME = "java_100_words.txt";

    @Test
    void testInputStreamReader() {
        // Simulated user input: name, age, programming language (each on a new line)
        String simulatedInput = "Alice\n25\nJava\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Run the method
        String result = ReadFormUser.inputStreamReader();

        // Check if method executed successfully
        assertEquals("Success", result, "Method should return 'Success' on successful execution");

        // Validate the file content
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            assertEquals("name: Alice", reader.readLine(), "Name should match");
            assertEquals("age: 25", reader.readLine(), "Age should match");
            assertEquals("pl: Java", reader.readLine(), "Programming language should match");
        } catch (IOException e) {
            fail("File reading failed: " + e.getMessage());
        }
    }

    @AfterEach
    void cleanUp() {
        // Delete the file after test
        File file = new File(FILE_NAME);
        if (file.exists()) {
            assertTrue(file.delete(), "Test file should be deleted after test execution");
        }
    }
}
