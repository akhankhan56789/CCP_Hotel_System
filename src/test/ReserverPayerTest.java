package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.ReserverPayer;

public class ReserverPayerTest {
    @Test
    void testPayerName() {
        ReserverPayer p = new ReserverPayer("Arbaz Khan", 5000.0);
        assertEquals("Arbaz Khan", p.getPayerName());
    }

    @Test
    void testPayerBalance() {
        ReserverPayer p = new ReserverPayer("Arbaz Khan", 5000.0);
        assertEquals(5000.0, p.getBalance());
    }
}