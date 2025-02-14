package pipedStreams;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class PipedStreamExampleTest {

    @Test
    void testPipedStreamCommunication() throws IOException, InterruptedException {
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);

        String message = "Hello from the writer thread!";
        Thread writerThread = new Thread(() -> {
            try (pos) {
                pos.write(message.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        StringBuilder receivedMessage = new StringBuilder();
        Thread readerThread = new Thread(() -> {
            try (pis) {
                int data;
                while ((data = pis.read()) != -1) {
                    receivedMessage.append((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();

        // Assert that the received message matches the expected message
        assertEquals(message, receivedMessage.toString());
    }
}
