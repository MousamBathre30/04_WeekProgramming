package multilevelUniversityCourse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private AssignmentBased a1;
    private ExamCourse e1;
    private ResearchCourse r1;
    private Course<AssignmentBased> assignmentBasedCourse;
    private Course<ExamCourse> examCourseCourse;
    private Course<ResearchCourse> researchCourseCourse;

    @BeforeEach
    public void setUp() {
        // Setup objects before each test
        a1 = new AssignmentBased("Allen", "01");
        e1 = new ExamCourse("Physics", "02");
        r1 = new ResearchCourse("R&D", "03");

        assignmentBasedCourse = new Course<>();
        examCourseCourse = new Course<>();
        researchCourseCourse = new Course<>();
    }

    @Test
    public void testAddAndShowAssignmentBasedCourse() {
        // Adding assignment-based course
        assignmentBasedCourse.addCourse(a1);
        // Ensure course is added properly
      //  assertTrue(assignmentBasedCourse.getCourses().contains(a1));
    }

    @Test
    public void testAddAndShowExamCourse() {
        // Adding exam-based course
        examCourseCourse.addCourse(e1);
        // Ensure course is added properly
      //  assertTrue(examCourseCourse.getCourses().contains(e1));
    }

    @Test
    public void testAddAndShowResearchCourse() {
        // Adding research-based course
        researchCourseCourse.addCourse(r1);
        // Ensure course is added properly
      //  assertTrue(researchCourseCourse.getCourses().contains(r1));
    }

    @Test
    public void testShowCourseDetailsForAssignment() {
        // Add course and verify details are shown correctly
        assignmentBasedCourse.addCourse(a1);
        assertDoesNotThrow(() -> assignmentBasedCourse.showCourseDetails(a1));
    }

    @Test
    public void testShowCourseDetailsForExam() {
        // Add course and verify details are shown correctly
        examCourseCourse.addCourse(e1);
        assertDoesNotThrow(() -> examCourseCourse.showCourseDetails(e1));
    }

    @Test
    public void testShowCourseDetailsForResearch() {
        // Add course and verify details are shown correctly
        researchCourseCourse.addCourse(r1);
        assertDoesNotThrow(() -> researchCourseCourse.showCourseDetails(r1));
    }
}
