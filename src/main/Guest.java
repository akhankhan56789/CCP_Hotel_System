package src.main;

public class Guest {
    private String name;
    private String addressDetails;

    public Guest(String name, String addressDetails) {
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public void create() {
        System.out.println("Guest " + name + " created with address: " + addressDetails);
    }

    public String getName() { return name; }
    public String getContact() { return addressDetails; }
}