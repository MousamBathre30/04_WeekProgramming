package multilevelUniversityCourse;

public class ResearchCourse extends CourseType{

    public ResearchCourse(String name , String id){
        super(name , id);
    }

    @Override
    public void displayInfo() {
        System.out.println("The type is Reasarch");
        System.out.println("The name is " + courseName);
        System.out.println("The course id is " + courseID);

    }
}
