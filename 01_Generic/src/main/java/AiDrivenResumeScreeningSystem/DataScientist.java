package AiDrivenResumeScreeningSystem;

class DataScientist extends JobRole {
    public DataScientist(String candidateName, String skills, int experience) {
        super(candidateName, skills, experience);
    }

    @Override
    public boolean isEligible() {
        return experience >= 3 && (skills.contains("Python") && skills.contains("Machine Learning"));
    }
}