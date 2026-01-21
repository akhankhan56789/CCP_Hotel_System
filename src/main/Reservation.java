package src.main;

import java.util.Date;

public class Reservation {
    private Date startDate;
    private Date endDate;
    private int number;
    private ReserverPayer payer;
    private Room room;

    public Reservation(Date start, Date end, int num, ReserverPayer payer, Room room) {
        if (start == null || end == null || start.after(end)) {
            throw new IllegalArgumentException("Check-out date must be after check-in.");
        }
        this.startDate = start;
        this.endDate = end;
        this.number = num;
        this.payer = payer;
        this.room = room;
    }

    public void create() {
        
        if (payer != null && room != null) {
            System.out.println("Reservation " + number + " created for dates: " + startDate + " to " + endDate);
        }
    }

    public String getConfirmation() {
        return "CONF-" + number;
    }
}