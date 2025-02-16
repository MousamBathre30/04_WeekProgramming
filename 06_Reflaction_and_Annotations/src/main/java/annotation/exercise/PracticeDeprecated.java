package annotation.exercise;


class LegacyAPI{
    @Deprecated(since = "Never used")
    void oldFeature(){
        System.out.println("Old Feature");
    }
    void newFeature(){
        System.out.println("new Feature");
    }
}
public class PracticeDeprecated {

    public static void main(String[] args) {
        LegacyAPI le = new LegacyAPI();
        le.newFeature();
        le.oldFeature(); // it give the class is never used
    }
}
