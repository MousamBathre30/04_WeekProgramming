package byteArrayStream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageConverter {
    public static void main(String[] args) {
        String inputImagePath = "Input.jpg"; // Change to your actual image path
        String outputImagePath = "Output.jpg";

        try {
            // Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(inputImagePath);

            // Write byte array back to an image
            writeByteArrayToImage(imageBytes, outputImagePath);

            // Verify the two images are identical
            if (verifyImages(inputImagePath, outputImagePath)) {
                System.out.println("The images are identical.");
            } else {
                System.out.println("The images are NOT identical.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(imagePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    public static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static boolean verifyImages(String imagePath1, String imagePath2) throws IOException {
        byte[] file1 = Files.readAllBytes(new File(imagePath1).toPath());
        byte[] file2 = Files.readAllBytes(new File(imagePath2).toPath());
        return Arrays.equals(file1, file2);
    }
}
