package multilevelUniversityCourse;

public class University {

    public static void main(String[] args) {
        AssignmentBased a1 = new AssignmentBased("Allen" , "01");
        ExamCourse e1 = new ExamCourse("Physics" , "02");
        ResearchCourse r1 = new ResearchCourse("R&D" , "03");

        Course<AssignmentBased> assignmentBasedCourse = new Course<>();
        assignmentBasedCourse.addCourse(a1);

        Course<ExamCourse> examCourseCourse = new Course<>();
        examCourseCourse.addCourse(e1);

        Course<ResearchCourse> researchCourseCourse = new Course<>();
        researchCourseCourse.addCourse(r1);

        researchCourseCourse.showCourseDetails(r1);
        examCourseCourse.showCourseDetails(e1);
        assignmentBasedCourse.showCourseDetails(a1);

    }
}
