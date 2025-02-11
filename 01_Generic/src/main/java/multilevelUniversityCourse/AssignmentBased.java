package multilevelUniversityCourse;

public class AssignmentBased extends CourseType {

    public AssignmentBased(String name , String id){
        super(name , id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Type is Assignment");
        System.out.println("Name of the course" + courseName);
        System.out.println("Name of the id " + courseID);
    }
}
