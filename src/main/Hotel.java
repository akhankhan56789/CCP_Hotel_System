package src.main;

public class Hotel {
    private String name;

    public Hotel(String name) {
        this.name = name;
    }

    public boolean available() {
        return true; 
    }

    public void createReservation() {
        System.out.println("Processing reservation in " + name + "...");
    }
}