package src.main;

public class ReserverPayer {
    private String payerName;
    private double balance;

    public ReserverPayer(String name, double initialBalance) {
        this.payerName = name;
        this.balance = initialBalance;
    }

    public String getPayerName() { return payerName; }
    public double getBalance() { return balance; }
}