import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(20, plane.getPlaneType().getCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(100, plane.getPlaneType().getTotalWeight(), 0.001);
    }

    @Test
    public void canGetSeats(){
        assertEquals(20, plane.getSeats().get(19), 0.01);
    }
}
