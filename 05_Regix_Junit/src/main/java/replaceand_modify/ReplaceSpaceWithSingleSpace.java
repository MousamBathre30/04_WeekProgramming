package replaceand_modify;



public class ReplaceSpaceWithSingleSpace {
    public static String replaceExtraSpace(){
        String text = "This is                an example with multiple spaces. ";
        String replacedText = text.replaceAll("\\s+", " ");
        return "Formatted :- "+ replacedText;
    }
    public static void main(String[] args) {
        System.out.println(replaceExtraSpace());
    }
}

