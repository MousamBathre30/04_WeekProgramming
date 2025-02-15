package exceptionPropagation;

import static org.junit.jupiter.api.Assertions.*;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

class TryWithResourcesTest {

    private static final String TEST_FILE = "test_info.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Create a test file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILE))) {
            writer.write("Hello, World!");
        }
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete(); // Delete the test file
    }

    @Test
    void testFileReadSuccess() {
        String result = readFile(TEST_FILE);
        assertEquals("Hello, World!", result.trim());
    }

    @Test
    void testFileNotFound() {
        String result = readFile("nonexistent.txt");
        assertEquals("Error reading file", result);
    }

    @Test
    void testFileWrite() throws IOException {
        String content = "Writing test";
        writeFile(TEST_FILE, content);
        assertEquals(content, readFile(TEST_FILE).trim());
    }

    // Helper method to read a file
    private String readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return br.readLine();
        } catch (IOException e) {
            return "Error reading file";
        }
    }

    // Helper method to write to a file
    private void writeFile(String fileName, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
        }
    }
}
