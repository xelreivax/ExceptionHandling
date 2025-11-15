package handle6;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsBalanceEx {
        if (amount > balance) {
            throw new InsBalanceEx("Insufficient funds!");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
