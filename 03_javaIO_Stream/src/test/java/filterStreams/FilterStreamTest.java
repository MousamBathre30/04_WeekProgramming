package filterStreams;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class FilterStreamTest {

    @Test
    void testFilterStream() throws IOException {
        // Create a temporary input file
        Path inputFile = Files.createTempFile("test_input", ".txt");
        Path outputFile = Files.createTempFile("test_output", ".txt");

        // Write sample content
        Files.writeString(inputFile, "Hello World\nJava STREAMS\nTesting FILES");

        // Call the method
        FilterStream.filterStream(inputFile.toString(), outputFile.toString());

        // Read and check the output file
        String result = Files.readString(outputFile);

        // Expected content (converted to lowercase)
        String expected = "hello world\njava streams\ntesting files\n";

        assertEquals(expected, result);
    }
}
