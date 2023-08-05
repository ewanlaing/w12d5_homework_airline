import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Flight flight;
    private Flight flight2;
    private Pilot pilot;
    private CabinCrewMember crewMember1;
    private CabinCrewMember crewMember2;
    private CabinCrewMember crewMember3;
    private ArrayList<CabinCrewMember> crewMembers;
    private Plane plane;
    private Plane plane2;
    private Passenger passenger;
    private LocalTime time1;
    private LocalTime time2;


    @Before
    public void before(){

        passenger = new Passenger("Ewan", numberOfBags.TWO);
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
        time1 = LocalTime.of(14, 0);
        time2 = LocalTime.of(6, 0);
        flight = new Flight(pilot, crewMembers, plane, "NUMBER1", Location.EDI, Location.GLA, time1);
        flight2 = new Flight(pilot, crewMembers, plane2, "NUMBER1", Location.EDI, Location.GLA, time2);;
    }

    @Test
    public void canGetName(){
        assertEquals("Ewan", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canGetFlightFromPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(flight, passenger.getFlight());
    }



}
