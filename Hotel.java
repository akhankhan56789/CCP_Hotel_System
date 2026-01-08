import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms; 

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        }
    }

    public void createReservation(Room room, Guest guest) {
        if (room == null || guest == null) {
            System.out.println("Error: Room or Guest cannot be null.");
            return;
        }
        
        room.setOccupied(true); 
        // Hotel name "MAK" yahan print hoga aur warning khatam ho jayegi
        System.out.println("Reservation Created at " + this.name + ": Guest " + guest.getName() + 
                           " booked Room " + room.getRoomNumber());
    }
}