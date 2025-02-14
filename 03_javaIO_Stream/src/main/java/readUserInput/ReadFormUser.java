package readUserInput;

import java.io.*;

public class ReadFormUser {

    public static String inputStreamReader(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter("src/main/java/java_100_words.txt")))) {
            System.out.println("Enter the name");
            String name = br.readLine();
            System.out.println("Enter the age");
            String age = br.readLine();
            System.out.println("Enter th favorate Programming languae");
            String favorite_Programming_Language = br.readLine();


            bw.write("name " + name );
            bw.write("age " + age );
            bw.write("pl " + favorite_Programming_Language );

            System.out.println("File copyed Successfully ");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    public static void main(String[] args) {

        System.out.println(inputStreamReader());
    }
}
