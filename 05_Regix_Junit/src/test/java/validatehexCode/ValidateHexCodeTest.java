package validatehexCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateHexCodeTest {

    @Test
    void validateHexCode(){
        String text = "#FfA500";
        assertTrue(ValidateHexCode.validateHexCode(text));
    }
}