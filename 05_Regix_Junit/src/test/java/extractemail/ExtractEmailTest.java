package extractemail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractEmailTest {

    @Test
    void testExtractEmail(){
        String text = " Contact us at mousambathre@gmail.com support@example.com and info@company.org";
        assertEquals("Emails:  mousambathre@gmail.comEmails:  support@example.comEmails:  info@company.org",ExtractEmail.validateExtractEmail(text));
    }
}