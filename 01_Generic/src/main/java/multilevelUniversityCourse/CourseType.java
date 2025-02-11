package multilevelUniversityCourse;

abstract class CourseType {

    String courseName;
    String courseID;

    CourseType(String courseName , String courseID){
        this.courseID = courseID;
        this.courseName = courseName;
    }
    abstract public void displayInfo();
}
