package filehandling;

import java.io.*;

public class FileStrems {

    public static String fileHandling(){
        try(FileInputStream fis = new FileInputStream("src/main/java/java_100_words.txt");
            FileOutputStream fos = new FileOutputStream("src/main/java/java_1000_words.txt")){
            int byteData;
            while((byteData = fis.read()) != -1){
                fos.write(byteData);
            }
            return "File Copyed Succecfully";
        }  catch (FileNotFoundException e){
            return "File Not Copyed Succecfully";
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return "Operation Complete";
    }
    public static void main(String [] args) throws FileNotFoundException {
        System.out.println( fileHandling());
    }
}