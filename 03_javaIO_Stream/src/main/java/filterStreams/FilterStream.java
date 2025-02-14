package filterStreams;

import java.io.*;

public class FilterStream {

    public static String filterStream(String inputFile, String outputFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            return "File processed successfully.";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error processing file.";
        }
    }

    public static void main(String[] args) {
        String inputFile = "src/main/java/java_100_words.txt";
        String outputFile = "src/main/java/java_100_words_lowercase.txt";
        System.out.println(filterStream(inputFile, outputFile));
    }
}
