class Bank {

    private int balance = 1000;

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class bank1 {

    public static void main(String[] args) {

        Bank b = new Bank();

        b.deposit(500);

        System.out.println("Balance: " + b.getBalance());
    }
}