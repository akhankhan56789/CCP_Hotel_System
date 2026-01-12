package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.Hotel;

public class HotelTest {
    @Test
    void testHotelName() {
        Hotel h = new Hotel("MAK Hotel");
        assertEquals("MAK Hotel", h.getHotelName());
    }

    @Test
    void testHotelNotNull() {
        Hotel h = new Hotel("MAK Hotel");
        assertNotNull(h.getHotelName());
    }
}