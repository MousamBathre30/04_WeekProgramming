package AiDrivenResumeScreeningSystem;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String skills, int experience) {
        super(candidateName, skills, experience);
    }

    @Override
    public boolean isEligible() {
        return experience >= 2 && skills.contains("Java");
    }
}