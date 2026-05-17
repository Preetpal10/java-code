class ATM {

    private int balance = 1000;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class ATM1 {

    public static void main(String[] args) {

        ATM a = new ATM();

        a.deposit(500);

        a.withdraw(300);

        a.checkBalance();
    }
}