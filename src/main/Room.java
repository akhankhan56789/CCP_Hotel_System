package src.main;

public class Room {
    private int number;
    private RoomType roomType;
    private Guest occupant;

    public Room(int number, RoomType roomType) {
        if (number <= 0 || roomType == null) {
            throw new IllegalArgumentException("Invalid room configuration.");
        }
        this.number = number;
        this.roomType = roomType;
    }

    public void createGuest() {
        
        System.out.println("Room " + number + " linked to guest record.");
    }

    public void setOccupant(Guest guest) {
        this.occupant = guest;
    }

    public boolean isOccupied() {
        return occupant != null;
    }

    public RoomType getRoomType() {
        return roomType; 
    }
}