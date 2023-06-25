import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {

    CrewMember crewMember;

    @Before
    public void before() {
        crewMember = new CrewMember("Ben","Captain", 5 );
    }

    @Test
    public void hasName(){
        assertEquals("Ben", crewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Captain", crewMember.getRank());
    }

    @Test
    public void instruction(){
        assertEquals("Fasten your seat belts", crewMember.getInstruction());
    }

}
