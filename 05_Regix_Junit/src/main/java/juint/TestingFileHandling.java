package juint;

import java.io.*;

public class TestingFileHandling {

    public static void writeToFile(String filename , String content){
        try(BufferedWriter br = new BufferedWriter(new FileWriter(filename))){
            br.write(content);
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void readFromFile(String filename){

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args)  {
        String content = "HEllow java";
        String filePath = "src/main/java/juint/Sample.txt";
         writeToFile(filePath,content);
        readFromFile(filePath);
    }
}
