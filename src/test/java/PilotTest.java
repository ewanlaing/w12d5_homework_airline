import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Sarah", Rank.CAPTAIN, "2GOOD2FAIL");
    }

    @Test
    public void canGetName(){
        assertEquals("Sarah", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetLicenceNum(){
        assertEquals("2GOOD2FAIL", pilot.getLicenceNum());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Liftoff!", pilot.flyPlane());
    }
}
