/**
 * Unit Test by: Muhammad Arbaz Khan
 * Student ID: 59290
 * Style: AAA (Arrange, Act, Assert)
 */
public class RoomTest {
    public static void main(String[] args) {
        testRoomCreationSuccess();
        testRoomCreationFailure();
    }

    public static void testRoomCreationSuccess() {
       
        int validNumber = 105;

       
        Room room = new Room(validNumber);

        
        if (room.getRoomNumber() == 105) {
            System.out.println("Test Room Creation Success: PASSED ✅");
        } else {
            System.out.println("Test Room Creation Success: FAILED ❌");
        }
    }

    public static void testRoomCreationFailure() {
       
        int invalidNumber = -1;

        
        try {
            new Room(invalidNumber);
            System.out.println("Test Defensive Programming: FAILED ❌ (Should have thrown error)");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Defensive Programming: PASSED ✅ (Caught invalid input)");
        }
    }
}