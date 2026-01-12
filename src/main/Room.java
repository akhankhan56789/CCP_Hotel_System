package src.main;

public class Room {
    private int roomNumber;
    private boolean occupied;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.occupied = false;
    }

    public int getRoomNumber() { return roomNumber; }
    public int getNumber() { return roomNumber; }
    public boolean isOccupied() { return occupied; }
    public void setOccupied(boolean occupied) { this.occupied = occupied; }
    public void createGuest() {}
}