import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Ofori", "Captain", "AL111A");
    }

    @Test
    public void hasName(){
        assertEquals("Ofori", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void hasLicenceNo(){
        assertEquals("AL111A", pilot.getLicenceNo());
    }

    @Test
    public void canFly(){
        assertEquals("I believe I can fly", pilot.getCanFly());
    }
}
