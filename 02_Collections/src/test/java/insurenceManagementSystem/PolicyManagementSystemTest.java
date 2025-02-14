package insurenceManagementSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.*;

class PolicyManagementSystemTest {

    @Test
    void testAddAndRetrievePolicies() {
        PolicyManagementSystem system = new PolicyManagementSystem();

        InsurancePolicy policy1 = new InsurancePolicy("P001", "John Doe", new Date(2025, 5, 20), "Health", 1000.0);
        InsurancePolicy policy2 = new InsurancePolicy("P002", "Jane Smith", new Date(2025, 4, 15), "Auto", 1200.0);

        system.addPolicy(policy1);
        system.addPolicy(policy2);

        assertEquals(2, system.hashSet.size());
    }

    @Test
    void testDuplicatePolicies() {
        PolicyManagementSystem system = new PolicyManagementSystem();

        InsurancePolicy policy1 = new InsurancePolicy("P001", "John Doe", new Date(2025, 5, 20), "Health", 1000.0);
        InsurancePolicy duplicatePolicy = new InsurancePolicy("P001", "John Doe", new Date(2025, 5, 20), "Health", 1000.0);

        system.addPolicy(policy1);
        system.addPolicy(duplicatePolicy);

        assertEquals(1, system.hashSet.size()); // HashSet ensures uniqueness
    }

    @Test
    void testFilterByCoverageType() {
        PolicyManagementSystem system = new PolicyManagementSystem();

        InsurancePolicy policy1 = new InsurancePolicy("P001", "John Doe", new Date(2025, 5, 20), "Health", 1000.0);
        InsurancePolicy policy2 = new InsurancePolicy("P002", "Jane Smith", new Date(2025, 4, 15), "Auto", 1200.0);

        system.addPolicy(policy1);
        system.addPolicy(policy2);

        // Check if filtering works
        system.displayByCoverageType("Health"); // Should display only policy1
    }

    @Test
    void testExpiringSoon() {
        PolicyManagementSystem system = new PolicyManagementSystem();

        Date today = new Date();
        Date expiringSoon = new Date(today.getTime() + (1000 * 60 * 60 * 24 * 10)); // 10 days ahead
        InsurancePolicy policy = new InsurancePolicy("P003", "Alice Brown", expiringSoon, "Home", 800.0);

        system.addPolicy(policy);
        system.displayExpiringSoon(); // Should include the policy
    }
}
