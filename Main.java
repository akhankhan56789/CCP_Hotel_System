public class Main {
    public static void main(String[] args) {
        // Objects banana [cite: 64]
        Hotel myHotel = new Hotel("MAK Hotel");
        Room r1 = new Room(101);

        // Interaction dikhana [cite: 65]
        myHotel.addRoom(r1);
        myHotel.createReservation();

        System.out.println("Program successfully running!");
    }
}