import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Alex", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Alex", passenger.getName());
    }

    @Test
    public void checkNoOfBags(){
        assertEquals(5, passenger.getNoOfBags());
    }
}
