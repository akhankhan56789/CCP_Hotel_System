package src.main;

public class Main {
    public static void main(String[] args) {
        // Bina "M." ke name rakha hai taake test match karein
        ReserverPayer payer = new ReserverPayer("Arbaz Khan", 5000.0);
        RoomType roomType = new RoomType("Executive Suite", 2500.0);
        Room myRoom = new Room(786);

        System.out.println("MAK Hotel Management System");
        System.out.println("---------------------------");
        System.out.println("Reserver Name: " + payer.getPayerName());
        System.out.println("Hotel Name: MAK Hotel");
        System.out.println("Room Number: " + myRoom.getNumber());
        System.out.println("Room Type: " + roomType.getKind());
        System.out.println("Total Cost: " + roomType.getCost());
        System.out.println("---------------------------");
    }
}