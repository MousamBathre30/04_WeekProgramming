package replaceand_modify;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceBadWordTest {

    @Test
    public void testCaseInsensitiveReplacement() {
        String text = "This is a Damn example with Stupid words.";
        String[] badWords = {"damn", "stupid"};

        String result = ReplaceBadWord.replaceBadWords(text, badWords);
        assertEquals("This is a **** example with **** words.", result);
    }
}