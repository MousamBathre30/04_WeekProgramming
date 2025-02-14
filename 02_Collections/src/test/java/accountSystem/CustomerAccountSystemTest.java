package accountSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Queue;


class CustomerAccountSystemTest {

    private CustomerAccountSystem system;

    @BeforeEach
    void setUp() {
        // Initialize the system before each test
        system = new CustomerAccountSystem();
        system.addAccount("A123", 500.0);
        system.addAccount("B456", 300.0);
        system.addAccount("C789", 700.0);
    }

    @Test
    void testAddAccount() {
        system.addAccount("D012", 1000.0);
        assertEquals(4, system.accountMap.size());
        assertEquals(1000.0, system.accountMap.get("D012"));
    }

    @Test
    void testWithdrawSuccess() {
        boolean result = system.withdraw("A123", 100.0);
        assertTrue(result, "Withdrawal should be successful.");
        assertEquals(400.0, system.accountMap.get("A123"));
    }

    @Test
    void testWithdrawFailureInsufficientBalance() {
        boolean result = system.withdraw("B456", 350.0);
        assertFalse(result, "Withdrawal should fail due to insufficient balance.");
        assertEquals(300.0, system.accountMap.get("B456"));
    }

    @Test
    void testWithdrawFailureAccountNotFound() {
        boolean result = system.withdraw("XYZ", 100.0);
        assertFalse(result, "Withdrawal should fail due to account not found.");
    }

    @Test
    void testProcessWithdrawalRequests() {
        system.processWithdrawalRequest("A123");
        system.processWithdrawalRequest("B456");

        // We need to test withdrawal logic after processing requests
        system.processWithdrawals();

        // Check if balances are updated correctly after withdrawal
        assertEquals(450.0, system.accountMap.get("A123"));
        assertEquals(250.0, system.accountMap.get("B456"));
    }



    @Test
    void testQueueProcessing() {
        Queue<String> queue = system.withdrawalQueue;
        system.processWithdrawalRequest("A123");
        system.processWithdrawalRequest("B456");

        // Test if withdrawal requests are processed in FIFO order
        assertEquals("A123", queue.poll());  // First request should be for "A123"
        assertEquals("B456", queue.poll());  // Second request should be for "B456"
    }
}
