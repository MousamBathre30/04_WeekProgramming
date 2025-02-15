package bankaccountsystem;


class InsufficientFundsException extends Exception{
    private double amount;
    public InsufficientFundsException(String message , double amount){
        super(message);
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
class IllegalArgumentException extends Exception{
    private double amount;
    public IllegalArgumentException(String message , double amount){
        super(message);
        this.amount = amount;
    }

}

public class BankAccountManagementSystem {
    private double balance;

    public BankAccountManagementSystem(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposite(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException {
        if(amount > balance){
            throw  new InsufficientFundsException("Insufficient funds withdrawal" , amount-balance);
        } else if(amount < 0){
            throw new IllegalArgumentException("Invalid amound" , amount);
        }else{
            System.out.println( "Withdrawal successful, new balance: X");
        }
        balance -= amount;

    }
    public double getBalance(){
        return  balance;
    }

    public static void main(String [] args) {
        BankAccountManagementSystem account = new BankAccountManagementSystem(100);

        try{
            System.out.println("Depositing 50");
            account.deposite(50);
            System.out.println("New Balance " + account.getBalance());
            System.out.println("Withdraw 200 ");
            account.withdraw(-1);
            System.out.println("New Balance " + account.getBalance());

        } catch (InsufficientFundsException e){
            System.out.println("Exception " + e.getMessage());

        } catch (IllegalArgumentException e){
            System.out.println("Invalid amount!" + e.getMessage());
        }
    finally {
            System.out.println("Operation completed ");
        }
    }
}
