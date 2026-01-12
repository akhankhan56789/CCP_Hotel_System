package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.HotelChain;
import src.main.Hotel;

public class HotelChainTest {
    @Test
    void testChainSize() {
        HotelChain hc = new HotelChain();
        hc.addHotel(new Hotel("MAK Hotel"));
        assertEquals(1, hc.getChainSize());
    }

    @Test
    void testEmptyChain() {
        HotelChain hc = new HotelChain();
        assertEquals(0, hc.getChainSize());
    }
}