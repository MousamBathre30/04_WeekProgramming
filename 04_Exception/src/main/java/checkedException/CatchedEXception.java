package checkedException;

import java.io.*;

public class CatchedEXception {
    public static String checkExecption(){
        try(BufferedReader br = new BufferedReader(new FileReader("Sample.txt"))){
            String line = "";
            while((br.readLine() != null)){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            return "File was not present :)";
        } catch (IOException e){
            e.printStackTrace();
        }
     return "Rest of the program ";
    }
    public static void main(String[] args) {

        System.out.println(checkExecption());

    }
}
