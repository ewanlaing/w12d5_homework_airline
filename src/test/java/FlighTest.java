import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlighTest {

    private Flight flight;
    private Flight flight2;
    private Pilot pilot;
    private CabinCrewMember crewMember1;
    private CabinCrewMember crewMember2;
    private CabinCrewMember crewMember3;
    private ArrayList<CabinCrewMember> crewMembers;
    private Plane plane;
    private Plane plane2;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before() {
        pilot = new Pilot("Sarah", Rank.CAPTAIN, "2GOOD2FAIL");
        crewMember1 = new CabinCrewMember("Jeff", Rank.FLIGHT_ATTENDANT);
        crewMember2 = new CabinCrewMember("Bert", Rank.FLIGHT_ATTENDANT);
        crewMember3 = new CabinCrewMember("Jill", Rank.PURSER);
        crewMembers = new ArrayList<>();
        crewMembers.add(crewMember1);
        crewMembers.add(crewMember2);
        crewMembers.add(crewMember3);
        plane = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.CONCORDE);
        passenger1 = new Passenger("Ewan", 2);
        passenger2 = new Passenger("Josie", 4);
        flight = new Flight(pilot, crewMembers, plane, "NUMBER1", Location.EDI, Location.GLA, "2pm");
        flight2 = new Flight(pilot, crewMembers, plane2, "NUMBER1", Location.EDI, Location.GLA, "2pm");
    }

    @Test
    public void hasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void hasCrew(){
        assertEquals(crewMembers, flight.getCrewMembers());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("NUMBER1", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals(Location.EDI, flight.getDestination());
    }

    @Test
    public void hasDeparture(){
        assertEquals(Location.GLA, flight.getDeparture());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("2pm", flight.getDepartureTime());
    }

    @Test
    public void canReturnRemainingSeats(){
        assertEquals(20, flight.getRemainingSeats());
    }

    @Test
    public void canBookPassengers(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(18, flight.getRemainingSeats());
    }

    @Test
    public void cannotBookPassengersIfFull(){
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        assertEquals(10, flight2.getPassengers().size());
    }
}
