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
        // 1. Arrange (Setup data)
        int validNumber = 105;

        // 2. Act (Execute the code)
        Room room = new Room(validNumber);

        // 3. Assert (Check if it works)
        if (room.getNumber() == 105) {
            System.out.println("Test Room Creation Success: PASSED ✅");
        } else {
            System.out.println("Test Room Creation Success: FAILED ❌");
        }
    }

    public static void testRoomCreationFailure() {
        // Arrange
        int invalidNumber = -1;

        // Act & Assert (Testing Defensive Programming)
        try {
            new Room(invalidNumber);
            System.out.println("Test Defensive Programming: FAILED ❌ (Should have thrown error)");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Defensive Programming: PASSED ✅ (Caught invalid input)");
        }
    }
}