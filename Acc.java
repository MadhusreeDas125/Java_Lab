abstract class Accounts {
    double balance;
    String accountNumber;
    String accountHoldersName;
    String address;

    Accounts(String accNo, String name, double bal) {
        this.accountNumber = accNo;
        this.accountHoldersName = name;
        this.balance = bal;
    }

    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("Account: " + accountNumber + " | Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(String accNo, String name, double bal, double roi) {
        super(accNo, name, bal);
        this.rateOfInterest = roi;
    }

    @Override
    void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void calculateAmount() {
        double interest = balance * (rateOfInterest / 100);
        balance += interest;
        System.out.println("Interest added. New balance: " + balance);
    }
}