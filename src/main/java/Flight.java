import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Location destination;
    private Location departure;
    private LocalTime departureTime;

    private FlightManager flightManager;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crewMembers, Plane plane, String flightNumber, Location destination, Location departure, LocalTime departureTime) {
        this.pilot = pilot;
        this.crewMembers = crewMembers;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Location getDestination() {
        return destination;
    }

    public Location getDeparture() {
        return departure;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public int getRemainingSeats() {
        return this.plane.getPlaneType().getCapacity() - this.passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        flightManager = new FlightManager(this);
        if (this.getRemainingSeats() > 0) {
            this.passengers.add(passenger);
            passenger.setFlight(this);
        }
    }
}
