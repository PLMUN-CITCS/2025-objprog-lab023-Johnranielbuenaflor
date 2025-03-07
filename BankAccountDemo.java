// BankAccount class definition
class BankAccount {
    // Attributes with different access modifiers
    public String accountHolder;  // Public: accessible anywhere
    private double balance;       // Private: accessible only within this class
    protected String accountType; // Protected: accessible within the same package and subclasses

    // Constructor to initialize account details
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money (only if positive)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money (only if positive and within available balance)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to get the current balance (providing controlled access to private balance)
    public double getBalance() {
        return balance;
    }
}

// Main class
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount object and initialize it
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Perform deposit and withdrawal transactions
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);

        // Print account details
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
