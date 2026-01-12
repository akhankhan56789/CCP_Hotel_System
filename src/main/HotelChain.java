package src.main;
import java.util.ArrayList;
import java.util.List;

public class HotelChain {
    private List<Hotel> hotels = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public int getChainSize() {
        return hotels.size();
    }
}