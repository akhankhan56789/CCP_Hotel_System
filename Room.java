public class Room {
    private int number; 
    private boolean isOccupied; 

    public Room(int number) {
      
        if (number <= 0) {
            throw new IllegalArgumentException("Room number must be positive");
        }
        this.number = number;
        this.isOccupied = false; 
    }

    
    public int getNumber() { return number; }
    public int getRoomNumber() { return number; }

    
    public boolean isOccupied() {
        return isOccupied;
    }

    
    public void setOccupied(boolean status) {
        this.isOccupied = status;
    }

    public void createGuest() {
        System.out.println("Guest created for Room: " + number);
    }
}