package src.main;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Guest Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Year: ");
            int yr = sc.nextInt();
            System.out.print("Month (1-12): ");
            int mon = sc.nextInt() - 1;
            System.out.print("Check-in Day: ");
            int d1 = sc.nextInt();
            System.out.print("Check-out Day: ");
            int d2 = sc.nextInt();

            if (d1 >= d2) {
                System.out.println("Validation Error: Check-out must be after check-in.");
                return;
            }

            Hotel hotel = new Hotel("MAK Hotel");
            if (hotel.available()) {
                HotelChain chain = new HotelChain();
                chain.createReserverPayer();

                Guest guest = new Guest(name, address);
                guest.create();

                Room room = new Room(786, new RoomType("Suite", 2000.0));
                room.setOccupant(guest);
                room.createGuest();

                Calendar cal = Calendar.getInstance();
                cal.setLenient(false);
                cal.set(yr, mon, d1);
                Date start = cal.getTime();
                cal.set(yr, mon, d2);
                Date end = cal.getTime();

                hotel.createReservation();
                Reservation res = new Reservation(start, end, 505, new ReserverPayer(name, 500.0, "P-1", "CC-1"), room);
                res.create();

                System.out.println("\n>>> SUCCESS: Logged for " + name);
            }
        } catch (Exception e) {
            System.out.println("System Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}