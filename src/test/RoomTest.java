package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.Room;

public class RoomTest {
    @Test
    void testRoomNumber() {
        Room r = new Room(786);
        assertEquals(786, r.getRoomNumber());
    }

    @Test
    void testRoomOccupancy() {
        Room r = new Room(786);
        assertFalse(r.isOccupied());
        r.setOccupied(true);
        assertTrue(r.isOccupied());
    }
}