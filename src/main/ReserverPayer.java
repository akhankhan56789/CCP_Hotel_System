package src.main;

public class ReserverPayer {
    private String name;
    private double balance;
    private String id;
    private String creditCardDetails;

    public ReserverPayer(String name, double balance, String id, String card) {
        this.name = name;
        this.balance = balance;
        this.id = id;
        this.creditCardDetails = card;
    }

    public String getPayerName() { return name; }
    public String getId() { return id; }
    public double getBalance() { return balance; }
    public String getCreditCardDetails() { return creditCardDetails; }
}