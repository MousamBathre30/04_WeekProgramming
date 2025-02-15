package tryWithResources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static String tryWithResource(){
        try(BufferedReader br = new BufferedReader(new FileReader("info.txt"))){
            String line ;
            while( (line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            return "Error reading file";
        }
        return "";
    }
    public static void main(String[] args) {

        System.out.println(tryWithResource());
    }
}
