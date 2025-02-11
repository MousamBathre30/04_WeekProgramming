package AiDrivenResumeScreeningSystem;

import java.util.List;

class ResumeScreeningPipeline {
    public static void processResumes(List<? extends JobRole> jobCandidates) {
        for (JobRole candidate : jobCandidates) {
            String status = candidate.isEligible() ? "Approved" : "Rejected";
            System.out.println(candidate + " -> " + status);
        }
    }
}