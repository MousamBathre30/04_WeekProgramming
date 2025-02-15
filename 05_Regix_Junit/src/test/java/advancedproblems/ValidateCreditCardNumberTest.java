package advancedproblems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateCreditCardNumberTest {

    @Test
    @DisplayName("Test for the MasterCard")
    void testForMasterCardFuncation(){
        String address = "4123456789076543";
        assertEquals("Cradit card is from MasterCard is true",ValidateCreditCardNumber.checkForMasterCard(address));
    }
    @Test
    @DisplayName("Test for the Visa")
    void testForVisaCardFuncation(){
        String address = "4123456789076543";
        assertEquals("Cradit card is from Visa is false",ValidateCreditCardNumber.checkForVisaCard(address));
    }

}