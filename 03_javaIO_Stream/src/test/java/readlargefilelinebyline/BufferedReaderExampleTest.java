package readlargefilelinebyline;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BufferedReaderExampleTest {

    @Test
    void testReadingFileLineByLine() throws IOException {
        // Create a temporary file
        Path tempFile = Files.createTempFile("test_large_file", ".txt");

        // Write sample data to the file
        List<String> sampleLines = List.of("This is a test", "error", "Another line", "Error detected");
        Files.write(tempFile, sampleLines);

        // Read the file and check for "error" occurrence
        List<String> foundErrors = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(tempFile.toFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("error")) {  // Use .equals() instead of '=='
                    foundErrors.add(line);
                }
            }
        }

        // Assertions
        assertFalse(foundErrors.isEmpty(), "Error line should be detected");
        assertEquals(1, foundErrors.size());
        assertEquals("error", foundErrors.get(0));
    }
}
