package pipedStreams;

import java.io.*;

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            final PipedOutputStream pos = new PipedOutputStream();
            final PipedInputStream pis = new PipedInputStream(pos);

            Thread writerThread = new Thread(() -> {
                try (pos) {
                    String message = "Hello from the writer thread!";
                    pos.write(message.getBytes());
                    System.out.println("Writer: Data written to stream.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            Thread readerThread = new Thread(() -> {
                try (pis) {
                    int data;
                    System.out.print("Reader: Data read from stream: ");
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    System.out.println();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
