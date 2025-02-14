package countwordonfile;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {

    @Test
    void testWordFrequencyCount() throws IOException {
        // Create a temporary file with sample text
        File tempFile = File.createTempFile("testInput", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello world! Hello everyone. Welcome to the world of Java.");
        }

        // Call the word frequency method
        Map<String, Integer> wordCount = WordFrequencyCounter.countWordFrequency(tempFile.getAbsolutePath());

        // Expected word counts
        assertEquals(2, wordCount.get("hello"));
        assertEquals(2, wordCount.get("world"));
        assertEquals(1, wordCount.get("everyone"));
        assertEquals(1, wordCount.get("welcome"));
        assertEquals(1, wordCount.get("to"));
        assertEquals(1, wordCount.get("the"));
        assertEquals(1, wordCount.get("of"));
        assertEquals(1, wordCount.get("java"));
    }
}
