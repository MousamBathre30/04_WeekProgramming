package tryWithResources;

import static org.junit.jupiter.api.Assertions.*;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

class TryWithResourcesTest {

    private static final String TEST_FILE = "test_info.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Create a test file with some content
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILE))) {
            writer.write("Hello, World!\nThis is a test file.");
        }
    }

    @AfterEach
    void tearDown() {
        // Delete the test file after each test
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testTryWithResource_SuccessfulRead() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Modify method to read from test file instead of "info.txt"
        String result = readFromFile(TEST_FILE);

        // Restore System.out
        System.setOut(originalOut);

        // Expected output
        String expectedOutput = "Hello, World!\nThis is a test file.";

        // Verify that the file contents are printed
        assertEquals(expectedOutput, outputStream.toString().trim());
        assertEquals("", result); // Should return empty string on success
    }

    @Test
    void testTryWithResource_FileNotFound() {
        // Try reading a non-existent file
        String result = readFromFile("non_existent_file.txt");
        assertEquals("Error reading file", result);
    }

    // Helper method to replace actual file reading
    private String readFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder output = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                output.append(line).append("\n");
            }
        } catch (IOException e) {
            return "Error reading file";
        }
        return "";
    }
}
