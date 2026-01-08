public class Guest {
    private String name;
    private String guestID; 

    
    public Guest(String name, String guestID) {
       
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest name cannot be empty");
        }
        if (guestID == null || guestID.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest ID cannot be empty");
        }
        
        this.name = name;
        this.guestID = guestID;
    }

    
    public String getName() { 
        return name; 
    }

    public String getGuestID() { 
        return guestID; 
    }
}