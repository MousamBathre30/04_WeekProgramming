package replaceand_modify;

public class ReplaceBadWord {
    public static String replaceBadWords(String text, String[] badWords) {
        for (String badWord : badWords) {
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****"); // Case-insensitive and word-boundary match
        }
        return text;
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};

        String replacedText = replaceBadWords(text, badWords);
        System.out.println("Formatted :- " + replacedText);
        System.out.println("Original text :- " + text);
    }
}
