package bufferStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BufferedStreamTest {

    @Test
    @DisplayName("Check for the buffer Stream")
    void testBufferStream(){
        assertEquals("File Copyed SuccesFully",BufferedStream.bufferstream());
    }
    @Test
    void testFileStream(){
        assertEquals("File Copyed Succecfully",BufferedStream.fileHandling());
    }
}