package readlargefilelinebyline;

import java.io.BufferedReader; // BufferedReader reads the file line by line using readLine()
import java.io.FileReader; // uses file reader to read from a file
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {
        String filePath = "src/practice/sample.txt"; // 500 mb file
        // try with resource statement automatically closes the reader after execution.
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null){
                if(line.equals("error")){
                    System.out.println(line);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
