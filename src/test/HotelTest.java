package src.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.*;

public class HotelTest {
    @Test
    void testHotelAvailability() {
        // Sirf aik baar initialize karein
        Hotel hotel = new Hotel("MAK Hotel");
        
        // UML methods test karein
        assertTrue(hotel.available());
        hotel.createReservation();
    }
}