package AiDrivenResumeScreeningSystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.List;
import java.util.ArrayList;

class ResumeScreeningTest {

    @Test
    @DisplayName("Test Software Engineer Eligibility - Should be Approved")
    void testSoftwareEngineerEligibility() {
        SoftwareEngineer se = new SoftwareEngineer("Alice", "Java, Spring Boot", 3);
        Resume<SoftwareEngineer> resume = new Resume<>(se);
        assertTrue(resume.processResume(), "Alice should be eligible for Software Engineer");
    }

    @Test
    @DisplayName("Test Software Engineer Rejection - Should be Rejected")
    void testSoftwareEngineerRejection() {
        SoftwareEngineer se = new SoftwareEngineer("David", "JavaScript, React", 1);
        Resume<SoftwareEngineer> resume = new Resume<>(se);
        assertFalse(resume.processResume(), "David should be rejected for Software Engineer");
    }

    @Test
    @DisplayName("Test Data Scientist Eligibility - Should be Approved")
    void testDataScientistEligibility() {
        DataScientist ds = new DataScientist("Bob", "Python, Machine Learning, SQL", 4);
        Resume<DataScientist> resume = new Resume<>(ds);
        assertTrue(resume.processResume(), "Bob should be eligible for Data Scientist");
    }

    @Test
    @DisplayName("Test Data Scientist Rejection - Should be Rejected")
    void testDataScientistRejection() {
        DataScientist ds = new DataScientist("Eve", "R, Data Analytics", 2);
        Resume<DataScientist> resume = new Resume<>(ds);
        assertFalse(resume.processResume(), "Eve should be rejected for Data Scientist");
    }

    @Test
    @DisplayName("Test Product Manager Eligibility - Should be Approved")
    void testProductManagerEligibility() {
        ProductManager pm = new ProductManager("Charlie", "Leadership, Agile, UX", 6);
        Resume<ProductManager> resume = new Resume<>(pm);
        assertTrue(resume.processResume(), "Charlie should be eligible for Product Manager");
    }

    @Test
    @DisplayName("Test Product Manager Rejection - Should be Rejected")
    void testProductManagerRejection() {
        ProductManager pm = new ProductManager("Daniel", "Project Management", 3);
        Resume<ProductManager> resume = new Resume<>(pm);
        assertFalse(resume.processResume(), "Daniel should be rejected for Product Manager");
    }

    @Test
    @DisplayName("Test Screening Pipeline - Should Process Multiple Resumes")
    void testScreeningPipeline() {
        List<JobRole> candidates = new ArrayList<>();
        candidates.add(new SoftwareEngineer("Alice", "Java, Spring Boot", 3));
        candidates.add(new DataScientist("Bob", "Python, Machine Learning, SQL", 4));
        candidates.add(new ProductManager("Charlie", "Leadership, Agile, UX", 6));
        candidates.add(new SoftwareEngineer("David", "JavaScript, React", 1)); // Should be rejected
        candidates.add(new DataScientist("Eve", "R, Data Analytics", 2)); // Should be rejected

        ResumeScreeningPipeline.processResumes(candidates);

        // Ensure at least one is approved and one is rejected
        assertTrue(candidates.get(0).isEligible(), "Alice should be approved");
        assertTrue(candidates.get(1).isEligible(), "Bob should be approved");
        assertFalse(candidates.get(3).isEligible(), "David should be rejected");
        assertFalse(candidates.get(4).isEligible(), "Eve should be rejected");
    }
}
