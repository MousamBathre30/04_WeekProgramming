package AiDrivenResumeScreeningSystem;

class Resume<T extends JobRole> {
    private T candidate;

    public Resume(T candidate) {
        this.candidate = candidate;
    }

    public boolean processResume() {
        return candidate.isEligible();
    }

    public String getCandidateName() {
        return candidate.toString();
    }
}
