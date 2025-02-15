package advancedproblems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractProgrammingLanguageTest {

    @Test
    @DisplayName("Test for programming language")
    void testProgrammingLanguage(){
        assertEquals("Java Python javaScript Go " , ExtractProgrammingLanguage.extractProgramming());
    }

    static class BankAccountTest {

        @Test
        void testDepositeForTrue(){
            assertEquals("Deposite Done" , ExtractProgrammingLanguage.BankAccount.deposite(100));
        }
        @Test
        void testDepositeForFalse(){
            assertEquals("Amount is less then 0" , ExtractProgrammingLanguage.BankAccount.deposite(-100));
        }
        @Test
        void testWithdrowTrue(){
            double amount = 100;
            assertEquals(ExtractProgrammingLanguage.BankAccount.getBalance()-amount , ExtractProgrammingLanguage.BankAccount.withdraw(amount));
        }

        @Test
        void testWithdrowFalse(){
            assertEquals(0, ExtractProgrammingLanguage.BankAccount.withdraw(100));
        }



    }
}