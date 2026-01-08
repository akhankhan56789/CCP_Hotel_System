public class Room {
    private int number; // UML mein 'number' attribute hai 

    // Constructor: Jab naya room banayenge toh ye check karega ke data sahi hai
    public Room(int number) {
        if (number <= 0) {
            // Teacher ki requirement: Defensive programming [cite: 24, 25]
            throw new IllegalArgumentException("Room number must be positive");
        }
        this.number = number;
    }

    public int getNumber() { return number; }

    // UML Method 
    public void createGuest() {
        System.out.println("Guest created for Room: " + number);
    }
}