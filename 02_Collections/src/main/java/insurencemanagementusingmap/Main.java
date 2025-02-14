import java.time.LocalDate;
import java.util.*;

class InsurancePolicy {
    String policyNumber;
    String policyHolderName;
    LocalDate expiryDate;

    public InsurancePolicy(String policyNumber, String policyHolderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Holder: " + policyHolderName + ", Expiry: " + expiryDate;
    }
}

class InsurancePolicyManager {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>();
    private Map<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<InsurancePolicy>> policyByExpiry = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        policyByExpiry.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy> getPoliciesExpiringSoon(int days) {
        LocalDate threshold = LocalDate.now().plusDays(days);
        List<InsurancePolicy> expiringSoon = new ArrayList<>();
        for (Map.Entry<LocalDate, List<InsurancePolicy>> entry : policyByExpiry.headMap(threshold, true).entrySet()) {
            expiringSoon.addAll(entry.getValue());
        }
        return expiringSoon;
    }

    public List<InsurancePolicy> getPoliciesByHolder(String policyHolderName) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.policyHolderName.equalsIgnoreCase(policyHolderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        policyByExpiry.headMap(today, true).clear();
        policyMap.values().removeIf(policy -> policy.expiryDate.isBefore(today));
        orderedPolicyMap.values().removeIf(policy -> policy.expiryDate.isBefore(today));
    }
}

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new InsurancePolicy("P1001", "John Doe", LocalDate.now().plusDays(10)));
        manager.addPolicy(new InsurancePolicy("P1002", "Jane Smith", LocalDate.now().plusDays(5)));
        manager.addPolicy(new InsurancePolicy("P1003", "Alice Brown", LocalDate.now().plusDays(40)));
        manager.addPolicy(new InsurancePolicy("P1004", "John Doe", LocalDate.now().plusDays(2)));

        System.out.println("Policy by Number (P1001): " + manager.getPolicyByNumber("P1001"));

        System.out.println("\nPolicies Expiring Soon:");
        for (InsurancePolicy policy : manager.getPoliciesExpiringSoon(30)) {
            System.out.println(policy);
        }

        System.out.println("\nPolicies for John Doe:");
        for (InsurancePolicy policy : manager.getPoliciesByHolder("John Doe")) {
            System.out.println(policy);
        }

        System.out.println("\nRemoving Expired Policies...");
        manager.removeExpiredPolicies();
    }
}
