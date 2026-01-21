package src.test;

import org.junit.jupiter.api.Test;
import src.main.HotelChain;

public class HotelChainTest {
    @Test
    void testChainOperations_ShouldExecuteUMLMethods() {
        // Arrange
        HotelChain chain = new HotelChain();

        // Act & Assert
        chain.createReserverPayer();
        chain.makeReservation();
    }
}