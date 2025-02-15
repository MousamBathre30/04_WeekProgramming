package extractlinks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractLinkesTest {

    @Test
    void testExtracLinkes(){
        String text = "Visit https://www.google.com and http://example.org for more info.";
        assertEquals("Domains:  https://www.google.com",ExtractLinkes.extractLinks(text));
    }
}