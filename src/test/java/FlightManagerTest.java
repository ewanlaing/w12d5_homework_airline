import org.junit.Before;
import org.junit.Test;

import java.time.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;

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

    private LocalTime time1;
    private LocalTime time2;

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
        passenger1 = new Passenger("Ewan", numberOfBags.TWO);
        passenger2 = new Passenger("Josie", numberOfBags.ONE);
        time1 = LocalTime.of(14, 0);
        time2 = LocalTime.of(6,0);
        flight = new Flight(pilot, crewMembers, plane, "NUMBER1", Location.EDI, Location.GLA, time1);
        flight2 = new Flight(pilot, crewMembers, plane2, "NUMBER1", Location.EDI, Location.GLA, time2);
        flightManager = new FlightManager(flight2);
    }

    @Test
    public void canGetBaggageWeightPerPassenger(){
        assertEquals(2.5, flightManager.baggageWeightPerPassenger(), 0.01);
    }

    @Test
    public void canShowCurrentWeightBooked(){
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        assertEquals(3.75, flightManager.baggageWeightBooked(), 0.001);
    }

    @Test
    public void canShowRemainingBaggageWeight(){
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        assertEquals(21.25, flightManager.baggageWeightRemaining(), 0.001);
    }
}
