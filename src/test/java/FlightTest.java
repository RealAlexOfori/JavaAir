import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Passenger passenger;

    @Before
    public void before(){
        flight = new Flight("BA111","Ghana", "Edinburgh", "11.30",
                2000,100);
        passenger = new Passenger("Frank",3);

    }

    @Test
    public void getAvailableSeats(){
        assertEquals(100, flight.getAvailableSeats());
    }

    @Test
    public void bookPassengerToFlight(){
        flight.bookPassenger(passenger);
        assertEquals(99, flight.getAvailableSeats());
    }
}
