package bufferStream;

import java.io.*;

public class BufferedStream {

     public static String bufferstream(){

         try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/100mb.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/java_100_words.txt"))){
             byte[] buffer = new byte[1024];
             int bytesRead;
             while((bytesRead = bis.read(buffer)) != -1){
                 bos.write(buffer,0,bytesRead);
             }
             return "File Copyed SuccesFully";
         } catch ( FileNotFoundException e){
             return "File Not Found Exception";
         } catch (IOException e){
             e.printStackTrace();
         }
         return "Copy Done";
     }
    public static String fileHandling(){
        try(FileInputStream fis = new FileInputStream("src/main/java/100mb.txt");
            FileOutputStream fos = new FileOutputStream("src/main/java/java_100_words.txt")){
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



    public static void main(String[] args) {
         double start = System.nanoTime();
        System.out.println(bufferstream());
         double end = System.nanoTime();
         double diff = (end - start)/1000000;
        System.out.println("Time Taken by the buffered Stream is " + diff + " ms");
        double start1 = System.nanoTime();
        System.out.println( fileHandling());
        double end2 = System.nanoTime();
        System.out.println("Time Taken by the File Stream is " + (end2 - start1)/1000000 + " ms");
    }
}
