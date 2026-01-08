/**
 * Developed by: Muhammad Arbaz Khan
 */
public class Reservation {
    private String reservationId;
    private Guest guest;
    private Room room;

    public Reservation(String id, Guest guest, Room room) {
        
        if (id == null || id.isEmpty() || guest == null || room == null) {
            throw new IllegalArgumentException("Reservation details cannot be empty or null");
        }
        this.reservationId = id;
        this.guest = guest;
        this.room = room;
    }

    public void displayReservation() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Guest: " + guest.getName());
        System.out.println("Room Number: " + room.getRoomNumber());
    }
}