package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.ReserverPayer;

public class ReserverPayerTest {
    @Test
    void testPayerConstructor() {
        ReserverPayer rp = new ReserverPayer("Arbaz", 100.0, "CNIC-001", "VISA-999");
        assertEquals("Arbaz", rp.getPayerName());
        assertEquals("CNIC-001", rp.getId());
    }
}