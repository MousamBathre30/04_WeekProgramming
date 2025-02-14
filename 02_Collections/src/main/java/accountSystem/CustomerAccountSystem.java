package accountSystem;

import java.util.*;

public class CustomerAccountSystem {

     Map<String, Double> accountMap;  // Stores customer accounts (AccountNumber -> Balance)
     Queue<String> withdrawalQueue;   // Queue to process withdrawal requests

    public CustomerAccountSystem() {
        accountMap = new HashMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Add customer account
    public void addAccount(String accountNumber, double balance) {
        accountMap.put(accountNumber, balance);
    }

    // Process withdrawal request by adding to the queue
    public void processWithdrawalRequest(String accountNumber) {
        withdrawalQueue.offer(accountNumber);
    }

    // Perform withdrawal
    public boolean withdraw(String accountNumber, double amount) {
        if (accountMap.containsKey(accountNumber) && accountMap.get(accountNumber) >= amount) {
            double newBalance = accountMap.get(accountNumber) - amount;
            accountMap.put(accountNumber, newBalance);
            return true;
        }
        return false;  // Insufficient balance or account not found
    }

    // Display customers sorted by balance (ascending order)
    public void displaySortedByBalance() {
        // Using TreeMap to sort by balance
        Map<String, Double> sortedByBalance = new TreeMap<>(Comparator.comparing(accountMap::get));
        sortedByBalance.putAll(accountMap);

        System.out.println("Customers Sorted by Balance:");
        for (Map.Entry<String, Double> entry : sortedByBalance.entrySet()) {
            System.out.println("Account Number: " + entry.getKey() + " -> Balance: " + entry.getValue());
        }
    }

    // Process withdrawal requests in order (FIFO)
    public void processWithdrawals() {
        System.out.println("\nProcessing Withdrawal Requests:");
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account Number: " + accountNumber);
            // For this example, we perform a mock withdrawal of 50
            boolean success = withdraw(accountNumber, 50);
            if (success) {
                System.out.println("Withdrawal Successful for Account: " + accountNumber);
            } else {
                System.out.println("Withdrawal Failed (Insufficient Balance or Account Not Found) for Account: " + accountNumber);
            }
        }
    }

    public static void main(String[] args) {
        CustomerAccountSystem system = new CustomerAccountSystem();

        // Adding customer accounts
        system.addAccount("A123", 500.0);
        system.addAccount("B456", 300.0);
        system.addAccount("C789", 700.0);

        // Process withdrawal requests
        system.processWithdrawalRequest("A123");
        system.processWithdrawalRequest("B456");

        // Display customers sorted by balance
        system.displaySortedByBalance();

        // Process withdrawal requests
        system.processWithdrawals();
    }
}
