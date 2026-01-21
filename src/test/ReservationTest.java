package src.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.*;
import java.util.Date;

public class ReservationTest {
    @Test
    void testReservationCreation_ValidData_ReturnsConfirmation() {
        // Arrange
        ReserverPayer payer = new ReserverPayer("User", 100.0, "ID-1", "CC-1");
        Room room = new Room(101, new RoomType("Standard", 50.0));
        Date d = new Date();

        // Act
        Reservation res = new Reservation(d, d, 999, payer, room);

        // Assert
        assertNotNull(res.getConfirmation());
        assertEquals("CONF-999", res.getConfirmation());
    }
}