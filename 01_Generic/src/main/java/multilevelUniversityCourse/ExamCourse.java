package multilevelUniversityCourse;

 class ExamCourse extends CourseType {

    ExamCourse(String name , String id){
        super(name,id);
    }

     @Override
     public void displayInfo() {
         System.out.println("Name of the Course" + courseName);
         System.out.println("Course ID " + courseID);
     }

 }
