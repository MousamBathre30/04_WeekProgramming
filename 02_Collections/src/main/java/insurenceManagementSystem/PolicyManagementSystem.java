package insurenceManagementSystem;
import java.util.*;

public class PolicyManagementSystem {
     Set<InsurancePolicy> hashSet = new HashSet<>();
     Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
     Set<InsurancePolicy> treeSet = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("\nAll Policies (HashSet - Unordered):");
        hashSet.forEach(System.out::println);

        System.out.println("\nAll Policies (LinkedHashSet - Insertion Order):");
        linkedHashSet.forEach(System.out::println);

        System.out.println("\nAll Policies (TreeSet - Sorted by Expiry Date):");
        treeSet.forEach(System.out::println);
    }

    public void displayExpiringSoon() {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date threshold = cal.getTime();

        System.out.println("\nPolicies Expiring Soon (Within 30 days):");
        treeSet.stream()
                .filter(policy -> policy.getExpiryDate().before(threshold))
                .forEach(System.out::println);
    }

    public void displayByCoverageType(String type) {
        System.out.println("\nPolicies with Coverage Type: " + type);
        hashSet.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    public void findDuplicatePolicies() {
        Map<String, Integer> policyCount = new HashMap<>();
        for (InsurancePolicy policy : hashSet) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        System.out.println("\nDuplicate Policies:");
        policyCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Policy Number: " + entry.getKey()));
    }

    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();

        system.addPolicy(new InsurancePolicy("P123", "Alice", new Date(2025, 3, 10), "Health", 500.0));
        system.addPolicy(new InsurancePolicy("P456", "Bob", new Date(2025, 2, 15), "Auto", 1200.0));
        system.addPolicy(new InsurancePolicy("P789", "Charlie", new Date(2025, 1, 25), "Home", 800.0));
        system.addPolicy(new InsurancePolicy("P123", "Alice", new Date(2025, 3, 10), "Health", 500.0)); // Duplicate

        system.displayAllPolicies();
        system.displayExpiringSoon();
        system.displayByCoverageType("Auto");
        system.findDuplicatePolicies();
    }
}