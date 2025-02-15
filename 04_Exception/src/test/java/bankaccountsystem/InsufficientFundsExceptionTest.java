package bankaccountsystem;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountManagementSystemTest {

    @Test
    void testDeposit() {
        BankAccountManagementSystem account = new BankAccountManagementSystem(100);
        account.deposite(50);
        assertEquals(150, account.getBalance(), "Balance should be 150 after depositing 50.");
    }

    @Test
    void testValidWithdrawal() throws InsufficientFundsException, IllegalArgumentException {
        BankAccountManagementSystem account = new BankAccountManagementSystem(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance(), "Balance should be 150 after withdrawing 50.");
    }

    @Test
    void testInsufficientFundsWithdrawal() {
        BankAccountManagementSystem account = new BankAccountManagementSystem(100);
        Exception exception = assertThrows(InsufficientFundsException.class, () -> {
            account.withdraw(200);
        });

        assertEquals("Insufficient funds withdrawal", exception.getMessage());
    }

    @Test
    void testNegativeWithdrawal() {
        BankAccountManagementSystem account = new BankAccountManagementSystem(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-10);
        });

        assertEquals("Invalid amound", exception.getMessage());
    }
}
