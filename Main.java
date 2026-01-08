public class Main {
    public static void main(String[] args) {
        Hotel myHotel = new Hotel("MAK Hotel");
        Room r1 = new Room(101);
        Guest g1 = new Guest("Arbaz", "G59290");

        System.out.println("Attempting to book Room 101 for Guest: " + g1.getName());
        
        myHotel.addRoom(r1);
        myHotel.createReservation(r1, g1); 

        System.out.println("Room 101 Occupied Status: " + r1.isOccupied());
        System.out.println("Program successfully running!");
    }
}