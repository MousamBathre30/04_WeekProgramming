package AiDrivenResumeScreeningSystem;

class ProductManager extends JobRole {
    public ProductManager(String candidateName, String skills, int experience) {
        super(candidateName, skills, experience);
    }

    @Override
    public boolean isEligible() {
        return experience >= 5 && skills.contains("Leadership");
    }
}