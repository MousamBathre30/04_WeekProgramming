package AiDrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningApp {
    public static void main(String[] args) {
        // Creating resumes
        Resume<SoftwareEngineer> softwareResume = new Resume<>(new SoftwareEngineer("Alice", "Java, Spring Boot", 3));
        Resume<DataScientist> dataScienceResume = new Resume<>(new DataScientist("Bob", "Python, Machine Learning, SQL", 4));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie", "Leadership, Agile, UX", 6));

        // Screening Pipeline
        List<JobRole> candidates = new ArrayList<>();
        candidates.add(new SoftwareEngineer("Alice", "Java, Spring Boot", 3));
        candidates.add(new DataScientist("Bob", "Python, Machine Learning, SQL", 4));
        candidates.add(new ProductManager("Charlie", "Leadership, Agile, UX", 6));
        candidates.add(new SoftwareEngineer("David", "JavaScript, React", 1)); // Should be rejected
        candidates.add(new DataScientist("Eve", "R, Data Analytics", 2)); // Should be rejected

        System.out.println("Resume Screening Results:");
        ResumeScreeningPipeline.processResumes(candidates);
    }
}
