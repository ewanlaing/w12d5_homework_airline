import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before (){
        cabinCrewMember = new CabinCrewMember("Jeff", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetName(){
        assertEquals("Jeff", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Fasten your seatbelts!", cabinCrewMember.relayMessage());
    }
}
