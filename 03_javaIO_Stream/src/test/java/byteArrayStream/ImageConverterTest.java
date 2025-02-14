package byteArrayStream;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ImageConverterTest {

    @Test
    void TestimageAresymetricORnot() throws IOException {
        String inputImagePath = "Input.jpg";  // Change to your actual image path
        String outputImagePath = "Output.jpg";
        assertTrue(ImageConverter.verifyImages(inputImagePath,outputImagePath));
    }
}