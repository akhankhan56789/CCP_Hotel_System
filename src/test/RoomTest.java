package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.*;

public class RoomTest {
    @Test
    void testRoomOccupancy() {
        Room room = new Room(786, new RoomType("Executive", 2500.0));
        Guest guest = new Guest("Arbaz", "Karachi");
        
        assertFalse(room.isOccupied()); // Initial check
        room.setOccupant(guest);
        assertTrue(room.isOccupied()); // Ab error nahi aayega
    }
}