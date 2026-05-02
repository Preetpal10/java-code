class BankAccount {
    private double balance;  

    
    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    
    public double getBalance() {
        return balance;
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);

        acc.deposit(2000);
        acc.withdraw(1000);

        System.out.println("Current Balance: " + acc.getBalance());
    }
}