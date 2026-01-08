import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms; // Hotel aur Room ka relationship 

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void createReservation() {
        System.out.println("Creating reservation at " + name);
    }
}