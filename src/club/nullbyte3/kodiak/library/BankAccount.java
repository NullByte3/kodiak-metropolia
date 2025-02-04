package club.nullbyte3.kodiak.library;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private static int totalAccounts = 0;

    public BankAccount(double initialBalance) {
        this.accountNumber = ++totalAccounts;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
